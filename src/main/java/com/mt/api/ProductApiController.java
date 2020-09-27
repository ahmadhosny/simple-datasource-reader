package com.mt.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mt.model.Product;
import com.mt.service.ProductService;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Generated;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.List;

@Generated(
    value = "io.swagger.codegen.v3.generators.java.SpringCodegen",
    date = "2020-09-18T07:56:50.341Z[GMT]")
@Controller
public class ProductApiController implements ProductApi {
  
  private static final Logger log = LoggerFactory.getLogger(ProductApiController.class);
  
  private final ObjectMapper objectMapper;
  
  private final HttpServletRequest request;
  
  private final ProductService productService;
  
  @Autowired
  public ProductApiController(
      ObjectMapper objectMapper,
      HttpServletRequest request,
      ProductService productService) {
    this.objectMapper = objectMapper;
    this.request = request;
    this.productService = productService;
  }
  
  public ResponseEntity<List<Product>> getProducts(
      @Min(0)
      @ApiParam(
          value = "number of records to skip for pagination",
          allowableValues = "",
          defaultValue = "0")
      @Valid
      @RequestParam(value = "skip", required = false, defaultValue = "0")
          Integer skip,
      @Min(0)
      @Max(50)
      @ApiParam(
          value = "maximum number of records to return",
          allowableValues = "",
          defaultValue = "10")
      @Valid
      @RequestParam(value = "limit", required = false, defaultValue = "10")
          Integer limit) {
    String accept = request.getHeader("Accept");
    if (accept != null && accept.contains("application/json")) {
      try {
        return productService.getProducts(skip, limit);
      } catch (Exception e) {
        log.error("Couldn't serialize response for content type application/json", e);
        return new ResponseEntity<List<Product>>(HttpStatus.INTERNAL_SERVER_ERROR);
      }
    }
    
    return new ResponseEntity<List<Product>>(HttpStatus.NOT_IMPLEMENTED);
  }
}
