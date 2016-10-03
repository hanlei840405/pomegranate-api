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
public class ApplicationDTO implements Serializable {
    private static final long serialVersionUID = -5668970051032015530L;
    private String id;
    private String name;
    private Set<MenuDTO> menus = new HashSet<>();
}
