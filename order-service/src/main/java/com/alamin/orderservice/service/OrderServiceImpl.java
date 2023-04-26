package com.alamin.orderservice.service;

import com.alamin.orderservice.dto.RequestOrderDTO;
import com.alamin.orderservice.dto.RequestOrderLineItemDTO;
import com.alamin.orderservice.interfaces.OrderService;
import com.alamin.orderservice.model.Order;
import com.alamin.orderservice.model.OrderLineItems;
import com.alamin.orderservice.repository.OrderRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Transactional
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    @Override
    public void placeOrder(RequestOrderDTO dto) {
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        final List<OrderLineItems> orderLineItems = dto.orderLineItemDTOS().stream().map(this::mapToDto).toList();

        order.setOrderLineItemsList(orderLineItems);
        orderRepository.save(order);
    }

    private OrderLineItems mapToDto(RequestOrderLineItemDTO item) {
        OrderLineItems orderLineItems = new OrderLineItems();
        orderLineItems.setPrice(item.price());
        orderLineItems.setSkuCode(item.skuCode());
        orderLineItems.setQuantity(item.quantity());
        return orderLineItems;
    }
}
