package com.kyo.questionweb.form;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class UserRegisterForm {

    private String username;
    private String password;
    private String rePassword;
    private String email;
    private String nickname;

}
