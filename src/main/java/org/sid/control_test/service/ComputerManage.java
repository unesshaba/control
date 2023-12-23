package org.sid.control_test.service;

import org.sid.control_test.dtos.ComputerDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ComputerManage {
    List<ComputerDTO> getComputerByProce(Long proce);
    List<ComputerDTO> getComputerByPrice(Long price);
    ComputerDTO SaveComputer(ComputerDTO computerDTO);
    ComputerDTO deleteComputer(Long id);
    List<ComputerDTO> getAllComputers();
}
