package com.jianxi.gulimall_product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jianxi.common.utils.PageUtils;
import com.jianxi.common.utils.Query;

import com.jianxi.gulimall_product.dao.CategoryDao;
import com.jianxi.gulimall_product.entity.CategoryEntity;
import com.jianxi.gulimall_product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity>  queryListWithTree() {

        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        List<CategoryEntity> collect = categoryEntities.stream().filter(
                (e) -> e.getParentCid() == 0
        ).map((categoryEntity) -> {
            categoryEntity.setChildrens(getChildrens(categoryEntity, categoryEntities));
            return categoryEntity;
        }).sorted((m1, m2) -> {
            return m1.getSort() - m2.getSort();
        }).collect(Collectors.toList());


        return collect;
    }

    public List<CategoryEntity> getChildrens(CategoryEntity root,List<CategoryEntity> all){
        List<CategoryEntity> collect = all.stream().filter(
                (e) -> e.getParentCid() == root.getCatId()
        ).map((categoryEntity) -> {
            categoryEntity.setChildrens(getChildrens(categoryEntity, all));
            return categoryEntity;
        }).sorted((m1, m2) -> {
            return m1.getSort() - m2.getSort();
        }).collect(Collectors.toList());
        return  collect;
    }

}
