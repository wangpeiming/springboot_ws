package com.wsyy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;


import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;

@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)//鎺掗櫎druid鑷姩鍔犺浇鏁版嵁婧�@MapperScan("com.szht.wsyy.**.mapper")
@EnableScheduling
@EnableTransactionManagement
public class AppRun {
	
	public static void main(String[] args) {
        SpringApplication.run(AppRun.class, args);
    }
	
}
