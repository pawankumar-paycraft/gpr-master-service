package com.paycraftsol.prepaidgpr.gprmasterservice.repo;

import com.paycraftsol.prepaidgpr.gprmasterservice.entity.TenantInstitutionMapEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GetTenantIdWithInstitutionNameRepo extends CrudRepository<TenantInstitutionMapEntity, Long> {

    String FINDDISTINCTVALUE = "select * from institution_tenant_mapping itm";
    @Query(value = FINDDISTINCTVALUE, nativeQuery = true)
    List<TenantInstitutionMapEntity> findDinstictValue();
}
