package com.example.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * Created by qyx on 2016/5/15.
 */
@Mapper
public interface UserMapper {
    UserMapper selectByUserId(int userId);
}
