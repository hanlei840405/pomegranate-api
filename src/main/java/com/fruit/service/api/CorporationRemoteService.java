package com.fruit.service.api;


import com.fruit.dto.CorporationDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by hanlei6 on 2016/8/7.
 */
public interface CorporationRemoteService {

    CorporationDTO remoteGet(String id);

    List<CorporationDTO> remoteFindByName(String name);

    List<CorporationDTO> remoteFindByContact(String contact);

    List<CorporationDTO> remoteFindByLegalPerson(String legalPerson);

    Page<CorporationDTO> remotePage(Pageable pageable, String name, String legalPerson, String contact);

    CorporationDTO insert(CorporationDTO corporation);

    CorporationDTO update(CorporationDTO corporation);

    void batchEnable(List<CorporationDTO> corporation);

    void batchDisable(List<CorporationDTO> corporations);

    CorporationDTO delete(CorporationDTO corporation);

    void batchDelete(List<CorporationDTO> corporations);

    CorporationDTO adjust(CorporationDTO corporation);
}
