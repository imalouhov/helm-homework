package demo.helm.homework.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

@Entity
@Table(name = "app_user")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserEntity {

    @Id
    @GeneratedValue
    UUID id;

    @Column(name = "first_name", length = 50, nullable = true, unique = false)
    String firstName;

    @Column(name = "last_name", length = 50, nullable = true, unique = false)
    String lastName;
}