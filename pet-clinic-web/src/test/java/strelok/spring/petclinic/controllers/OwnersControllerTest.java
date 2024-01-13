package strelok.spring.petclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import strelok.spring.petclinic.data.entities.Owner;
import strelok.spring.petclinic.data.services.OwnerService;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(MockitoExtension.class)
class OwnersControllerTest {


    @Mock
    private OwnerService ownerService;
    @InjectMocks
    private OwnersController ownersController;
    private Set<Owner> ownerSet;
    @Captor
    private ArgumentCaptor<Set<Owner>>argumentCaptor;

    @BeforeEach
    void setUp() {
        ownerSet = new HashSet<>();
        ownerSet.add(Owner.builder().firstName("Muhammad").lastName("Ali").build());
        ownerSet.add(Owner.builder().firstName("Sara").lastName("Adel").build());

    }

    @Test
    void getOwnersPage() throws Exception {

        when(ownerService.findAll()).thenReturn(ownerSet);

        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(ownersController).build();
        mockMvc.perform(get("/ownersList"))
                .andExpect(status().isOk())
                .andExpect(view().name("/owners/ownersList"))
                .andExpect(model().attribute("owners", hasSize(2)));
    }
}