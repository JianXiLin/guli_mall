package com.jianxi.gulimall_product.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jianxi.gulimall_product.entity.CategoryEntity;
import com.jianxi.gulimall_product.service.CategoryService;
import com.jianxi.common.utils.PageUtils;
import com.jianxi.common.utils.R;


/**
 * 商品三级分类
 *
 * @author jianxi
 * @email sunlightcs@gmail.com
 * @date 2020-10-09 17:49:07
 */
@RestController
@RequestMapping("gulimall_product/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 获取树状列表
     */
    @RequestMapping("/list/tree")
    public R list() {
        List<CategoryEntity> data = categoryService.queryListWithTree();

        return R.ok().put("data", data);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    public R info(@PathVariable("catId") Long catId) {
        CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("data", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CategoryEntity category) {
        categoryService.save(category);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CategoryEntity category) {
        boolean b = categoryService.updateById(category);
        if (b){
            return R.ok();
        }else {
            return R.error();
        }
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] catIds) {
        categoryService.removeByIds(Arrays.asList(catIds));

        return R.ok();
    }

}
