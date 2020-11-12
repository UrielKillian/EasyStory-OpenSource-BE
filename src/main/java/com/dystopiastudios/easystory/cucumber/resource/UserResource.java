package com.dystopiastudios.easystory.cucumber.resource;

import com.dystopiastudios.easystory.cucumber.domain.model.AuditModel;
import lombok.Data;

@Data
public class UserResource extends AuditModel {
    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String telephone;
    private Integer subscribers;
    private Integer subscriptions;
}
