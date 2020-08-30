package com.study.gmall.pms;

import com.alibaba.dubbo.config.annotation.Service;
import com.study.gmall.pms.entity.Brand;
import com.study.gmall.pms.entity.Product;
import com.study.gmall.pms.service.BrandService;
import com.study.gmall.pms.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
public class GmallPmsApplicationTests {

    @Autowired
    private ProductService productService;

    @Autowired
    private BrandService brandService;

    @Test
    public void contextLoads() {
        Product product = productService.getById(1);
        System.out.println(product.getName());

        //测试增删改在主库，查在从库
        Brand brand = new Brand();
        brand.setName("huawei");
        brandService.save(brand);
        System.out.println("保存成功");
    }

}
