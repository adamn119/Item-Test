package com.testitem.ItemCRUD.service;

import com.testitem.ItemCRUD.model.entity.Item;
import com.testitem.ItemCRUD.model.request.ItemRequest;
import com.testitem.ItemCRUD.model.response.ItemResponse;
import com.testitem.ItemCRUD.repository.ItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ItemService {
    private final ItemRepository repository;

    public ItemResponse createdItem(ItemRequest itemRequest) {
        var item = new Item(null, itemRequest.getNama_barang(), itemRequest.getJumlah_barang(), itemRequest.getHarga_barang());
        var savedItem = repository.save(item);

        return new ItemResponse(
                savedItem.getId(),
                savedItem.getNama_barang(),
                savedItem.getJumlah_barang(),
                savedItem.getHarga_barang());
    }

    public ItemResponse ReadItemById(Long id){
        return repository.findById(id).map(i -> new ItemResponse(i.getId(), i.getNama_barang(), i.getJumlah_barang(), i.getHarga_barang()))
                .orElseThrow(NullPointerException::new);
    }
    public ItemResponse updateItemById(Long id, ItemRequest newItem){
        var isItemExists = repository.existsById(id);
        if (!isItemExists){
            throw new IllegalArgumentException();
        }
        var item = new Item (null, newItem.getNama_barang(), newItem.getJumlah_barang(), newItem.getHarga_barang());
        item.setId(id);
        var savedItem = repository.save(item);
        return new ItemResponse(savedItem.getId(), savedItem.getNama_barang(), savedItem.getJumlah_barang(), savedItem.getHarga_barang());
    }
    public void deleteItemById(Long id){
        var isItemExists = repository.existsById(id);
        if (!isItemExists){
            throw new IllegalArgumentException();
        }
        repository.delete(repository.getById(id));
    }
}
