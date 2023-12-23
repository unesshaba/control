package org.sid.control_test;

import org.sid.control_test.dtos.ComputerDTO;
import org.sid.control_test.repositories.ComputerRepository;
import org.sid.control_test.service.ComputerManage;
import org.sid.control_test.service.ComputerManageComputer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ControlTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControlTestApplication.class, args);
    }

    @Bean
        CommandLineRunner start(  ComputerManageComputer computerManage){
          return args -> {
            computerManage.SaveComputer(ComputerDTO.builder()
                    .proce(123L)
                    .ram(8L)
                    .hardDisc("500GB SSD")
                    .price(899.99f)
                    .build());
            computerManage.SaveComputer(ComputerDTO.builder()
                    .proce(456L)
                    .ram(16L)
                    .hardDisc("1TB HDD")
                    .price(1299.99f)
                    .build());
            computerManage.SaveComputer(ComputerDTO.builder()
                    .proce(456L)
                    .ram(16L)
                    .hardDisc("2TB HDD")
                    .price(7599.99f)
                    .build());
            computerManage.SaveComputer(ComputerDTO.builder()
                    .proce(456L)
                    .ram(16L)
                    .hardDisc("3TB HDD")
                    .price(86599.99f)
                    .build());


        };
 }
}
