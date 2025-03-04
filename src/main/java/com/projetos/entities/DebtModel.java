package com.projetos.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb003_debt")
public class DebtModel {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    public UserModel user;

    public BigDecimal amount;

    public LocalDate dateDebt;

    @OneToOne
    @JoinColumn(name = "tag_id")
    public TagModel tag;  // Tag associada à dívida, caso exista

    // A dívida pode ter uma anotação
    public String note;

}
