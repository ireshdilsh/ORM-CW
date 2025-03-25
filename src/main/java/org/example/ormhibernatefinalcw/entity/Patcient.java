package org.example.ormhibernatefinalcw.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor 
@NoArgsConstructor
@Data
public class Patcient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pat_id" ,nullable = false)
    private int id;
    private String name;
    @Column(name = "email" ,nullable = false)
    private String email;
    @Column(name = "contact" ,nullable = false)
    private int contact;
}
