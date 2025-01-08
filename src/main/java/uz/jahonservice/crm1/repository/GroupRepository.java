package uz.jahonservice.crm1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.jahonservice.crm1.entity.Group;

import java.util.UUID;

public interface GroupRepository extends JpaRepository<Group, UUID> {
}
