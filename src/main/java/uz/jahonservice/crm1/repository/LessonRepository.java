package uz.jahonservice.crm1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.jahonservice.crm1.entity.Lesson;

import java.util.UUID;

public interface LessonRepository extends JpaRepository<Lesson, UUID> {
}
