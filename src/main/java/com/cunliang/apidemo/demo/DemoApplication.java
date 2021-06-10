package com.cunliang.apidemo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    /*
        Springboot步骤
        1.建立实体类，和数据库字段保持一致
        2.建立mapper接口，定义要操作的数据库动作
        3.建立mapper的xml文件，写具体的SQL
        4.建立service类处理业务逻辑
        5.在controller中展示处理的结果
     */
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
