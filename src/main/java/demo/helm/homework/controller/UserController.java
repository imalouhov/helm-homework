package demo.helm.homework.controller;

import demo.helm.homework.dto.UserDto;
import demo.helm.homework.service.UserService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController("api/v1/user")
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class UserController {

    UserService userService;

    @PostMapping("/save")
    public ResponseEntity<UserDto> addUser(@RequestBody UserDto dto) {
        return ResponseEntity.ok(userService.addUser(dto));
    }

    @GetMapping("/all")
    public ResponseEntity<List<UserDto>> getAllUsers() {
        return ResponseEntity.ok(userService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<UserDto>> getUserById(@PathVariable UUID id) {
        return ResponseEntity.ok(userService.getById(id));
    }

}
