package org.sid.control_test.service;

import org.sid.control_test.dtos.ComputerDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ComputerManage {
    ComputerDTO getComputerByProce(Long proce);
    ComputerDTO getComputerByPrice(Long price);
    ComputerDTO SaveComputer(ComputerDTO computerDTO);
    void deleteComputer(Long id);
    List<ComputerDTO> getAllComputers();
}
