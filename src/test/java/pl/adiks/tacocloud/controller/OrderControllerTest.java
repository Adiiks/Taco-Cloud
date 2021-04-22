package pl.adiks.tacocloud.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import pl.adiks.tacocloud.domain.Order;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest(OrderController.class)
class OrderControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void shouldShowOrderForm() throws Exception {
        mockMvc.perform(get("/orders/current"))
                .andExpect(status().isOk())
                .andExpect(view().name("orderForm"));
    }

    @Test
    void shouldProcessOrder() throws Exception {
        String requestBody = objectMapper.writeValueAsString(getOrder());
        mockMvc.perform(post("/orders").content(requestBody))
                .andExpect(status().is3xxRedirection());
    }

    private Order getOrder() {
        return new Order("Order123", "Żabikowska 12/23", "Luboń", "Poland", "62-030",
                "73281731493", "14/23", "123");
    }
}