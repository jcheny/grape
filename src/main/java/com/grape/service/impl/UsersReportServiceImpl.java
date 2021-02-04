package com.grape.service.impl;

import com.grape.entity.UsersReport;
import com.grape.mapper.UsersReportMapper;
import com.grape.service.IUsersReportService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 举报用户表 服务实现类
 * </p>
 *
 * @author chen
 * @since 2021-02-04
 */
@Service
public class UsersReportServiceImpl extends ServiceImpl<UsersReportMapper, UsersReport> implements IUsersReportService {

}
