package com.zhengjing.mapper.auth;

import org.apache.ibatis.annotations.Mapper;

import com.zhengjing.api.model.auth.UserRole;
import com.zhengjing.mapper.BaseMapper;

/** 
 * @Description 用户与角色关系Mapper
 * @author 郑静
 * @date Apr 12, 2017 9:13:44 AM  
 */
@Mapper
public interface UserRoleMapper extends BaseMapper<String, UserRole> {

}
