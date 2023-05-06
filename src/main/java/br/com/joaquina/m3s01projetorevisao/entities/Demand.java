package br.com.joaquina.m3s01projetorevisao.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Demand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "demand_id")
    private Long id;
    @Column(nullable = false)
    private Date dateOrdered = new Date();
    @ManyToOne //references customer_id
    @JoinColumn(name = "customer_id",nullable = false) //"@JoinColumn" pq as 2 entidades estão trabalhando com as tabelas
    private Customer customer;

    @Column(name = "total_items", precision = 19, scale = 2, nullable = false)
    private BigDecimal totalItems;
    @Column(precision = 19, scale = 2, nullable = false)
    private BigDecimal total;

    @OneToMany(mappedBy = "demand", cascade = CascadeType.ALL, orphanRemoval = true) //cascade tem controle de add exclur items,
    private List<DemandItem> items = new ArrayList<>();
}
