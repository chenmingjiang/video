package com.jialili.video.service;

import com.github.pagehelper.PageHelper;
import com.jialili.video.pojo.Videoinfo;
import com.jialili.video.dao.IVideoinfoDao;
import com.jialili.video.dao.VideoinfoDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoinfoServiceImpl implements IVideoinfoService {
    @Autowired
    IVideoinfoDao videoinfoDao = new VideoinfoDaoImpl();

    @Override
    public List<Videoinfo> getAllVideoinfo(int page, int pagesize) {
        PageHelper.startPage(page,pagesize);
        return videoinfoDao.getAllVideoinfo();
    }
}
