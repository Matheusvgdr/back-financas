package com.projetos.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "tb006_monthly_expense")
public class MonthlyExpenseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    public UserModel user;

    public BigDecimal totalAmount;
    public LocalDate month;
}
