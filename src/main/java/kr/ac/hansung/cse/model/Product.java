package kr.ac.hansung.cse.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@Entity
@Table(name = "productTable")
public class Product implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -8078750026842402909L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int id;

    private String name;
    private String category;
    private int price;
    private String manufacturer;
    private int unitInStock;
    private String description;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}