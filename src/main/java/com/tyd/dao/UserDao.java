package com.tyd.dao;

import com.tyd.entity.AcctUser;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ZKY on 2017-08-23 15:32.
 */
@Service
public interface UserDao extends GenericDao<AcctUser,String>
{
    AcctUser load(String id);
    AcctUser get(String id);
    List<AcctUser> findAll();
    void persist(AcctUser entity);
    String save(AcctUser entity);
    void saveOrUpdate(AcctUser entity);
    void delete(String id);
    void flush();
}
