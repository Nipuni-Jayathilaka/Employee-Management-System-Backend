package lk.ijse.dep9.app.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO implements Serializable {
    private long id;
    @NotBlank(message = "First name cannot be empty or null")
    @Pattern(regexp = "^[a-zA-Z ]+$",message = "Please enter a valid name")
    private String firstName;
    @NotBlank(message = "Last name cannot be empty or null")
    @Pattern(regexp = "^[a-zA-Z ]+$",message = "Please enter a valid name")
    private String lastName;
    @NotBlank(message = "Email address cannot be empty or null")
    @Pattern(regexp = "^[a-zA-Z ]+@gmail.com$",message = "Please enter a valid name")
    private String emailId;
}
