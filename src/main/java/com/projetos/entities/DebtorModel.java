package com.projetos.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb002_debtor")
public class DebtorModel extends PanacheEntityBase {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String name;
}
