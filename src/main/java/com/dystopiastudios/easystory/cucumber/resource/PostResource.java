package com.dystopiastudios.easystory.cucumber.resource;

import com.dystopiastudios.easystory.cucumber.domain.model.AuditModel;
import lombok.Data;

@Data
public class PostResource extends AuditModel {
    private Long id;
    private Long userId;
    private String title;
    private String description;
    private String content;
}
