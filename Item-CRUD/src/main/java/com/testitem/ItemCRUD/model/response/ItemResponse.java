package com.testitem.ItemCRUD.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ItemResponse {
    private Long id;
    private String Nama_barang;
    private Long Jumlah_barang;
    private String Harga_barang;
}
