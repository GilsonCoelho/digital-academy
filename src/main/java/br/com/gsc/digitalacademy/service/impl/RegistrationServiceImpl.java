package br.com.gsc.digitalacademy.service.impl;

import br.com.gsc.digitalacademy.entity.Registration;
import br.com.gsc.digitalacademy.entity.Student;
import br.com.gsc.digitalacademy.entity.form.RegistrationForm;
import br.com.gsc.digitalacademy.repository.RegistrationRepository;
import br.com.gsc.digitalacademy.repository.StudentRepository;
import br.com.gsc.digitalacademy.service.IRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationServiceImpl implements IRegistrationService {

    @Autowired
    private RegistrationRepository registrationRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Registration create(RegistrationForm form) {
        Registration registration = new Registration();
        Student student = studentRepository.findById(form.getStudentId()).get();

        registration.setStudent(student);

        return registrationRepository.save(registration);
    }

    @Override
    public Registration get(Long id) {
        return registrationRepository.findById(id).get();
    }

    @Override
    public List<Registration> getAll(String neighborhood) {

        if(neighborhood == null){
            return registrationRepository.findAll();
        }else{
            return registrationRepository.findStudentRegistrationOfNeighborhood(neighborhood);
        }

    }

    @Override
    public void delete(Long id) {}

}
