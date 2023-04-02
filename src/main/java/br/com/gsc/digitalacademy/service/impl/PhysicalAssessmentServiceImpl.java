package br.com.gsc.digitalacademy.service.impl;

import br.com.gsc.digitalacademy.entity.PhysicalAssessment;
import br.com.gsc.digitalacademy.entity.Student;
import br.com.gsc.digitalacademy.entity.form.PhysicalAssessmentForm;
import br.com.gsc.digitalacademy.entity.form.PhysicalAssessmentUpdateForm;
import br.com.gsc.digitalacademy.repository.PhysicalAssessmentRepository;
import br.com.gsc.digitalacademy.repository.StudentRepository;
import br.com.gsc.digitalacademy.service.IPhysicalAssessmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhysicalAssessmentServiceImpl implements IPhysicalAssessmentService {
    @Autowired
    private PhysicalAssessmentRepository physicalAssessmentRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public PhysicalAssessment create(PhysicalAssessmentForm form) {
        PhysicalAssessment physicalAssessment = new PhysicalAssessment();
        Student student = studentRepository.findById(form.getStudentId()).get();

        physicalAssessment.setStudent(student);
        physicalAssessment.setWeight(form.getWeight());
        physicalAssessment.setHeight(form.getHeight());

        return physicalAssessmentRepository.save(physicalAssessment);
    }

    @Override
    public PhysicalAssessment get(Long id) {
        return null;
    }

    @Override
    public List<PhysicalAssessment> getAll() {

        return physicalAssessmentRepository.findAll();
    }

    @Override
    public PhysicalAssessment update(Long id, PhysicalAssessmentUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {}
}
