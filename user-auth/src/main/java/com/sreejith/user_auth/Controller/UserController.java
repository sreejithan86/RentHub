package com.sreejith.user_auth.Controller;

import com.sreejith.user_auth.Request.UserInfoRequest;
import com.sreejith.user_auth.Response.ApiResponse;
import com.sreejith.user_auth.Service.UserRegistrationService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@Tag(name="Sign Up")
public class UserController {

    @Autowired
    private UserRegistrationService userRegistrationService;

    @PostMapping("/registeruser")
    public ResponseEntity<ApiResponse<String>> userRegister(@RequestBody UserInfoRequest userInfo){
        return userRegistrationService.registerUser(userInfo);
    }

}
