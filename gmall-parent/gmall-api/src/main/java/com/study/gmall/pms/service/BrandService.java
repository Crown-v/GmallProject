package com.study.gmall.pms.service;

import com.study.gmall.pms.entity.Brand;
import com.baomidou.mybatisplus.extension.service.IService;
import com.study.gmall.vo.PageInfoVo;

/**
 * <p>
 * 品牌表 服务类
 * </p>
 *
 * @author WJM
 * @since 2020-08-27
 */
public interface BrandService extends IService<Brand> {

    PageInfoVo brandPageInfo(String keyword, Integer pageNum, Integer pageSize);
}
