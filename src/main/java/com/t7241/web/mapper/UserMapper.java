package com.t7241.web.mapper;

import com.t7241.web.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User getUser(int id);
}
