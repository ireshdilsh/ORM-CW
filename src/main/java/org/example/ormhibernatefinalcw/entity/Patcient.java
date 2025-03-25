package org.example.ormhibernatefinalcw.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "patcient")
@AllArgsConstructor 
@NoArgsConstructor
@Data
@Table(name = "patcient")
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

    public Patcient(String name, String email, int contact) {
        this.name = name;
        this.email = email;
        this.contact = contact;
    }
}
