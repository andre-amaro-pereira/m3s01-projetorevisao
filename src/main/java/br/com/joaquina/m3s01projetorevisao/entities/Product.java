package br.com.joaquina.m3s01projetorevisao.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
@Data
@Entity
public class Product {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "product_id")
    private Long id;
    @Column(length = 50, nullable = false)
    private String name;

    @Column(columnDefinition ="text")
    private String description;
    @Column(precision = 19, scale = 2, nullable = false)
    private BigDecimal price;
    @Column(name = "qty_stock", precision = 19, scale = 4, nullable = false)
    private BigDecimal qtyStock = BigDecimal.ZERO;
}
