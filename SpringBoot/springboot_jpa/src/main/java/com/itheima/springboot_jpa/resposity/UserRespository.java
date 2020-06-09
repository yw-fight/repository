package com.itheima.springboot_jpa.resposity;

import com.itheima.springboot_jpa.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author yw
 * @date 2020/6/3-17:08
 */
public interface UserRespository extends JpaRepository<User,Long> {
    public List<User> findAll();
}
