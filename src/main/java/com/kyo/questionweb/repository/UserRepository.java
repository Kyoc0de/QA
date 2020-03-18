package com.kyo.questionweb.repository;

import com.kyo.questionweb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findOneByUsername(String username);

    User findOneByEmail(String email);
}
