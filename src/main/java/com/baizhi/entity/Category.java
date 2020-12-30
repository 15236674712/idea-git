package com.baizhi.entity;

/**
 * @author Category
 * @time 2020/12/30-11:10
 */
public class Category {

    private String id;
    private String name;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Category(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Category() {
    }
}
