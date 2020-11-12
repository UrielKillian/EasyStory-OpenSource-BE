package com.dystopiastudios.easystory.resource;

import com.dystopiastudios.easystory.domain.model.AuditModel;
import lombok.Data;
import org.hibernate.annotations.NaturalId;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class SaveUserResource extends AuditModel {
    @NotNull
    @Size(max = 15)
    @NaturalId
    @Column(unique = true)
    private String username;

    @NotNull
    @NotBlank
    @Size(max = 15, min = 5)
    private String password;

    @NotNull
    @NotBlank
    @Size(max = 25)
    private String firstName;

    @NotNull
    @NotBlank
    @Size(max = 25)
    private String lastName;

    @NotNull
    @NotBlank
    @Size(max = 25)
    private String email;

    @NotNull
    @NotBlank
    @Size(max = 25)
    private String telephone;

}
