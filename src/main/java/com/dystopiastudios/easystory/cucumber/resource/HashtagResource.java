package com.dystopiastudios.easystory.cucumber.resource;

import com.dystopiastudios.easystory.cucumber.domain.model.AuditModel;
import lombok.Data;

@Data
public class HashtagResource extends AuditModel {
    private Long Id;
    private String name;
}
