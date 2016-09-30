package com.fruit.service.api;


import com.fruit.dto.UserDTO;

/**
 * Created by hanlei6 on 2016/7/14.
 */
public interface UserRemoteService {
    UserDTO remoteGetByAccount(String username);
}
