package list.empl.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import list.empl.backend.model.employee;

@Repository
public interface employeeRepository extends JpaRepository<employee, Long>{

}
