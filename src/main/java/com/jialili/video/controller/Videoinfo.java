package com.jialili.video.controller;

import com.jialili.video.service.IVideoinfoService;
import com.jialili.video.service.VideoinfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class Videoinfo {
    @Autowired
    IVideoinfoService videoinfoService = new VideoinfoServiceImpl();

    @RequestMapping("/")
    public ModelAndView getAllVideo(ModelAndView modelAndView) {
        List<com.jialili.video.pojo.Videoinfo> videoinfoList = videoinfoService.getAllVideoinfo(1, 2);
        modelAndView.addObject("videolist", videoinfoList);
        modelAndView.setViewName("blog-home-2");
        return modelAndView;
    }
}
