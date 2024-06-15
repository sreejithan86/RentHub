package com.sreejith.user_auth.Service.Impl;

import com.sreejith.user_auth.Entity.UserEntity;
import com.sreejith.user_auth.Repository.UserRepository;
import com.sreejith.user_auth.Request.UserInfoRequest;
import com.sreejith.user_auth.Response.ApiResponse;
import com.sreejith.user_auth.Service.UserRegistrationService;
import com.sreejith.user_auth.Util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {

    @Autowired
    UserRepository userRepository;

    @Override
    public ResponseEntity<ApiResponse<String>> registerUser(UserInfoRequest userInfo) {
        UserEntity user=new UserEntity();
        user.setEmail(userInfo.getEmail());
        user.setUsername(userInfo.getUsername());
        user.setPassword(userInfo.getPassword());

        userRepository.save(user);
        return ResponseUtil.success(user.toString());
    }
}
