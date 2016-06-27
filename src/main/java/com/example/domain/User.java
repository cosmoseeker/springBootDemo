package com.example.domain;

import java.io.Serializable;

/**
 * Created by qyx on 2016/5/15.
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @Override
    public String toString(){
        return getId() + "," + getName();
    }
}
