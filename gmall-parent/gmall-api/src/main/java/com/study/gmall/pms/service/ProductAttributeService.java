package com.study.gmall.pms.service;

import com.study.gmall.pms.entity.ProductAttribute;
import com.baomidou.mybatisplus.extension.service.IService;
import com.study.gmall.vo.PageInfoVo;

/**
 * <p>
 * 商品属性参数表 服务类
 * </p>
 *
 * @author WJM
 * @since 2020-08-27
 */
public interface ProductAttributeService extends IService<ProductAttribute> {
    /**
     * 查询某个属性分类下的所有属性和参数
     * @param cid
     * @param type
     * @param pageSize
     * @param pageNum
     * @return
     */
    PageInfoVo getCategoryAttributes(Long cid, Integer type, Integer pageSize, Integer pageNum);
}
