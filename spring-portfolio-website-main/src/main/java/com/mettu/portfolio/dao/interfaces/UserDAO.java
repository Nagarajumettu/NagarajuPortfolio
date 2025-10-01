package com.mettu.portfolio.dao.interfaces;

import com.mettu.portfolio.entity.User;

public interface UserDAO {
    User findByUserName(String userName);
}
