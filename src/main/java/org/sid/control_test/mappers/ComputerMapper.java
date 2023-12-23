package org.sid.control_test.mappers;

import org.modelmapper.ModelMapper;
import org.sid.control_test.dtos.ComputerDTO;
import org.sid.control_test.entities.Computer;
import org.springframework.stereotype.Service;

@Service
public class ComputerMapper {
    private final ModelMapper modelMapper=new ModelMapper();

//    private ComputerDTO convertToDto(Computer computer) {
//        return modelMapper.map(computer, ComputerDTO.class);
//    }
//
//    private Computer convertToEntity(ComputerDTO computerDTO) {
//        return modelMapper.map(computerDTO, Computer.class);
//    }
//    public ComputerDTO fromComputer(Computer cumputer){
//        return this.modelMapper.map(cumputer, ComputerDTO.class);
//    }

    public ComputerDTO convertToDto(Computer computer) {
        return modelMapper.map(computer, ComputerDTO.class);
    }

    public Computer convertToEntity(ComputerDTO computerDTO) {
        return modelMapper.map(computerDTO, Computer.class);
    }

    public ComputerDTO fromComputer(Computer computer) {
        return modelMapper.map(computer, ComputerDTO.class);
    }

    public Computer toComputer(ComputerDTO computerDTO) {
        return modelMapper.map(computerDTO, Computer.class);
    }

}
