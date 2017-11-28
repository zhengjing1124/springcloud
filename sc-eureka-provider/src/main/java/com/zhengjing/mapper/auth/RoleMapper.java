package com.zhengjing.mapper.auth;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zhengjing.api.model.auth.Role;
import com.zhengjing.mapper.BaseMapper;

/** 
 * @Description 角色Mapper
 * @author 郑静
 * @date Apr 12, 2017 9:12:42 AM  
 */
@Mapper
public interface RoleMapper extends BaseMapper<String, Role> {

    /**
     * 根据用户查询对应所有角色
     *
     * @param userId
     *            用户
     * @return roles 所有角色
     */
    public List<Role> findRoleByUserId(String userId);

    /**
     * 根据编码查询角色
     *
     * @param code
     *            角色编码
     * @return
     */
    public Role findRoleByCode(String code);

}
