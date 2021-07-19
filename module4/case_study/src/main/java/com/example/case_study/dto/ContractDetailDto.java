package com.example.case_study.dto;

import com.example.case_study.model.entity.AttachService;

public class ContractDetailDto {
    private Integer id;
    private int quantity;
    private AttachService attachService;

    public ContractDetailDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public AttachService getAttachService() {
        return attachService;
    }

    public void setAttachService(AttachService attachService) {
        this.attachService = attachService;
    }
}
