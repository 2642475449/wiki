package com.xiao.wiki.service;

import com.xiao.wiki.domain.Test;
import com.xiao.wiki.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ：降蓝
 * @description：TODO
 * @date ：2021/5/30 0:34
 */
@Service
public class TestService {

    @Resource
    private TestMapper testMapper;


    public List<Test> list(){
        return testMapper.list();
    }
}
