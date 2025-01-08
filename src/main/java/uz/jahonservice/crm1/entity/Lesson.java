package uz.jahonservice.crm1.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "lesson")
public class Lesson extends BaseEntity{

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    LocalDateTime startTime;

    @Column(nullable = false)
    LocalDateTime endTime;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;

}