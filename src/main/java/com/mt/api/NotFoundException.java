package com.mt.api;

import javax.annotation.Generated;

@Generated(
    value = "io.swagger.codegen.v3.generators.java.SpringCodegen",
    date = "2020-09-18T07:56:50.341Z[GMT]")
public class NotFoundException extends ApiException {
  private int code;
  
  public NotFoundException(int code, String msg) {
    super(code, msg);
    this.code = code;
  }
}
