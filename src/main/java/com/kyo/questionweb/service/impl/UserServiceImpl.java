package com.kyo.questionweb.service.impl;

import com.kyo.questionweb.form.UserRegisterForm;
import com.kyo.questionweb.model.User;
import com.kyo.questionweb.repository.UserRepository;
import com.kyo.questionweb.service.IUserService;
import com.kyo.questionweb.vo.ResponseVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public ResponseVO register(UserRegisterForm form) {
        User findUserByUsername = userRepository.findOneByUsername(form.getUsername());
        if(findUserByUsername!=null){
            return ResponseVO.error("用户名已存在");
        }
        User findUserByEmail = userRepository.findOneByEmail(form.getEmail());
        if(findUserByEmail!=null){
            return ResponseVO.error("邮箱已存在");
        }

        form.setPassword(DigestUtils.md5DigestAsHex(form.getPassword().getBytes(StandardCharsets.UTF_8)));

        User user = new User();

        BeanUtils.copyProperties(form,user);

        User finalUser = userRepository.save(user);

        return ResponseVO.success();
    }
}
