package zatribune.spring.petclinic.data.services.jpa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import zatribune.spring.petclinic.data.entities.Owner;
import zatribune.spring.petclinic.data.repositories.OwnerRepository;
import zatribune.spring.petclinic.data.services.OwnerService;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;


class OwnerServiceImplTest {

    OwnerRepository ownerRepository;
    @Mock
    OwnerServiceImpl ownerService;

    @BeforeEach
    void setUp() {
      ownerService=new OwnerServiceImpl(ownerRepository);
      MockitoAnnotations.openMocks(this);
    }

    @Test
    void findByLastName() {
        Owner owner=Owner.builder().firstName("Muhammad").lastName("Ali").build();

        when(ownerService.findByLastName("Ali")).thenReturn(owner);
        Owner returnedOwner=ownerService.findByLastName("Ali");

        assertEquals(owner,returnedOwner);
        verify(ownerService,times(1)).findByLastName(anyString());

    }

    @Test
    void findById() {
    }

    @Test
    void save() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteById() {
    }

    @Test
    void findAll() {
    }
}