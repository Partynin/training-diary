package bk.partinin.trainingdiary.controller;

import bk.partinin.trainingdiary.dto.UserDto;
import bk.partinin.trainingdiary.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/auth/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUsersList() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(userService.getAllUsers());
    }
}
