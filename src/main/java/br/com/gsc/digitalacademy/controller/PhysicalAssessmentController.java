package br.com.gsc.digitalacademy.controller;

import br.com.gsc.digitalacademy.entity.PhysicalAssessment;
import br.com.gsc.digitalacademy.entity.form.PhysicalAssessmentForm;
import br.com.gsc.digitalacademy.service.impl.PhysicalAssessmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assessments")
public class PhysicalAssessmentController {

    @Autowired
    private PhysicalAssessmentServiceImpl service;

    @PostMapping
    public PhysicalAssessment create(@RequestBody PhysicalAssessmentForm form) {
        return service.create(form);
    }

    @GetMapping
    public List<PhysicalAssessment> getAll(){
        return service.getAll();
    }
}
