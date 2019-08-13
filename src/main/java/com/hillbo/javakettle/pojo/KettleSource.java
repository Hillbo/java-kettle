package com.hillbo.javakettle.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class KettleSource {

    private String id;

    private Integer type;                  // 0:数据库资源库，1:文件资源库，2:文件

    private String name;                   // 配置名称

    private List<KettleCarte> kettleCarteList;   // 启动kettle任务的carte服务

    // 以数据库为资源库管理的配置属性------------------------------------------------------

    private String db_source_username;     // 数据库资源库用户名

    private String db_source_password;     // 数据库资源库密码

    private Integer db_type;               // 数据库类型，0:mysql

    private String db_ip;                  // 数据库ip

    private String db_port;                // 数据库端口

    private String db_name;                // 数据库名称

    private String db_username;            // 数据库用户名

    private String db_password;            // 数据库密码

    // 文件管理的配置属性-----------------------------------------------------------------

    private String server_ip;              // 服务器ip

    private Integer server_port = 20;      // 服务器端口

    private String server_username;        // 服务器用户名

    private String server_password;        // 服务器密码

    private String job_path;               // job存放路径

    private String trans_path;             // trans存放路径

    // TODO 以文件资源库管理的配置属性-----------------------------------------------------


}
