package com.controller;

import com.dtos.BaseResponse;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/")
public class HomeController {
    @Get("/")
    @Produces(MediaType.APPLICATION_JSON)
    public HttpResponse<? extends Object> checkStatus() {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setStatusCode(HttpStatus.OK.getCode());
        return HttpResponse.ok(baseResponse);
    }
}
