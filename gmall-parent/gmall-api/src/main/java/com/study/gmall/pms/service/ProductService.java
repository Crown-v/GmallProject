package com.study.gmall.pms.service;

import com.study.gmall.pms.entity.Product;
import com.baomidou.mybatisplus.extension.service.IService;
import com.study.gmall.vo.PageInfoVo;
import com.study.gmall.vo.product.PmsProductParam;
import com.study.gmall.vo.product.PmsProductQueryParam;

/**
 * <p>
 * 商品信息 服务类
 * </p>
 *
 * @author WJM
 * @since 2020-08-27
 */
public interface ProductService extends IService<Product> {
    /**
     * 根据复杂查询条件返回分页数据
     * @param productQueryParam
     * @return
     */
    PageInfoVo productPageInfo(PmsProductQueryParam productQueryParam);

    /**
     * 保存商品数据
     * @param productParam
     */
    void saveProduct(PmsProductParam productParam);
}
