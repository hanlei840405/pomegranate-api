package com.fruit.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by hanlei6 on 2016/7/14.
 */
@Data
public class AccountDTO implements Serializable {
    private static final long serialVersionUID = 8012924015958169769L;

    private String id;

    private String username;

    private String password;

    private CorporationDTO corporation;
}
