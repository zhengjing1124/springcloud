package com.zhengjing.mapper.auth;

import org.apache.ibatis.annotations.Mapper;

import com.zhengjing.api.model.auth.RolePermission;
import com.zhengjing.mapper.BaseMapper;

/** 
 * @Description 角色与菜单关系Mapper
 * @author 郑静
 * @date Apr 12, 2017 9:13:04 AM  
 */
@Mapper
public interface RolePermissionMapper extends BaseMapper<String, RolePermission> {

    public RolePermission findRolePermission(RolePermission per);

}
