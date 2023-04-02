package br.com.gsc.digitalacademy.service.impl;

import br.com.gsc.digitalacademy.entity.PhysicalAssessment;
import br.com.gsc.digitalacademy.entity.Student;
import br.com.gsc.digitalacademy.entity.form.StudentForm;
import br.com.gsc.digitalacademy.entity.form.StudentUpdateForm;
import br.com.gsc.digitalacademy.infra.utils.JavaTimeUtils;
import br.com.gsc.digitalacademy.repository.StudentRepository;
import br.com.gsc.digitalacademy.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository repository;
    @Override
    public Student create(StudentForm form) {
        Student student = new Student();
        student.setName(form.getName());
        student.setCpf(form.getCpf());
        student.setNeighborhood(form.getNeighborhood());
        student.setDateOfBirth(form.getDateOfBirth());

        return repository.save(student);
    }

    @Override
    public Student get(Long id) {
        return null;
    }

    @Override
    public List<Student> getAll(String dateOfBirth) {

        if(dateOfBirth == null) {
            return repository.findAll();
        } else {
            LocalDate localDate = LocalDate.parse(dateOfBirth, JavaTimeUtils.LOCAL_DATE_FORMATTER);
            return repository.findByDateOfBirth(localDate);
        }

    }

    @Override
    public Student update(Long id, StudentUpdateForm formUpdate) {


            return null;

    }

    @Override
    public void delete(Long id) {
    }

    @Override
    public List<PhysicalAssessment> getAllPhysicalAssessmentId(Long id) {

        Student student = repository.findById(id).get();

        return student.getAssessments();

    }
}
