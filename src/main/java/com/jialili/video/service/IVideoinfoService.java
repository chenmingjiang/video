package com.jialili.video.service;

import java.util.List;

public interface IVideoinfoService {
    List<com.jialili.video.pojo.Videoinfo> getAllVideoinfo(int page, int pagesize);
}
