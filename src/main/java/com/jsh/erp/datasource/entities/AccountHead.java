package com.jsh.erp.datasource.entities;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class AccountHead {
    private Long id;

    private String type;

    private Long organId;

    private Long handsPersonId;

    private Long creator;

    private BigDecimal changeAmount;

    private BigDecimal totalPrice;

    private Long accountId;

    private String billNo;

    private Date billTime;

    private String remark;

    private Long tenantId;

    private String deleteFlag;


}