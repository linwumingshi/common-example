package com.power.doc;

import com.ly.doc.utils.TornaUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

/**
 * @author yu on 2018/06/27.
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, MongoAutoConfiguration.class})
public class SpringBootMainApplication {
    public static void main(String[] args) {
        System.out.println(TornaUtil.testFunc());
        SpringApplication.run(SpringBootMainApplication.class, args);
    }
}
