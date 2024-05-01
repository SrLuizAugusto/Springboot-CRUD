package com.onix.springboot.models;

import jakarta.persistence.*;
import lombok.Data;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

import java.util.UUID;

@Entity
@Table(name = "SHOPS")
@Data
public class ShopModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID shopId;

    private String name;

    private DateTimeLiteralExpression.DateTime createdAt;
}
