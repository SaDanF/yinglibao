package org.example.api.mapper;

import org.example.api.model.User;

public interface UserMapper {

//    统计注册人数
    int selectCountUser();

    int deleteByPrimaryKey(Integer id);

    int insert(User row);

    int insertSelective(User row);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User row);

    int updateByPrimaryKey(User row);


}