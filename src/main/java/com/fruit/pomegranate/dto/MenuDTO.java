package com.fruit.pomegranate.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by hanlei6 on 2016/10/4.
 */
@Setter
@Getter
public class MenuDTO implements Serializable {
    private static final long serialVersionUID = -2039254461058824251L;
    private String id;

    private String code;

    private String name;

    private String fullCode;

    private String fullName;

    private int level;

    private MenuDTO menu;

    private ApplicationDTO application;

    private Set<MenuDTO> menus = new HashSet<>();
}
