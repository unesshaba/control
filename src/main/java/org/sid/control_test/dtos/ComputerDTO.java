package org.sid.control_test.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ComputerDTO {
    private Long proce;
    private Long ram;
    private String hardDisc;
    private float price;
}
