package com.itheima.mapper;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author yw
 * @date 2020/6/3-15:07
 */
@Mapper
public interface UserMapper {
    public List<User> queryUserList();
    public User queryOneUser() ;

}
