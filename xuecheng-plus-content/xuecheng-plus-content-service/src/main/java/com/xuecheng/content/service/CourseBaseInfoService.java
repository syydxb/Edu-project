package com.xuecheng.content.service;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;

/**
 * @author zwk
 * @version 1.0
 * @description: 课程基本信息管理业务接口
 * @date 2024/1/15 21:12
 **/
public interface CourseBaseInfoService {
    /** 
     * @description: 课程查询接口
     * @param: [pageParams, queryCourseParamsDto] 
     * @return: com.xuecheng.base.model.PageResult<com.xuecheng.content.model.po.CourseBase> 
     * @author zwk
     * @date: 2024/1/15 21:13
     **/ 
    PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);
}
