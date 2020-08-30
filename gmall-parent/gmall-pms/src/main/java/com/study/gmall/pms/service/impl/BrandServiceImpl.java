package com.study.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.gmall.pms.entity.Brand;
import com.study.gmall.pms.mapper.BrandMapper;
import com.study.gmall.pms.service.BrandService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author WJM
 * @since 2020-08-27
 */
@Service //这个是对外暴露的service,注册到dubbo
@Component //这个是注册到spring容器中的bean，不使用@Service，跟dubbo的@Service不好区分
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {

}
