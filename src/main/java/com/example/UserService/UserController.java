package com.example.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import static org.springframework.http.HttpStatus.OK;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/name")
    @ResponseBody
    public ResponseEntity<String> getUserName(Authentication authentication){
        return ResponseEntity.status(OK).body(authentication.getName());
    }

    @GetMapping("/user/test")
    @ResponseBody
    public ResponseEntity<String> getTest(){
        return ResponseEntity.status(OK).body(userService.getUserName());
    }


}
