package com.paycraftsol.prepaidgpr.gprmasterservice.service;

import com.paycraftsol.prepaidgpr.gprmasterservice.bo.RetriveTenantIdBO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/masterApi")
public class RetriveTenantId {

    @Autowired
    RetriveTenantIdBO retriveTenantIdBO;


    @RequestMapping(value = "/getTenantIdWithInstitutionName", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<Object> getTenantIdWithInstitutionName() {

        return retriveTenantIdBO.getTenantIdWithInstitutionName();
    }




}
