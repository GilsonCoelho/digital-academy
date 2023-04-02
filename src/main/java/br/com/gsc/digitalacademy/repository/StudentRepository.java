package br.com.gsc.digitalacademy.repository;

import br.com.gsc.digitalacademy.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface StudentRepository  extends JpaRepository<Student, Long> {

    /**
     *
     * @param dateOfBirth: students' date of birth
     * @return list of all students with the date of birth passed as a function parameter
     */
    List<Student> findByDateOfBirth(LocalDate dateOfBirth);
}
