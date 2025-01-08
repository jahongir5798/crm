package uz.jahonservice.crm1.DTO;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import uz.jahonservice.crm1.entity.Group;
import uz.jahonservice.crm1.entity.enums.GenderEnum;
import uz.jahonservice.crm1.entity.enums.RoleEnum;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {


    private UUID id;

    @NotBlank(message = "first name cannot be null")
    private String firstName;

    @NotBlank(message = "last name cannot be null")
    private String lastName;

    @NotBlank(message = "email cannot be null")
    private String email;

    @NotBlank(message = "login cannot be null")
    private String login;

    @Size(min = 8, max = 16, message = "password length must be between 8 and 16 characters")
    private String password;

    private RoleEnum role;

    private GenderEnum gender;

    private LocalDate created_at;

    private LocalDate updated_at;

    private LocalDate deleted_at;

    List<GroupDTO> groupList;

}
