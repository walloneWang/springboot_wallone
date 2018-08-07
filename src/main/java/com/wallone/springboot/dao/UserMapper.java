package com.wallone.springboot.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.wallone.springboot.domain.User;

@Mapper
@Repository
public interface UserMapper {
    User selectUserByName(String name);
}
