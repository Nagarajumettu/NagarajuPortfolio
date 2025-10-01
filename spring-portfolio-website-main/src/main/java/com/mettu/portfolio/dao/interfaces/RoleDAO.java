package com.mettu.portfolio.dao.interfaces;

import com.mettu.portfolio.entity.Role;

public interface RoleDAO {
    public Role findRoleByName(String roleName);
}
