package com.fruit.pomegranate.service.api;

import com.fruit.pomegranate.dto.ApplicationDTO;

/**
 * Created by hanlei6 on 2016/10/4.
 */
public interface ApplicationRemoteService {
    ApplicationDTO get(String id);

    ApplicationDTO save(ApplicationDTO application);
}
