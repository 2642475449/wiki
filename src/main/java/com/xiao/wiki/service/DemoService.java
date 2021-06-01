package com.xiao.wiki.service;

import com.xiao.wiki.domain.Demo;
import com.xiao.wiki.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ：降蓝
 * @description：TODO
 * @date ：2021/5/30 0:34
 */
@Service
public class DemoService {

    @Resource
    private DemoMapper demoMapper;


    public List<Demo> list(){
        return demoMapper.selectByExample(null);
    }
}
