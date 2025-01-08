package uz.jahonservice.crm1.service.mapper;

import org.springframework.stereotype.Component;
import uz.jahonservice.crm1.DTO.UserDTO;
import uz.jahonservice.crm1.entity.User;

@Component
public  class UserMapper {


    public UserDTO toDtoWithGroup(User user) {
        return UserDTO.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .password(user.getPassword())
                .role(user.getRole())              //todo: agar son bilan qaytsa get role with id qilish kerak
                .gender(user.getGender())          //todo: bunda ham xuddi roledagiday
                .created_at(user.getCreated_at())
                .updated_at(user.getUpdated_at())
                .deleted_at(user.getDeleted_at())
                .groupList(null)
                .build();
    }
}
