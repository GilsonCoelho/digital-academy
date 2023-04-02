package br.com.gsc.digitalacademy.entity.form;

import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentForm {

    @NotEmpty(message = "Fill in the field correctly.")
    @Size(min = 3, max =50, message = "'${validatedValue}' need to be between {min} e {max} characters.")
    private String name;

    @NotEmpty(message = "Fill in the field correctly.")
    //@CPF(message = "'${validatedValue}' It is invalid!")
    private String cpf;

    @NotEmpty(message = "Fill in the field correctly.")
    @Size(min = 3, max =50, message = "'${validatedValue}' need to be between {min} e {max} characters.")
    private String neighborhood;

    @NotNull(message = "Fill in the field correctly.")
    @Past(message = "Date '${validatedValue}' It is invalid.")
    private LocalDate dateOfBirth;
}
