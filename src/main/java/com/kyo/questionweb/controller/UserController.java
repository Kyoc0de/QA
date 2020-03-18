package com.kyo.questionweb.controller;

import com.kyo.questionweb.form.UserRegisterForm;
import com.kyo.questionweb.model.User;
import com.kyo.questionweb.service.IUserService;
import com.kyo.questionweb.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/register")
    public ResponseVO register(@RequestBody UserRegisterForm form){
        return userService.register(form);
    }
}
