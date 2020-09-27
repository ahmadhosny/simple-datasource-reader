package com.mt.service;

import com.mt.model.Product;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

@Service
public class InitializationService {
  
  private final ProductService productService;
  
  @Autowired
  public InitializationService(ProductService productService) {
    this.productService = productService;
  }
  
  public void importCsvIntoDatabase() {
    Resource resource = new ClassPathResource("product_data.csv");
    List<Product> products;
    try {
      products =
          new CsvToBeanBuilder<Product>(new FileReader(resource.getFile()))
              .withType(Product.class)
              .build()
              .parse();
      
      productService.saveProducts(products);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
