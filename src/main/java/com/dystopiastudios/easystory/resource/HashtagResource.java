package com.dystopiastudios.easystory.resource;

import com.dystopiastudios.easystory.domain.model.AuditModel;
import lombok.Data;

@Data
public class HashtagResource extends AuditModel {
    private Long Id;
    private String name;
}
