package com.jianxi.gulimall_product.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.jianxi.common.valid.AddGroup;
import com.jianxi.common.valid.UpdateGroup;
import com.jianxi.common.valid.UpdateStatusGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jianxi.gulimall_product.entity.BrandEntity;
import com.jianxi.gulimall_product.service.BrandService;
import com.jianxi.common.utils.PageUtils;
import com.jianxi.common.utils.R;

import javax.validation.Valid;


/**
 * 品牌
 *
 * @author jianxi
 * @email sunlightcs@gmail.com
 * @date 2020-10-09 17:49:07
 */
@RestController
@RequestMapping("gulimall_product/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    /**
     * 列表
     */
    @RequestMapping("/list")
        public R list(@RequestParam Map<String, Object> params){
        PageUtils page = brandService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{brandId}")
        public R info(@PathVariable("brandId") Long brandId){
		BrandEntity brand = brandService.getById(brandId);

        return R.ok().put("brand", brand);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
        public R save(@Validated(AddGroup.class) @RequestBody BrandEntity brand/*,BindingResult vaildResult*/){
/*        if (vaildResult.hasErrors()) {
            HashMap<String,String> map = new HashMap<>();
            List<FieldError> fieldErrors = vaildResult.getFieldErrors();
            fieldErrors.forEach(e->{
                map.put(e.getField(),e.getDefaultMessage());
            });
            return R.error().put("data",map);
        }else {
            brandService.save(brand);
            return R.ok();
        }*/

        brandService.save(brand);
        return R.ok();

    }

    /**
     * 修改
     */
    @RequestMapping("/update")
        public R update(@Validated(UpdateGroup.class) @RequestBody BrandEntity brand){
            brandService.updateById(brand);
            return R.ok();
    }
    /**
     * 修改状态
     */
    @RequestMapping("/update/status")
    public R updateStatus(@Validated(UpdateStatusGroup.class) @RequestBody BrandEntity brand){
        brandService.updateById(brand);
        return R.ok();
    }
    /**
     * 删除
     */
    @RequestMapping("/delete")
        public R delete(@RequestBody Long[] brandIds){
		brandService.removeByIds(Arrays.asList(brandIds));

        return R.ok();
    }

}
