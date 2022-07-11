package com.dtos;

import lombok.Data;

@Data
public class BaseResponse<E>{
    private String message;

    private int statusCode;

    private E data;
}
