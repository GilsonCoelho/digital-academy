package br.com.gsc.digitalacademy.entity.form;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationForm {

    @NotNull(message = "Fill in the field correctly.")
    @Positive(message = "The Id of student need to be positive.")
    private Long studentId;
}
