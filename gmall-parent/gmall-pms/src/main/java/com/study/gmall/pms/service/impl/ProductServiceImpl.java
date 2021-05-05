package com.study.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.gmall.pms.entity.Product;
import com.study.gmall.pms.mapper.ProductMapper;
import com.study.gmall.pms.service.ProductService;
import com.study.gmall.vo.PageInfoVo;
import com.study.gmall.vo.product.PmsProductParam;
import com.study.gmall.vo.product.PmsProductQueryParam;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author WJM
 * @since 2020-08-27
 */

@Component
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {
    @Resource
    private ProductMapper productMapper;

    @Override
    public PageInfoVo productPageInfo(PmsProductQueryParam productQueryParam) {
        QueryWrapper<Product> wrapper = new QueryWrapper<>();

        if(productQueryParam.getBrandId()!=null){
            //前端传了
            wrapper.eq("brand_id",productQueryParam.getBrandId());
        }

        if(!StringUtils.isEmpty(productQueryParam.getKeyword())){
            wrapper.like("name",productQueryParam.getKeyword());
        }

        if(productQueryParam.getProductCategoryId()!=null){
            wrapper.eq("product_category_id",productQueryParam.getProductCategoryId());
        }

        if(!StringUtils.isEmpty(productQueryParam.getProductSn())){
            wrapper.like("product_sn",productQueryParam.getProductSn());
        }

        if(productQueryParam.getPublishStatus()!=null){
            wrapper.eq("publish_status",productQueryParam.getPublishStatus());
        }

        if(productQueryParam.getVerifyStatus()!=null){
            wrapper.eq("verify_status",productQueryParam.getVerifyStatus());
        }
        IPage<Product> p = new Page<>(productQueryParam.getPageNum(), productQueryParam.getPageSize());
        IPage<Product> page = productMapper.selectPage(p, wrapper);
        PageInfoVo pageInfoVo = new PageInfoVo(
                page.getTotal(),
                page.getPages(),
                productQueryParam.getPageSize(),
                page.getRecords(),
                productQueryParam.getPageNum());
        return pageInfoVo;
    }

    @Override
    public void saveProduct(PmsProductParam productParam) {

    }
}
