package uz.jahonservice.crm1.DTO;

import jakarta.persistence.Column;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LessonDTO {

    private String title;

    LocalDateTime startTime;

    LocalDateTime endTime;

}
