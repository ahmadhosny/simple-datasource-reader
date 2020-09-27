package com.mt.service;

import com.mt.model.Product;
import com.mt.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
  
  private final ProductRepository productRepository;
  
  @Autowired
  public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }
  
  public ResponseEntity<List<Product>> getProducts(Integer skip, Integer limit) {
    List<Product> products;
    if (skip == 0 && limit == 0) {
      products = productRepository.findAll();
    } else {
      Pageable pageable = new PageRequest(skip, limit);
      products = productRepository.findAll(pageable).getContent();
    }
    
    return new ResponseEntity<>(products, HttpStatus.OK);
  }
  
  public void saveProducts(Iterable<Product> products) {
    productRepository.save(products);
  }
}
