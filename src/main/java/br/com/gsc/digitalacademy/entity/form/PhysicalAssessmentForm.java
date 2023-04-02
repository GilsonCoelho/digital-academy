package br.com.gsc.digitalacademy.entity.form;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhysicalAssessmentForm {

    //@Positive(message = "The Id of student need to be positive.")
    private Long studentId;

    //@NotNull(message = "Fill in the field correctly.")
    //@Positive(message = "${validatedValue}' need to be positive.")
    private double weight;

    //@NotNull(message = "Fill in the field correctly.")
    //@Positive(message = "${validatedValue}' need to be positive.")
    //@DecimalMin(value = "150", message = "'${validatedValue}' needs to be at least {value}.")
    private double height;

}
