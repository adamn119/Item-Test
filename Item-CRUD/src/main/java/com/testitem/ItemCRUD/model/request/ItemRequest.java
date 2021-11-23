package com.testitem.ItemCRUD.model.request;

import lombok.Data;

@Data
public class ItemRequest {
    private String nama_barang;
    private Long jumlah_barang;
    private String harga_barang;
}
