package org.example.ormhibernatefinalcw.dto;

import lombok.*;
import org.example.ormhibernatefinalcw.entity.Patcient;
import org.example.ormhibernatefinalcw.entity.Programme;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PaymentDto {
    private int id;
    private LocalDate date;
    private Double amount;
    private PatcientDto patcient;
    private ProgrammeDto programme;

    public PaymentDto(LocalDate date, Double amount, PatcientDto patcient, ProgrammeDto programme) {
        this.date = date;
        this.amount = amount;
        this.patcient = patcient;
        this.programme = programme;
    }
}
