package com.study.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.gmall.pms.entity.Brand;
import com.study.gmall.pms.mapper.BrandMapper;
import com.study.gmall.pms.service.BrandService;
import com.study.gmall.vo.PageInfoVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

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
    @Resource
    private BrandMapper brandMapper;

    @Override
    public PageInfoVo brandPageInfo(String keyword, Integer pageNum, Integer pageSize) {
        QueryWrapper<Brand> queryWrapper = null; // 查询条件
        if(!StringUtils.isEmpty(keyword)){
            //自动拼%
            queryWrapper = new QueryWrapper<Brand>().like("name", keyword);
        }
        IPage<Brand> brandIPage = brandMapper.selectPage(new Page<Brand>(pageNum.longValue(), pageSize.longValue()), queryWrapper);

        PageInfoVo pageInfoVo = new PageInfoVo(
                brandIPage.getTotal(),
                brandIPage.getPages(),
                pageSize.longValue(),
                brandIPage.getRecords(),
                brandIPage.getCurrent());
        return pageInfoVo;
    }
}
