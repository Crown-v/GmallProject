package com.study.gmall.pms.service;

import com.study.gmall.pms.entity.ProductCategory;
import com.baomidou.mybatisplus.extension.service.IService;
import com.study.gmall.vo.product.PmsProductCategoryWithChildrenItem;

import java.util.List;

/**
 * <p>
 * 产品分类 服务类
 * </p>
 *
 * @author WJM
 * @since 2020-08-27
 */
public interface ProductCategoryService extends IService<ProductCategory> {
    /**
     * 查询这个菜单以及他的子菜单
     * @param i
     * @return
     */
    List<PmsProductCategoryWithChildrenItem> listCatelogWithChilder(Integer i);
}
