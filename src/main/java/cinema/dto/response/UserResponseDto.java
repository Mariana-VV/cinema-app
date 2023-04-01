package cinema.dto.response;

import cinema.model.Role;

import java.util.Set;

public class UserResponseDto {
    private Long id;
    private String email;
    private Set<Role> roleSet;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
