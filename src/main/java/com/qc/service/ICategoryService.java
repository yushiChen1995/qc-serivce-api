package com.qc.service;

import com.qc.pojo.goods.Category;

import java.util.List;
import java.util.Map;

/**
 * @author cys
 * @date 2019/9/11
 */
public interface ICategoryService {

    /**
     * 条件查询分类
     * @param searchMap
     * @return
     */
    List<Category> findList(Map<String, Object> searchMap);

    /**
     * 查询所有分类
     * @return
     */
    List<Category> findAll();

    /**
     * 根据Id查询
     *
     * @param id
     * @return
     */
    Category findCategoryById(Integer id);

    /**
     * 新增
     *
     * @param category
     */
    void addCategory(Category category);

    /**
     * 修改
     *
     * @param category
     */
    void updateCategory(Category category);

    /**
     * 删除
     * @param id
     */
    void deleteCategory(Integer id);
}
