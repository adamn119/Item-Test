package com.testitem.ItemCRUD.repository;

import com.testitem.ItemCRUD.model.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository <Item, Long> {
}
