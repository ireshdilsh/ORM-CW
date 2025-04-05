package org.example.ormhibernatefinalcw.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ThereoistDto {
    private int id;
    private String name;
    private ProgrammeDto proID;
    private int contact;

    public ThereoistDto(String name, ProgrammeDto proID, int contact) {
        this.name = name;
        this.proID = proID;
        this.contact = contact;
    }


    public ThereoistDto(String name) {
        this.name = name;
    }
}
