package com.grape.service.impl;

import com.grape.entity.UsersLikeVideos;
import com.grape.mapper.UsersLikeVideosMapper;
import com.grape.service.IUsersLikeVideosService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户喜欢的/赞过的视频 服务实现类
 * </p>
 *
 * @author chen
 * @since 2021-02-04
 */
@Service
public class UsersLikeVideosServiceImpl extends ServiceImpl<UsersLikeVideosMapper, UsersLikeVideos> implements IUsersLikeVideosService {

}
