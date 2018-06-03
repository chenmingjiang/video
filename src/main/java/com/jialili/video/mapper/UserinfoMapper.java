package com.jialili.video.mapper;

import com.jialili.video.pojo.Userinfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserinfoMapper {
    List<Userinfo> getAllUserfino();
}
