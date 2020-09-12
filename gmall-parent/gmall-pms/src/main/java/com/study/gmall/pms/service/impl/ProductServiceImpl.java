package com.study.gmall.pms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.gmall.pms.entity.Product;
import com.study.gmall.pms.mapper.ProductMapper;
import com.study.gmall.pms.service.ProductService;
import com.study.gmall.vo.PageInfoVo;
import com.study.gmall.vo.product.PmsProductParam;
import com.study.gmall.vo.product.PmsProductQueryParam;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author WJM
 * @since 2020-08-27
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

    @Override
    public PageInfoVo productPageInfo(PmsProductQueryParam productQueryParam) {
        return null;
    }

    @Override
    public void saveProduct(PmsProductParam productParam) {

    }
}
