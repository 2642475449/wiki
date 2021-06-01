package com.xiao.wiki.controller;

import com.xiao.wiki.domain.Ebook;
import com.xiao.wiki.resp.CommonResp;
import com.xiao.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ：降蓝
 * @description：测试
 * @date ：2021/5/28 23:39
 */
@RestController
@RequestMapping("/ebook")
public class EbookController {


    @Resource
    private EbookService ebookService;


    @GetMapping("/list")
    public CommonResp list() {
        CommonResp<List<Ebook>> resp = new CommonResp<>();
        List<Ebook> list = ebookService.list();
        resp.setContent(list);
        return  resp;
    }
}
