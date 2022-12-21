package com.paycraftsol.prepaidgpr.gprmasterservice.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Table(name="INSTITUTION_TENANT_MAPPING")
public class TenantInstitutionMapEntity {

    @Id
    private long id;

    @Column(name = "INSTITUTION_NAME" )
    private String institutionName;

    @Column(name = "TENANT_ID")
    private String tenantId;

//    @Column(name = "ISSUER_ID")
//    private Long issuerId;
//
//    @Column(name = "STATUS")
//    private String accountStatus;
//
//    @Column(name="CREATED_DATE")
//    private String availableBalance;


}
