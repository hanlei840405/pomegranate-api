package com.fruit.pomegranate.service.api;


import com.fruit.pomegranate.dto.CorporationDTO;
import com.fruit.strawberry.page.PageRequest;
import com.fruit.strawberry.page.PageResponse;

import java.util.List;

/**
 * Created by hanlei6 on 2016/8/7.
 */
public interface CorporationRemoteService {

    CorporationDTO remoteGet(String id);

    List<CorporationDTO> remoteFindByName(String name);

    List<CorporationDTO> remoteFindByContact(String contact);

    List<CorporationDTO> remoteFindByLegalPerson(String legalPerson);

    PageResponse<CorporationDTO> remotePage(PageRequest pageable, String name, String legalPerson, String contact);

    CorporationDTO insert(CorporationDTO corporation);

    CorporationDTO update(CorporationDTO corporation);

    void batchEnable(List<CorporationDTO> corporation);

    void batchDisable(List<CorporationDTO> corporations);

    CorporationDTO delete(CorporationDTO corporation);

    void batchDelete(List<CorporationDTO> corporations);

    CorporationDTO adjust(CorporationDTO corporation);
}
