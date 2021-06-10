package com.cunliang.apidemo.demo.mapper;

import com.cunliang.apidemo.demo.entity.User;

import java.util.List;

/**
 * @author: cunliang
 * @create：2021-06-10-4:03 下午
 */
public interface UserMapper {
    List<User> findAll();

}
