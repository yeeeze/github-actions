package com.study.githubactions;

import com.study.githubactions.user.Users;
import com.study.githubactions.user.UserService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class UsersTest {

    @Autowired
    UserService userService;

    @Test
    @DisplayName("성공 테스트")
    void findAll() {
        List<Users> all = userService.findAll();

        Assertions.assertThat(all).hasSize(1);
    }

//    @Test
//    @DisplayName("실패 테스트")
//    void findAllFail() {
//        List<Users> all = userService.findAll();
//
//        Assertions.assertThat(all).isEmpty();
//    }
}
