package org.sid.control_test.repositories;

import org.sid.control_test.dtos.ComputerDTO;
import org.sid.control_test.entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ComputerRepository extends JpaRepository<Computer,Long> {


    List<ComputerDTO> findComputerByProce( Long proce);

}
