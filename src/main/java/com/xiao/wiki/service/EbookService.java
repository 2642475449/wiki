package com.xiao.wiki.service;

import com.xiao.wiki.domain.Ebook;
import com.xiao.wiki.domain.EbookExample;
import com.xiao.wiki.mapper.EbookMapper;
import com.xiao.wiki.resp.EbookResp;
import com.xiao.wiki.util.CopyUtil;
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


    public List<EbookResp> list(EbookResp req){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%"+req.getName()+"%");
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);
        List<EbookResp> list = CopyUtil.copyList(ebookList, EbookResp.class);
        return list;
    }
}
