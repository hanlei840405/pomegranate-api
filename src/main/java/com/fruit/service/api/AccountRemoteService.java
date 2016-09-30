package com.fruit.service.api;


import com.fruit.dto.AccountDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by hanlei6 on 2016/7/14.
 */
public interface AccountRemoteService {

    AccountDTO remoteGet(String id);

    AccountDTO remoteGetByUsername(String username);

    // 查找
    Page<AccountDTO> localPage(Pageable pageable, String corporationId);

    AccountDTO insert(AccountDTO account);

    AccountDTO update(AccountDTO account);

    AccountDTO delete(AccountDTO account);

    void batchDelete(List<AccountDTO> accounts);
}
