package br.com.gsc.digitalacademy.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_student")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String cpf;

    private String neighborhood;

    private LocalDate dateOfBirth;

    @OneToMany(mappedBy = "student", cascade = CascadeType.REMOVE , fetch = FetchType.LAZY)
    @JsonIgnore
    private List<PhysicalAssessment> assessments = new ArrayList<>();
}
