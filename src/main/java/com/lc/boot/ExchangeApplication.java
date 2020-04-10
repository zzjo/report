package com.lc.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author lz
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class ExchangeApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(ExchangeApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  报表系统启动成功   ლ(´ڡ`ლ)ﾞ");
    }
}