package org.example.ormhibernatefinalcw.dto.tm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PatcientTM {
    private int id;
    private String name;
    private String email;
    private int contact;
}
