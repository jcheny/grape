package com.grape.service.impl;

import com.grape.entity.Videos;
import com.grape.mapper.VideosMapper;
import com.grape.service.IVideosService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 视频信息表 服务实现类
 * </p>
 *
 * @author chen
 * @since 2021-02-04
 */
@Service
public class VideosServiceImpl extends ServiceImpl<VideosMapper, Videos> implements IVideosService {

}
