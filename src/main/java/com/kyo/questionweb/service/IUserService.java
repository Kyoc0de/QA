package com.kyo.questionweb.service;

import com.kyo.questionweb.form.UserRegisterForm;
import com.kyo.questionweb.vo.ResponseVO;

public interface IUserService {

    ResponseVO register(UserRegisterForm form);
}
