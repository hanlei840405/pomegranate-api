package com.fruit.pomegranate.service.api;

import com.fruit.pomegranate.dto.MenuDTO;

import java.util.List;

/**
 * Created by hanlei6 on 2016/10/4.
 */
public interface MenuRemoteService {
    MenuDTO get(String id);

    MenuDTO findByCode(String code);

    List<MenuDTO> findByLevel(int level);

    MenuDTO save(MenuDTO menu);
}
