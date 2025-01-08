package uz.jahonservice.crm1.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.jahonservice.crm1.DTO.UserDTO;
import uz.jahonservice.crm1.entity.User;
import uz.jahonservice.crm1.repository.GroupRepository;
import uz.jahonservice.crm1.repository.UserRepository;
import uz.jahonservice.crm1.service.mapper.UserMapper;
import uz.jahonservice.crm1.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final GroupRepository groupRepository;
    private final UserMapper userMapper;

    @Override
    public List<UserDTO> getList() {
        List<User> all = userRepository.findAll();
        List<UserDTO> userDTOList = new ArrayList<>();

        List<UserDTO> list = all.stream().map(user -> userMapper.toDtoWithGroup(user)).toList();

//        UserDTO userDTO = userMapper.toDto();

        return null;
    }
}
