package com.lichun.sakuragi.commons.utils;

import lombok.Data;

@Data
public class ResponseVO {
  private Object data;
  private int code;
  private String msg;

  public ResponseVO() {

  }

  public ResponseVO(Object data) {
    this.data = data;
  }
}
