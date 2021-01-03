package com.aoao.demo.psdemo1.Service.impl;

import com.aoao.demo.psdemo1.Dao.UserDao;
import com.aoao.demo.psdemo1.Service.UserService;
import com.aoao.demo.psdemo1.Util.psdemo1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public List<psdemo1> getAll(Map map) {
        return userDao.getAll(map);
    }
}
