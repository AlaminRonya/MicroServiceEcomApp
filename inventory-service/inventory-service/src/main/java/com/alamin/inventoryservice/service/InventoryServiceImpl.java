package com.alamin.inventoryservice.service;

import com.alamin.inventoryservice.interfaces.InventoryService;
import com.alamin.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class InventoryServiceImpl implements InventoryService {
    private final InventoryRepository inventoryRepository;

    @Transactional(readOnly = true)
    @Override
    public boolean isInStock(String skuCode) {
//        inventoryRepository.findBySkuCode().isPresent();
        return inventoryRepository.findBySkuCode(skuCode).isPresent();
    }
}
