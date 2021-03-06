package com.zhengjing.service.auth.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhengjing.api.model.auth.Role;
import com.zhengjing.api.model.auth.User;
import com.zhengjing.mapper.auth.RoleMapper;
import com.zhengjing.mapper.auth.UserMapper;
import com.zhengjing.service.auth.AuthService;

@Service("authService")
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public User findUserByName(String username) {
        return userMapper.findUserByName(username);
    }

    @Override
    public Role findRoleByRoleCode(String roleCode) {
        return roleMapper.findRoleByCode(roleCode);
    }

    @Override
    public List<User> findUserByRoleCode(String roleCode) {
        return userMapper.findUserByRoleCode(roleCode);
    }

}
