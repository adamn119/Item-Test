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
    private String nama_barang;
    private  Long jumlah_barang;
    private String harga_barang;
}
