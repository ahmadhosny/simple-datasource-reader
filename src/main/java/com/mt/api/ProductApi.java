/*
 * NOTE: This class is auto generated by the swagger code generator program (3.0.21).
 * https://github.com/swagger-api/swagger-codegen Do not edit the class manually.
 */
package com.mt.api;

import com.mt.model.Product;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.List;

@Generated(
    value = "io.swagger.codegen.v3.generators.java.SpringCodegen",
    date = "2020-09-18T07:56:50.341Z[GMT]")
@Api(value = "product", description = "the product API")
public interface ProductApi {
  
  @ApiOperation(
      value = "gets products data",
      nickname = "getProducts",
      notes = "gets products data",
      response = Product.class,
      responseContainer = "List",
      tags = {})
  @ApiResponses(
      value = {
          @ApiResponse(
              code = 200,
              message = "product list",
              response = Product.class,
              responseContainer = "List"),
          @ApiResponse(code = 400, message = "bad input parameter")
      })
  @RequestMapping(
      value = "/product",
      produces = {"application/json"},
      method = RequestMethod.GET)
  ResponseEntity<List<Product>> getProducts(
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
          Integer limit);
}
