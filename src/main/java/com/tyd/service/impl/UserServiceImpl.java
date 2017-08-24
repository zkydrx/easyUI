package com.tyd.service.impl;

import com.tyd.dao.UserDao;
import com.tyd.entity.AcctUser;
import com.tyd.pojo.AcctUserDto;
import com.tyd.service.UserService;
import com.tyd.util.BeanMapper;
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

    @Autowired
    private BeanMapper beanMapper;

    @Override
    public AcctUserDto load(String id)
    {

        AcctUser acctUser = userDao.load(id);
        AcctUserDto acctUserDto = beanMapper.map(acctUser, AcctUserDto.class);
        return acctUserDto;
    }
    @Override
    public AcctUserDto get(String id)
    {
        AcctUser acctUser = userDao.get(id);
        AcctUserDto acctUserDto = beanMapper.map(acctUser, AcctUserDto.class);
        return acctUserDto;
    }
    @Override
    public List<AcctUserDto> findAll()
    {
        List<AcctUser> acctUserList = userDao.findAll();
        List<AcctUserDto> acctUserDtoList = beanMapper.map(acctUserList, AcctUserDto.class);
        return acctUserDtoList;
    }
    @Override
    public void persist(AcctUserDto entity)
    {
        AcctUser acctUser = beanMapper.map(entity, AcctUser.class);
        userDao.persist(acctUser);
    }
    @Override
    public void save(AcctUserDto entity)
    {
        AcctUser acctUser = beanMapper.map(entity, AcctUser.class);
        userDao.save(acctUser);
    }
    @Override
    public void saveOrUpdate(AcctUserDto entity)
    {
        AcctUser acctUser = beanMapper.map(entity, AcctUser.class);
        userDao.saveOrUpdate(acctUser);
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
