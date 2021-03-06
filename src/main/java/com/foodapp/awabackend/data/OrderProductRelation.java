package com.foodapp.awabackend.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(OrderProductRelationId.class)
@Table(name = "orders_products")
public class OrderProductRelation {

    @Id
    @Column(name = "order_id")
    public Long orderId;

    @Id
    @Column(name = "product_id")
    public Long productId;

    @Column(name = "amount")
    public int amount;

    @Column(name = "product_price")
    public double productPrice;

    public OrderProductRelation() {}

    public OrderProductRelation(int amount, double productPrice) {
        this.amount = amount;
        this.productPrice = productPrice;
    }
}