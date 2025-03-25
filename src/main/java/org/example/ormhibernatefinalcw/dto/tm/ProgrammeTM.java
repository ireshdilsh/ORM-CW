package org.example.ormhibernatefinalcw.dto.tm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProgrammeTM {
    private int id;
    private String name;
    private String duration;
    private Double fees;
}
