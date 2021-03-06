package com.company.project.manage.dao;

import com.company.project.manage.entity.SysRole;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * (SysRole)表数据库访问层
 *
 * @author Raychen
 * @since 2020-06-28 15:37:08
 */
public interface SysRoleDao extends Mapper<SysRole> {

    /**
     * 通过username查找用户角色信息
     */
    List<SysRole> findRoleByUsername(@Param("username") String username);
}