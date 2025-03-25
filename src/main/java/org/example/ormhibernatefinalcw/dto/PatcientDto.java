package org.example.ormhibernatefinalcw.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PatcientDto {
    private int id;
    private String name;
    private String email;
    private int contact;

    public PatcientDto(String name, String email, int contact) {
        this.name = name;
        this.email = email;
        this.contact = contact;
    }
}
