package com.xuecheng.base.model;

import lombok.Data;
import lombok.ToString;

/**
 * @author zwk
 * @version 1.0
 * @description: 分页查询通用参数
 * @date 2024/1/12 19:52
 **/
@Data
@ToString
public class PageParams {
    //当前页码
    private Long pageNo = 1L;
    //每页显示记录数
    private Long pageSize = 10L;

    public PageParams() {
    }
    
    public PageParams(Long pageNo, Long pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }

}
