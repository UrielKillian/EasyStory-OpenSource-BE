package com.dystopiastudios.easystory.cucumber.resource;

import com.dystopiastudios.easystory.cucumber.domain.model.AuditModel;
import lombok.Data;

@Data
public class QualificationResource extends AuditModel {
  private Long userId;
  private Long postId;
  private Double qualification;
}
