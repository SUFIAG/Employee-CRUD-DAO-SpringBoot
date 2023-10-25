package com.decoder135.springboot.cruddemo.dao;

import com.decoder135.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// Spring provides an annotation for the changing the default endpoint i.e, in this case "/employees"

@RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it....no need to write any code LOL!
}
