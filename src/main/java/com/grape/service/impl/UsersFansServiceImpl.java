package com.grape.service.impl;

import com.grape.entity.UsersFans;
import com.grape.mapper.UsersFansMapper;
import com.grape.service.IUsersFansService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户粉丝关联关系表 服务实现类
 * </p>
 *
 * @author chen
 * @since 2021-02-04
 */
@Service
public class UsersFansServiceImpl extends ServiceImpl<UsersFansMapper, UsersFans> implements IUsersFansService {

}
