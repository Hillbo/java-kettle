package com.hillbo.javakettle.db_repo;

import org.pentaho.di.core.KettleEnvironment;
import org.pentaho.di.repository.kdr.KettleDatabaseRepository;

public class KettleDBRepoTest {

    static {
        // 初始化kettle环境
        KettleEnvironment.init();
    }

    public static void main(String[] args) {
        // 创建资源库对象，此时是个空对象
        KettleDatabaseRepository kettleDatabaseRepository = new KettleDatabaseRepository();
        // 创建资源库数据库对象，类似在spoon里面创建的数据库资源库

    }
}
