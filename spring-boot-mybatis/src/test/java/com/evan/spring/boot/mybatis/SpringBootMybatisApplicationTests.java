package com.evan.spring.boot.mybatis;

import com.evan.spring.boot.mybatis.dao.UserMapper;
import com.evan.spring.boot.mybatis.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootMybatisApplication.class)
@Transactional
@Rollback
public class SpringBootMybatisApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        List<User> users = userMapper.selectAll();
        for (User user: users) {
            System.out.println(user.getUsername());
        }
    }

}
