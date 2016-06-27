package com.example.dao;

import com.example.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by qyx on 2016/5/15.
 */
@Component
public class UserDao {
    @Autowired
    //private SqlSession sqlSession;
    private SqlSessionTemplate sqlSessionTemplate;

    public User selectUserById(int id) {
        return this.sqlSessionTemplate.selectOne("selectUserById", id);
    }
}
