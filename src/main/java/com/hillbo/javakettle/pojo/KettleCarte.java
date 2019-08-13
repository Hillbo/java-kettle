package com.hillbo.javakettle.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class KettleCarte {

    private String id;

    private String kettle_source_id;

    private String ip;

    private String port;

    private String username;

    private String password;

}
