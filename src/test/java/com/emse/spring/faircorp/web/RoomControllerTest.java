package com.emse.spring.faircorp.web;

import com.emse.spring.faircorp.api.RoomController;
import com.emse.spring.faircorp.api.WindowController;
import com.emse.spring.faircorp.dao.RoomDao;
import com.emse.spring.faircorp.dao.WindowDao;
import com.emse.spring.faircorp.model.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc()

public class RoomControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private RoomDao roomDao;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private WindowDao windowDao;

    Building building;


    @Test
    @WithMockUser(username = "admin", roles = "ADMIN")
    void shouldLoadARoomAndReturnNull() throws Exception {
        mockMvc.perform(get("/api/rooms/999").accept(APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(""));
    }

    @Test
    @WithMockUser(username = "admin", roles = "ADMIN")
    void shouldLoadARoomAndReturnValue() throws Exception {
        mockMvc.perform(get("/api/rooms/-9").accept(APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(-9L))
                .andExpect(jsonPath("$.name").value("Room2"));
    }

    @Test
    @WithMockUser(username = "admin", roles = "ADMIN")
    void shouldLoadAllRooms() throws Exception {
        mockMvc.perform(get("/api/rooms").accept(APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(APPLICATION_JSON));
    }

}
