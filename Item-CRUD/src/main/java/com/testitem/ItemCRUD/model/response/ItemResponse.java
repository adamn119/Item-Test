package com.testitem.ItemCRUD.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ItemResponse {
    private Long id;
    private String NamaBarang;
    private  Long JumlahBarang;
    private String HargaBarang;
}
