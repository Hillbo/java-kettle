package com.hillbo.javakettle.dao;


import com.hillbo.javakettle.annotation.MyBatisDao;
import com.hillbo.javakettle.pojo.KettleCarte;

import java.util.List;

@MyBatisDao
public interface KettleCarteDao {

    int addKettleCartes(List<KettleCarte> kettleCarteList);

    int deleteKettleCarteByKettleSourceId(String kettleSourceId);

}
