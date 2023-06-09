package br.com.joaquina.m3s01projetorevisao.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
public class DemandPayment {
    @Id
    @Column(name = "demand_payment_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="demand_id",nullable = false)
    private Demand demand;
    @ManyToOne
    @JoinColumn(name="payment_method_id",nullable = false)
    private PaymentMethod paymentMethod;
    @Column(length = 30)
    private String cardNumber;
    @Column(length = 30)
    private String cardHolder;
    @Column(length = 30)
    private String cardThru;

    private Integer cardVerification;

}
