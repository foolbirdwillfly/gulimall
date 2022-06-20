package com.atguigu.gulimall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.product.dao.CategoryDao;
import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.atguigu.gulimall.product.service.CategoryService;


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
    public List<CategoryEntity> listTree() {
        List<CategoryEntity> allList = baseMapper.selectList(null);
        List<CategoryEntity> parentList = allList.stream()
                .filter(item -> item.getParentCid() == 0)
                .map(item -> {
                    item.setChildren(getChildren(item, allList));
                    return item;
                }).sorted((item1, item2) -> {
                    return item1.getSort() - item2.getSort();
                })
                .collect(Collectors.toList());

        return parentList;
    }

    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> allList) {
        List<CategoryEntity> lastList = allList.stream()
                .filter(item -> {
                    return root.getCatId().equals(item.getParentCid());
                })
                .map(item -> {
                    item.setChildren(getChildren(item, allList));
                    return item;
                })
                .sorted(
                        (item1, item2) -> {
                            return (item1.getSort() == null ? 0:item1.getSort()) - (item2.getSort() == null ? 0:item2.getSort());
                        })
                .collect(Collectors.toList());
        return lastList;
    }

}