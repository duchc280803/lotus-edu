package com.example.phieuthu.payload.Response;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Component;

import java.net.HttpURLConnection;
import java.net.http.HttpResponse;

@Component
public class ResponseObject<T> {
    private int Status;
    private String Message;
    private T data;

    public ResponseObject(int status, String message, T data) {
        Status = status;
        Message = message;
        this.data = data;
    }
    public  ResponseObject(){}
    public ResponseObject<T> responseSuccess(String message, T data){
        return new ResponseObject<T>(HttpURLConnection.HTTP_OK, message, data);
    }
    public  ResponseObject<T> responseError(int status, String message, T data){
        return  new ResponseObject<T>(status, message, data);
    }
}
