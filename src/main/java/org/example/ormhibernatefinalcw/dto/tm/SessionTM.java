package org.example.ormhibernatefinalcw.dto.tm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.ormhibernatefinalcw.dto.ThereoistDto;

import java.time.LocalDate;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SessionTM {
    private int id;
    private String name;
    private LocalDate date;
    private String therepistName;
    private ThereoistDto thereoistDto;

    public SessionTM(int id, String name, LocalDate date, String therepistName) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.therepistName = therepistName;
    }
}
