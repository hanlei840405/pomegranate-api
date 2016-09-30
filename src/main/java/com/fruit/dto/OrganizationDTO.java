package com.fruit.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by hanlei6 on 2016/7/25.
 */
@Data
public class OrganizationDTO implements Serializable {

    private static final long serialVersionUID = 4780084339707961329L;

    private String code;

    private String name;

    private String fullName;

    private String fullPath;

    private int level;

    private String status;

}
