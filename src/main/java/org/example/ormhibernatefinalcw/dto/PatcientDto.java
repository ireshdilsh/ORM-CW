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
}
