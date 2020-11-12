package com.dystopiastudios.easystory.cucumber.resource;

import com.dystopiastudios.easystory.cucumber.domain.model.AuditModel;
import lombok.Data;

@Data
public class CommentResource extends AuditModel {
    private Long id;
    private Long userId;
    private Long postId;
    private String content;
}
