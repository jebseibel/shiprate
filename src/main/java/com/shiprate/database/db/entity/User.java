package com.shiprate.database.db.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "account")
public class User implements Serializable {
    private static final long serialVersionUID = 330515747211210728L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //normally, I'd use GUIDs
    private Integer id;

    @Column(name = "name", length = 64, nullable = false, unique = true)
    private String name;

    @Column(name = "email", length = 64, nullable = false, unique = true)
    private String email;
}