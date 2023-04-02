package br.com.gsc.digitalacademy.controller;

import br.com.gsc.digitalacademy.entity.Registration;
import br.com.gsc.digitalacademy.entity.form.RegistrationForm;
import br.com.gsc.digitalacademy.service.impl.RegistrationServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registration")
public class RegistrationController {
    @Autowired
    private RegistrationServiceImpl service;

    @PostMapping
    public Registration create(@Valid @RequestBody RegistrationForm form) {
        return service.create(form);
    }

    @GetMapping
    public List<Registration> getAll(@RequestParam(value = "neighborhood", required = false) String neighborhood) {
        return service.getAll(neighborhood);
    }

}
