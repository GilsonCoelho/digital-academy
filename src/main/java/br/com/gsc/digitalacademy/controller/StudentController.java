package br.com.gsc.digitalacademy.controller;

import br.com.gsc.digitalacademy.entity.PhysicalAssessment;
import br.com.gsc.digitalacademy.entity.Student;
import br.com.gsc.digitalacademy.entity.form.StudentForm;
import br.com.gsc.digitalacademy.service.impl.StudentServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentServiceImpl service;

    @PostMapping
    public Student create(@Valid @RequestBody StudentForm form) {
        return service.create(form);
    }

    @GetMapping("/assessments/{id}")
    public List<PhysicalAssessment> getAllPhysicalAssessmentId(@PathVariable Long id) {
        return service.getAllPhysicalAssessmentId(id);
    }

    @GetMapping
    public List<Student> getAll(@RequestParam(value = "dateOfBirth", required = false)
                              String dateOfBirth){
        return service.getAll(dateOfBirth);
    }


}
