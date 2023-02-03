package lk.ijse.dep9.app.api;

import lk.ijse.dep9.app.dto.EmployeeDTO;
import lk.ijse.dep9.app.entity.Employee;
import lk.ijse.dep9.app.repository.EmployeeRepository;
import lk.ijse.dep9.app.service.EmployeeService;
import lk.ijse.dep9.app.util.Transformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
@CrossOrigin
public class EmployeeController {
    private Transformer transformer;
    @Autowired
    private EmployeeService employeeService;
    @GetMapping
    public List<EmployeeDTO> getAllEmployees(){
        return employeeService.getAllEmployee();
    }
    @PostMapping
    public EmployeeDTO createEmployee(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.createNewEmployee(employeeDTO);
    }
    @GetMapping("/{id}")
    public EmployeeDTO getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeDetails(id);
    }
}
