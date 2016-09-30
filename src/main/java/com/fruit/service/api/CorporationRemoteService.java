package com.fruit.service.api;


import com.fruit.dto.CorporationDTO;

/**
 * Created by hanlei6 on 2016/8/7.
 */
public interface CorporationRemoteService {

    CorporationDTO remoteGetByAccount(String username);

    CorporationDTO remoteUpdate(CorporationDTO corporationDTO, String username);
}
