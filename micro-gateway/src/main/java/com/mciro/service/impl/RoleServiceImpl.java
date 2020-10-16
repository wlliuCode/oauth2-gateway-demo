package com.mciro.service.impl;

import com.mciro.entity.SysRole;
import com.mciro.mapper.SysRoleMapper;
import com.mciro.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public List<SysRole> findByUid(Integer uid) {
        return sysRoleMapper.findByUid(uid);
    }

    @Override
    public List<SysRole> findByPid(Integer pid) {
        return sysRoleMapper.findByPid(pid);
    }

    @Override
    public List<String> findRoleNamesByPid(Integer pid) {
        return sysRoleMapper.findRoleNamesByPid(pid);
    }

    @Override
    public List<String> findByPermissionUrl(String permissionUrl) {
        return sysRoleMapper.findByPermissionUrl(permissionUrl);
    }
}
