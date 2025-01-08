package uz.jahonservice.crm1.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import uz.jahonservice.crm1.entity.User;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GroupDTO {

    @NotBlank(message = "group cannot be null")
    private String groupName;

    private LocalDate createDate;

    private UserDTO userDTO;

    List<LessonDTO> lessonList;


}
