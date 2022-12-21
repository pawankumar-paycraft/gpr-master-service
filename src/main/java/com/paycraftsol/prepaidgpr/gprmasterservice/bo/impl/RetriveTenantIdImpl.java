package com.paycraftsol.prepaidgpr.gprmasterservice.bo.impl;

import com.paycraftsol.prepaidgpr.gprmasterservice.bo.RetriveTenantIdBO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.paycraftsol.prepaidgpr.gprmasterservice.repo.GetTenantIdWithInstitutionNameRepo;
import com.paycraftsol.prepaidgpr.gprmasterservice.util.CommonUtils;

@Slf4j
@Service
public class RetriveTenantIdImpl implements RetriveTenantIdBO {

    @Autowired
    GetTenantIdWithInstitutionNameRepo getTenantIdWithInstitutionNameRepo;

    @Override
    public ResponseEntity<Object> getTenantIdWithInstitutionName() {

        return CommonUtils.getResponse(getTenantIdWithInstitutionNameRepo.findDinstictValue(), MediaType.APPLICATION_JSON);
    }
}
