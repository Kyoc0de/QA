package com.kyo.questionweb.service;


import com.kyo.questionweb.QuestionwebApplicationTests;
import com.kyo.questionweb.form.UserRegisterForm;
import com.kyo.questionweb.vo.ResponseVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
public class IUserServiceTest extends QuestionwebApplicationTests {

    @Autowired
    private IUserService userService;

    @Transactional
    @Test
    public void register() {
        UserRegisterForm form = new UserRegisterForm();
        form.setUsername("wudi");
        form.setPassword("123");
        form.setRePassword("123");
        form.setEmail("qq12@qq.com");
        form.setNickname("kyo123");
        ResponseVO register = userService.register(form);
        log.info(register.getMsg());
    }
}