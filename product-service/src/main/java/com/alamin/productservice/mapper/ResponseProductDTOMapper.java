package com.alamin.productservice.mapper;

import com.alamin.productservice.dto.request.RequestProductDTO;
import com.alamin.productservice.dto.response.ResponseProductDTO;
import com.alamin.productservice.model.Product;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class ResponseProductDTOMapper implements Function<Product, ResponseProductDTO> {
//






    @Override
    public ResponseProductDTO apply(Product product) {
        return null;
    }
}
