package com.mciro.service.impl;

import com.mciro.entity.SysPermission;
import com.mciro.mapper.SysPermissionMapper;
import com.mciro.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private SysPermissionMapper sysPermissionMapper;

    @Override
    public List<SysPermission> findAllPermissionWithRoles() {
        return sysPermissionMapper.findAllPermissionWithRoles();
    }

    @Override
    public List<SysPermission> findAllPermissionWithRoleNames() {
        return sysPermissionMapper.findAllPermissionWithRoleNames();
    }
}
