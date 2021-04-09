package com.jsh.erp.datasource.entities;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Account {
    private Long id;

    private String name;

    private String serialNo;

    private BigDecimal initialAmount;

    private BigDecimal currentAmount;

    private String remark;

    private Boolean isDefault;

    private Long tenantId;

    private String deleteFlag;


}