package com.alamin.productservice.service;

import com.alamin.productservice.dto.request.RequestProductDTO;
import com.alamin.productservice.interfaces.ProductService;
import com.alamin.productservice.mapper.RequestProductDTOMapper;
import com.alamin.productservice.model.Product;
import com.alamin.productservice.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService {
    private final RequestProductDTOMapper requestProductDTOMapper;
    private final ProductRepository productRepository;
    @Override
    public void add(RequestProductDTO dto) {
        final Product product = requestProductDTOMapper.apply(dto);
        // TODO: 4/23/2023 Attachment no added
//        product.setProductAttachmentList(null);
        productRepository.save(product);
    }
}
