package com.projetos.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "tb004_debt_debtor")
public class DebtDebtorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @ManyToOne
    @JoinColumn(name = "debt_id", nullable = false)
    public DebtModel debt; // Dívida associada

    @ManyToOne
    @JoinColumn(name = "debtor_id", nullable = false)
    public DebtorModel debtor; // Devedor associado à dívida

    public BigDecimal amountOwed; // Valor que o devedor deve dessa dívida
}