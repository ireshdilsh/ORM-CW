package org.example.ormhibernatefinalcw.dto.tm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.ormhibernatefinalcw.dto.ProgrammeDto;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PatcientTM {
    private int id;
    private String name;
    private String proName;
    private String email;
    private int contact;
    private ProgrammeDto programmeDto;

    public PatcientTM(int id, String name, String proName, String email, int contact) {
        this.id = id;
        this.name = name;
        this.proName = proName;
        this.email = email;
        this.contact = contact;
    }
}
