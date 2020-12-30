package com.baizhi.dao;

import com.baizhi.entity.Category;

import java.util.List;

public interface CategoryDao {

    List<Category> queryByCategory();

    List<Category> queryAll();

    List<Category> queryAlls();

    List<Category> queryAllss();

}
