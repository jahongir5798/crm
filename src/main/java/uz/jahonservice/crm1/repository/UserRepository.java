package uz.jahonservice.crm1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.jahonservice.crm1.entity.User;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
