package lk.ijse.dep9.app.util;

import lk.ijse.dep9.app.dto.EmployeeDTO;
import lk.ijse.dep9.app.entity.Employee;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class Transformer {
    private final ModelMapper modelMapper;

    public Transformer(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public EmployeeDTO toEmployeeDTO(Employee employee){
        return modelMapper.map(employee,EmployeeDTO.class);
    }
    public Employee toEmployee(EmployeeDTO employeeDTO){
        return modelMapper.map(employeeDTO,Employee.class);
    }
}
