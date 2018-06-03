package com.jialili.video.dao;

import com.jialili.video.mapper.VideoinfoMapper;
import com.jialili.video.pojo.Videoinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VideoinfoDaoImpl implements IVideoinfoDao {

    @Autowired(required = false)
    VideoinfoMapper videoinfoMapper;

    @Override
    public List<Videoinfo> getAllVideoinfo() {
        return videoinfoMapper.getAllVideo();
    }
}
