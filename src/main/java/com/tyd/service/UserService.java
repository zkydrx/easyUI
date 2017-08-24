package com.tyd.service;

import com.tyd.pojo.AcctUserDto;

import java.util.List;

/**
 * Created by ZKY on 2017-08-23 16:04.
 */
public interface UserService
{
    AcctUserDto load(String id);
    AcctUserDto get(String id);
    List<AcctUserDto> findAll();
    void persist(AcctUserDto entity);
    void save(AcctUserDto entity);
    void saveOrUpdate(AcctUserDto entity);
    void delete(String id);
    void flush();
}
