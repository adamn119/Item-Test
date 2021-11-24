package com.testitem.ItemCRUD.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.security.PrivateKey;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Barang")
public class Item {
    @Id
    @Column(nullable = false, unique = true)
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String NamaBarang;
    private  Long JumlahBarang;
    private String HargaBarang;
}
