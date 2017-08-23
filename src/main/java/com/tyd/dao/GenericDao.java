package com.tyd.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ZKY on 2017-08-23 15:28.
 * 通用接口Dao.
 */
public interface GenericDao<T,PK extends Serializable>
{
    T load(PK id);
    T get(PK id);
    List<T> findAll();
    void persist(T entity);
    PK save(T entity);
    void saveOrUpdate(T entity);
    void delete(PK id);
    void flush();
}
