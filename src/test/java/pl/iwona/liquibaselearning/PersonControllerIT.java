package pl.iwona.liquibaselearning;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import static org.junit.jupiter.api.Assertions.*;


@AutoConfigureMockMvc
class PersonControllerIT extends BaseIT {

    @Autowired
    private MockMvc mockMvc;
//    private MockMvcRequestBuilders mockMvcRequestBuilders;

    @Test
    void getPearson() throws Exception {
        mockMvc.perform(get("/"))
        .andExpect(MockMvcResultMatchers.jsonPath("$", hasSize(4)));
    }
}