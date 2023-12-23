package org.sid.control_test.service;

import org.modelmapper.ModelMapper;
import org.sid.control_test.dtos.ComputerDTO;
import org.sid.control_test.entities.Computer;
import org.sid.control_test.mappers.ComputerMapper;
import org.sid.control_test.repositories.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ComputerManageComputer implements ComputerManage {

    private ComputerRepository computerRepository;
    private ComputerMapper computerMapper;


    public ComputerManageComputer(ComputerMapper computerMapper,ComputerRepository computerRepository) {
        this.computerMapper = computerMapper;
        this.computerRepository=computerRepository;
    }

    @Override
    public ComputerDTO getComputerByProce(Long proce) {
        return computerRepository.findComputerByProce(proce);
    }

    @Override
    public ComputerDTO getComputerByPrice(Long price) {
        return computerRepository.findComputerByProce(price);
    }

    @Override
    public ComputerDTO SaveComputer(ComputerDTO computerDTO) {
        Computer computer = computerMapper.toComputer(computerDTO);
        Computer savedComputer = computerRepository.save(computer);
        return computerMapper.fromComputer(savedComputer);
    }





    @Override
    public void deleteComputer(Long id) {
       computerRepository.deleteById(id);

    }
    @Override
    public List<ComputerDTO> getAllComputers() {
        List<Computer> computers = computerRepository.findAll();
        return computers.stream()
                .map(computerMapper::fromComputer)
                .collect(Collectors.toList());}
//    private ComputerDTO convertToDto(Computer computer) {
//        return modelMapper.map(computer, ComputerDTO.class);
//    }
//
//    private Computer convertToEntity(ComputerDTO computerDTO) {
//        return modelMapper.map(computerDTO, Computer.class);
//    }
}
