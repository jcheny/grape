package com.grape.service.impl;

import com.grape.entity.Comments;
import com.grape.mapper.CommentsMapper;
import com.grape.service.ICommentsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 课程评论表 服务实现类
 * </p>
 *
 * @author chen
 * @since 2021-02-04
 */
@Service
public class CommentsServiceImpl extends ServiceImpl<CommentsMapper, Comments> implements ICommentsService {

}
