package com.study.gmall.pms.service;

import com.study.gmall.pms.entity.ProductAttributeCategory;
import com.baomidou.mybatisplus.extension.service.IService;
import com.study.gmall.vo.PageInfoVo;

/**
 * <p>
 * 产品属性分类表 服务类
 * </p>
 *
 * @author WJM
 * @since 2020-08-27
 */
public interface ProductAttributeCategoryService extends IService<ProductAttributeCategory> {
    /**
     * 分页查询所有的属性分类
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfoVo roductAttributeCategoryPageInfo(Integer pageNum, Integer pageSize);
}
