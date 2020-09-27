package com.mt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.opencsv.bean.CsvBindByName;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Product
 */
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-18T07:56:50.341Z[GMT]")
@Entity
public class Product {
  @Id
  @JsonProperty("id")
  @CsvBindByName(column = "ID")
  private Integer id = null;
  
  @JsonProperty("name")
  @CsvBindByName(column = "NAME")
  private String name = null;
  
  @JsonProperty("price")
  @CsvBindByName(column = "PRICE")
  private Float price = null;
  
  @JsonProperty("oldPrice")
  @CsvBindByName(column = "OLD_PRICE")
  private Float oldPrice = null;
  
  @JsonProperty("stock")
  @CsvBindByName(column = "STOCK")
  private Integer stock = null;
  
  @JsonProperty("brand")
  @CsvBindByName(column = "BRAND")
  private String brand = null;
  
  public Product id(Integer id) {
    this.id = id;
    return this;
  }
  
  /**
   * Get id
   *
   * @return id
   **/
  @ApiModelProperty(example = "22704", required = true, value = "")
  @NotNull
  
  public Integer getId() {
    return id;
  }
  
  public void setId(Integer id) {
    this.id = id;
  }
  
  public Product name(String name) {
    this.name = name;
    return this;
  }
  
  /**
   * Get name
   *
   * @return name
   **/
  @ApiModelProperty(example = "Sony #1798446", required = true, value = "")
  @NotNull
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public Product price(Float price) {
    this.price = price;
    return this;
  }
  
  /**
   * Get price
   *
   * @return price
   **/
  @ApiModelProperty(example = "69.99", required = true, value = "")
  @NotNull
  
  public Float getPrice() {
    return price;
  }
  
  public void setPrice(Float price) {
    this.price = price;
  }
  
  public Product oldPrice(Float oldPrice) {
    this.oldPrice = oldPrice;
    return this;
  }
  
  /**
   * Get oldPrice
   *
   * @return oldPrice
   **/
  @ApiModelProperty(example = "69.99", value = "")
  
  public Float getOldPrice() {
    return oldPrice;
  }
  
  public void setOldPrice(Float oldPrice) {
    this.oldPrice = oldPrice;
  }
  
  public Product stock(Integer stock) {
    this.stock = stock;
    return this;
  }
  
  /**
   * Get stock
   *
   * @return stock
   **/
  @ApiModelProperty(example = "0", required = true, value = "")
  @NotNull
  
  public Integer getStock() {
    return stock;
  }
  
  public void setStock(Integer stock) {
    this.stock = stock;
  }
  
  public Product brand(String brand) {
    this.brand = brand;
    return this;
  }
  
  /**
   * Get brand
   *
   * @return brand
   **/
  @ApiModelProperty(example = "Sony", required = true, value = "")
  @NotNull
  
  public String getBrand() {
    return brand;
  }
  
  public void setBrand(String brand) {
    this.brand = brand;
  }
  
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.id, product.id) &&
        Objects.equals(this.name, product.name) &&
        Objects.equals(this.price, product.price) &&
        Objects.equals(this.oldPrice, product.oldPrice) &&
        Objects.equals(this.stock, product.stock) &&
        Objects.equals(this.brand, product.brand);
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(id, name, price, oldPrice, stock, brand);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    oldPrice: ").append(toIndentedString(oldPrice)).append("\n");
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  
  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
