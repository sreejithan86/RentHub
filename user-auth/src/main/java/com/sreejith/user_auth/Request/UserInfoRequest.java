package com.sreejith.user_auth.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Date;
@AllArgsConstructor
@Data
@NoArgsConstructor
public class UserInfoRequest {

    private String username;

    private String password;

    private String email;

    private Date createdAt;

    private Date updatedAt;
}
