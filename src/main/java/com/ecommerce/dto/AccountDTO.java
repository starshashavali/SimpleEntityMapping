package com.ecommerce.dto;

import lombok.Data;

@Data
public class AccountDTO {

    private String userName;

    private String encrytedPassword;

    private boolean active;

    private String userRole;



}
