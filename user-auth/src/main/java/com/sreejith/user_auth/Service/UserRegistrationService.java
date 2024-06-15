package com.sreejith.user_auth.Service;

import com.sreejith.user_auth.Request.UserInfoRequest;
import com.sreejith.user_auth.Response.ApiResponse;
import org.springframework.http.ResponseEntity;


public interface UserRegistrationService {
    public  ResponseEntity<ApiResponse<String>> registerUser(UserInfoRequest userInfo);
}
