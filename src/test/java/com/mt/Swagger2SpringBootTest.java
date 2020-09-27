package com.mt;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Swagger2SpringBootTest {
  
  @Test
  public void contextLoads() {
    assertEquals(2, Integer.parseInt("2"));
  }
}
