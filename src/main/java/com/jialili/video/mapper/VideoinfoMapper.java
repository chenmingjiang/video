package com.jialili.video.mapper;

import com.jialili.video.pojo.Videoinfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VideoinfoMapper {
    public List<Videoinfo> getAllVideo();
}
