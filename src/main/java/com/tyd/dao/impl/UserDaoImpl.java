package com.tyd.dao.impl;

import com.tyd.dao.UserDao;
import com.tyd.entity.AcctUser;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ZKY on 2017-08-23 15:33.
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao
{
    @Autowired
    private SessionFactory sessionFactory;


    private Session getCurrentSession()
    {
        return this.sessionFactory.getCurrentSession();
    }
    @Override
    public AcctUser load(String id)
    {
        return (AcctUser)this.getCurrentSession().load(AcctUser.class,id);
    }

    @Override
    public AcctUser get(String id)
    {
        return (AcctUser)this.getCurrentSession().load(AcctUser.class,id);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<AcctUser> findAll()
    {
        List<AcctUser> acctUserList= this.getCurrentSession().createQuery("from AcctUser ").setCacheable(true).list();
        return acctUserList;
    }
    @Override
    public void persist(AcctUser entity)
    {
        this.getCurrentSession().persist(entity);
    }
    @Override
    public String save(AcctUser entity)
    {
        return (String)this.getCurrentSession().save(entity);
    }
    @Override
    public void saveOrUpdate(AcctUser entity)
    {
        this.getCurrentSession().saveOrUpdate(entity);
    }
    @Override
    public void delete(String id)
    {
        this.getCurrentSession().delete(id);
    }
    @Override
    public void flush()
    {
        this.getCurrentSession().flush();
    }
}
