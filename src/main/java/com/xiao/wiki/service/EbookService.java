package com.xiao.wiki.service;

import com.xiao.wiki.domain.Ebook;
import com.xiao.wiki.mapper.EbookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ：降蓝
 * @description：TODO
 * @date ：2021/5/30 0:34
 */
@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;


    public List<Ebook> list(){
        return ebookMapper.selectByExample(null);
    }
}
