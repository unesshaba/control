package org.sid.control_test.web;

import org.sid.control_test.dtos.ComputerDTO;
import org.sid.control_test.entities.Computer;
import org.sid.control_test.mappers.ComputerMapper;
import org.sid.control_test.service.ComputerManage;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ComputerGraphQLController {
    private final ComputerManage computerManage;
    private final ComputerMapper computerMapper;

    public ComputerGraphQLController(ComputerManage computerManage, ComputerMapper computerMapper) {
        this.computerManage = computerManage;
        this.computerMapper=computerMapper;
    }
    @QueryMapping
    public List<ComputerDTO>  getComputerByProce(@Argument Long proce){
        return computerManage.getComputerByProce(proce);
    }
    @QueryMapping
    public List<ComputerDTO> getComputerByPrice(@Argument Long price){
        return computerManage.getComputerByPrice(price);
    }
    @MutationMapping
    public ComputerDTO saveComputer(@Argument ComputerDTO computerDTO){
        return computerManage.SaveComputer(computerDTO);
    }
    @MutationMapping
    public ComputerDTO delete(@Argument Long id){
        return computerManage.deleteComputer(id);
    }
}
