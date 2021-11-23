package com.testitem.ItemCRUD.controller;

import com.testitem.ItemCRUD.model.request.ItemRequest;
import com.testitem.ItemCRUD.model.response.ItemResponse;
import com.testitem.ItemCRUD.service.ItemService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping(path = {"item"})
public class ItemController {

    private final ItemService service;

    @PostMapping
    public ItemResponse createItem(
            @RequestBody ItemRequest itemRequest
    ) {
        return service.createdItem(itemRequest);


    }

    @GetMapping(path = "/{id}")
    public ItemResponse readItemById(
            @PathVariable(value = "id") Long id
    ) {
        return service.ReadItemById(id);
    }
    @PutMapping(path = "/{id}")
    public ItemResponse updateItemById(
            @PathVariable(value = "id") Long id, @RequestBody ItemRequest itemRequest
    ){
     return service.updateItemById(id, itemRequest);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteItemById(@PathVariable(value = "id") long id){
        service.deleteItemById(id);
    }

}