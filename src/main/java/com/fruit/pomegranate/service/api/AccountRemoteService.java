package com.fruit.pomegranate.service.api;


import com.fruit.pomegranate.dto.AccountDTO;
import com.fruit.strawberry.page.PageRequest;
import com.fruit.strawberry.page.PageResponse;

import java.util.List;

/**
 * Created by hanlei6 on 2016/7/14.
 */
public interface AccountRemoteService {

    AccountDTO remoteGet(String id);

    AccountDTO remoteGetByUsername(String username);

    // 查找
    PageResponse<AccountDTO> localPage(PageRequest pageable, String corporationId);

    AccountDTO insert(AccountDTO account);

    AccountDTO update(AccountDTO account);

    AccountDTO delete(AccountDTO account);

    void batchDelete(List<AccountDTO> accounts);
}
