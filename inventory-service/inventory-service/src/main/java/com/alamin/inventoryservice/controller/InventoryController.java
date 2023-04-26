package com.alamin.inventoryservice.controller;

import com.alamin.inventoryservice.interfaces.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class InventoryController {
    private final InventoryService inventoryService;
    @GetMapping("/inventory/{skuCode}")
    public ResponseEntity<?> isInStock(@PathVariable("skuCode") String skuCode){
//        inventoryService.isInStock(skuCode);
        return new ResponseEntity<>(inventoryService.isInStock(skuCode), HttpStatus.OK);
    }

}
