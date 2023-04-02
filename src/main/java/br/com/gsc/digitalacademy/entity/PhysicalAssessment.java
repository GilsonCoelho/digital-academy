package br.com.gsc.digitalacademy.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_assessments")
public class PhysicalAssessment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    private LocalDateTime dateAssessments = LocalDateTime.now();

    @Column(name="current_weight")
    private double weight;

    @Column(name="current_height")
    private double height;
}
