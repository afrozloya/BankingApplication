package com.banking.bankingapi.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class LoginDTO {
    @Schema(description = "Customer ID", example = "23128888", required = true)
    @NotBlank(message = "Customer ID is mandatory")
    private long customerId;
}
