package com.dystopiastudios.easystory.cucumber.resource;

import com.dystopiastudios.easystory.cucumber.domain.model.AuditModel;
import lombok.Data;

@Data
public class SubscriptionResource extends AuditModel {
    private Long userId;
    private Long subscribedId;
}
