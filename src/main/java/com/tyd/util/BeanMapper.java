package com.tyd.util;

import com.google.common.collect.Lists;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.Collection;
import java.util.List;

/**
 * Created by ZKY on 2017-08-24 15:38.
 *
 * 简单封装Dozer, 实现深度转换Bean<->Bean的Mapper.
 * 实现:
 * 1. 持有Mapper的单例.
 * 2. 返回值类型转换.
 * 3. 批量转换Collection中的所有对象.
 * 4. 区分创建新的B对象与将对象A值复制到已存在的B对象两种函数.
 */
@Component
public class BeanMapper
{
    @Autowired
    Mapper dozerMapper;

    /**
     * 基于dozer转换对象的类型(两个参数)
     *
     * @param source
     * @param destionationClass
     * @param <T>
     * @return
     */
    public <T> T map(Object source, Class<T> destionationClass)
    {
        Assert.notNull(source, "未查询到相关数据");
        return dozerMapper.map(source, destionationClass);
    }


    /**
     * 基于dozer转换对象的类型(三个参数)
     * @param source
     * @param destinationClass
     * @param keyId
     * @param <T>
     * @return
     */
    public <T> T map(Object source, Class<T> destinationClass, String keyId)
    {
        Assert.notNull(source,"未查询到相关数据");
        return dozerMapper.map(source,destinationClass,keyId);
    }


    /**
     * 基于dozer转换Collection中对象的类型。
     * @param sourceList
     * @param destionationClass
     * @param <T>
     * @return
     */
    public <T> List<T> map(Collection<?> sourceList,Class<T> destionationClass)
    {
        List<T> destionationList = Lists.newArrayList();
        if (sourceList != null && sourceList.size() > 0)
        {
            for(Object sourceObject:sourceList)
            {
                T destionationObject = dozerMapper.map(sourceObject, destionationClass);
                destionationList.add(destionationObject);
            }
        }
        return destionationList;
    }


    /**
     * 基于dozer将对象source中的值copy到destinationObject中
     * @param source
     * @param destinationObject
     */
    public void copy(Object source, Object destinationObject)
    {
        Assert.notNull(source,"未查询到相关数据");
        Assert.notNull(destinationObject,"目标结果对象为空");
        dozerMapper.map(source,destinationObject);
    }




}
