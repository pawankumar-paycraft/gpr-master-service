package com.paycraftsol.prepaidgpr.gprmasterservice.bo;

import org.springframework.http.ResponseEntity;

public interface RetriveTenantIdBO {

    ResponseEntity<Object> getTenantIdWithInstitutionName();
}
