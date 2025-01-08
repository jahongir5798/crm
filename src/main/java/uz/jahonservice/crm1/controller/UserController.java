package uz.jahonservice.crm1.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.jahonservice.crm1.DTO.UserDTO;
import uz.jahonservice.crm1.entity.User;
import uz.jahonservice.crm1.service.UserService;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("api/user")
public class UserController {

    private final UserService userService;

    @GetMapping("/get-list")
    public List<UserDTO> getList(){
        log.info("user controller get list method invoked");
        List<UserDTO> list = userService.getList();
        log.info("user controller get list method completed");
        return list;
    }
}
