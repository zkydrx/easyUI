package com.tyd.service;

import com.tyd.entity.AcctUser;

import java.util.List;

/**
 * Created by ZKY on 2017-08-23 16:04.
 */
public interface UserService
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
