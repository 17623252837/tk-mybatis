package com.hrh.tk.service.impl;

import com.hrh.tk.domain.TbUser;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hrh.tk.mapper.TbUserMapper;
import com.hrh.tk.service.TbUserService;

import java.util.List;

/**
 * @ProjectName:    tk-mybatis
 * @Package:        com.hrh.tk.service.impl
 * @ClassName:      TbUserServiceImpl
 * @Author:     HuRonghua
 * @Description:  ${description}
 * @Date:    2020/3/18 18:40
 * @Version:    1.0
 */
@Service
public class TbUserServiceImpl implements TbUserService{

    @Resource
    private TbUserMapper tbUserMapper;


    @Override
    public void getAll() {
        List<TbUser> tbUsers = tbUserMapper.selectAll();

        System.out.println(tbUsers);
    }
}
