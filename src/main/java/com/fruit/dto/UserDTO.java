package com.fruit.dto;

import com.fruit.enums.Level;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by hanlei6 on 2016/7/14.
 */
@Data
public class UserDTO implements Serializable {
    private static final long serialVersionUID = 8012924015958169769L;

    private String realName;

    private String sex;

    private Date birthday;

    private String telephone;

    private String email;

    private String qq;

    private String wx;

    private String weiBo;

    private String photo;

    private Level level;

    private String status;

    private OrganizationDTO organization;
}
