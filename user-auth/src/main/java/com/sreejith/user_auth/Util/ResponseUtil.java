package com.sreejith.user_auth.Util;

import com.sreejith.user_auth.Response.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;

public class ResponseUtil {

    public static <T> ResponseEntity<ApiResponse<T>> success(T data){
        ApiResponse<T> response=ApiResponse.<T>builder()
                .status(HttpStatus.OK.toString())
                .message("Success")
                .data(data)
                .timeStamp(LocalDateTime.now())
                .build();
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    public static <T> ResponseEntity<ApiResponse<T>> success(T data, String message){
        ApiResponse<T> response=ApiResponse.<T>builder()
                .status(HttpStatus.OK.toString())
                .message(message)
                .data(data)
                .timeStamp(LocalDateTime.now())
                .build();
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    public static <T> ResponseEntity<ApiResponse<T>> error(HttpStatus status, String message) {
        ApiResponse<T> response = ApiResponse.<T>builder()
                .status(status.toString())
                .message(message)
                .timeStamp(LocalDateTime.now())
                .build();
        return new ResponseEntity<>(response, status);
    }
}
