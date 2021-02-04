package com.grape.service.impl;

import com.grape.entity.SearchRecords;
import com.grape.mapper.SearchRecordsMapper;
import com.grape.service.ISearchRecordsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 视频搜索的记录表 服务实现类
 * </p>
 *
 * @author chen
 * @since 2021-02-04
 */
@Service
public class SearchRecordsServiceImpl extends ServiceImpl<SearchRecordsMapper, SearchRecords> implements ISearchRecordsService {

}
