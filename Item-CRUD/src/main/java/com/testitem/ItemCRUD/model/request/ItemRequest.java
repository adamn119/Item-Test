package com.testitem.ItemCRUD.model.request;

import lombok.Data;

@Data
public class ItemRequest {
    private String NamaBarang;
    private  Long JumlahBarang;
    private String HargaBarang;
}
