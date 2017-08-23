package com.tyd.service.impl;

import com.tyd.dao.UserDao;
import com.tyd.entity.AcctUser;
import com.tyd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ZKY on 2017-08-23 16:06.
 */
@Service("userService")
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserDao userDao;

    @Override
    public AcctUser load(String id)
    {
        return userDao.load(id);
    }
    @Override
    public AcctUser get(String id)
    {
        return userDao.get(id);
    }
    @Override
    public List<AcctUser> findAll()
    {
        return userDao.findAll();
    }
    @Override
    public void persist(AcctUser entity)
    {
        userDao.persist(entity);
    }
    @Override
    public String save(AcctUser entity)
    {
        return userDao.save(entity);
    }
    @Override
    public void saveOrUpdate(AcctUser entity)
    {
        userDao.saveOrUpdate(entity);
    }
    @Override
    public void delete(String id)
    {
        userDao.delete(id);
    }

    @Override
    public void flush()
    {
        userDao.flush();
    }
}
