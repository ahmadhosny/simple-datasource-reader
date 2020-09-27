package com.mt.api;

import javax.annotation.Generated;

@Generated(
    value = "io.swagger.codegen.v3.generators.java.SpringCodegen",
    date = "2020-09-18T07:56:50.341Z[GMT]")
public class ApiException extends Exception {
  private int code;
  
  public ApiException(int code, String msg) {
    super(msg);
    this.code = code;
  }
}
