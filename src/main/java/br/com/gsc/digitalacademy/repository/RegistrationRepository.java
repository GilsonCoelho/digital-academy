package br.com.gsc.digitalacademy.repository;

import br.com.gsc.digitalacademy.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Long> {

    /**
     *
     * @param neighborhood neighborhood reference for the filter
     * @return list of enrolled students residing in the neighborhood passed as a parameter
     */
    @Query(value = "SELECT * FROM tb_registration m " +
            "INNER JOIN tb_student a ON m.student_id = a.id " +
            "WHERE a.neighborhood = :neighborhood", nativeQuery = true)
    //@Query("FROM Registration m WHERE m.student.neighborhood = :neighborhood ")
    List<Registration> findStudentRegistrationOfNeighborhood(String neighborhood);

    //List<Registration> findStudentRegistrationOfNeighborhood(String neighborhood);
}
