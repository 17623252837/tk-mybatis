package com.hrh.tk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @ProjectName: tk-mybatis
 * @Package: com.hrh.tk
 * @ClassName: TkMyBatisApplication
 * @Author: HuRonghua
 * @Description: 入口类
 * @Date: 2020/3/18 18:30
 * @Version: 1.0
 */
@SpringBootApplication
@MapperScan(basePackages = "com.hrh.tk.mapper")
public class TkMyBatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(TkMyBatisApplication.class,args);
    }
}
