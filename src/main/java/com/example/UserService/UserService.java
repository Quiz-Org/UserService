package com.example.UserService;

import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public static final String allowedUser = "fegrus";

    @PostAuthorize("this.allowedUser == authentication.name")
    public String getUserName() {return "Success";}

}
