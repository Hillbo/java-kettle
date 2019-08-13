package com.hillbo.javakettle.dao;


import com.hillbo.javakettle.annotation.MyBatisDao;
import com.hillbo.javakettle.pojo.KettleSource;

@MyBatisDao
public interface KettleSourceDao {

    int addKettleSource(KettleSource kettleSource);

    int updateKettleSource(KettleSource kettleSource);

    KettleSource queryKettleSourceById(String id);

    int deleteKettleSourceById(String id);

}
