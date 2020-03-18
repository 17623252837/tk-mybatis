package com.hrh.tk.test;

import com.hrh.tk.TkMyBatisApplication;
import com.hrh.tk.mapper.TbUserMapper;
import com.hrh.tk.service.TbUserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ProjectName: tk-mybatis
 * @Package: com.hrh.tk.test
 * @ClassName: Test
 * @Author: HuRonghua
 * @Description:
 * @Date: 2020/3/18 18:47
 * @Version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TkMyBatisApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class Test {
    @Autowired
    private TbUserService tbUserService;


    @org.junit.Test
    public void get(){
        tbUserService.getAll();
    }
}
