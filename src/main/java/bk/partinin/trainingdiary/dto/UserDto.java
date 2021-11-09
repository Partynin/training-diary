package bk.partinin.trainingdiary.dto;

import bk.partinin.trainingdiary.model.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {

    private Long userId;
    private String username;
    private String email;
    private Instant created;
    private boolean isEnabled;
    private Set<Role> roles;
}
