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

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class OwnerServiceImplTest2 {

    @Mock
    OwnerRepository ownerRepository;
    @InjectMocks
    OwnerServiceImpl ownerService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void findByLastName() {
        Owner owner = Owner.builder().firstName("Muhammad").lastName("Ali").build();

        when(ownerService.findByLastName("Ali")).thenReturn(owner);
        Owner returnedOwner = ownerService.findByLastName("Ali");

        assertNotNull(returnedOwner);
        assertEquals(owner, returnedOwner);
        verify(ownerRepository, times(1)).findOwnerByLastName(anyString());
    }

    @Test
    void findById() {
        Owner owner = Owner.builder().firstName("Muhammad").lastName("Ali").build();
        Long id=20L;
        owner.setId(id);
        Optional<Owner>optionalOwner=Optional.of(owner);

        when(ownerRepository.findById(id)).thenReturn(optionalOwner);//the repository
        Owner returnedOwner = ownerService.findById(id);//the service utilizing the repository

        assertNotNull(returnedOwner);
        assertEquals(id,returnedOwner.getId());
        verify(ownerRepository, times(1)).findById(anyLong());
    }

    @Test
    void save() {
        Owner owner = Owner.builder().firstName("Muhammad").lastName("Ali").build();

        when(ownerRepository.save(any())).thenReturn(owner);//the repository
        Owner returnedOwner = ownerService.save(owner);//the service utilizing the repository

        assertNotNull(returnedOwner);
        assertEquals(owner, returnedOwner);
        verify(ownerRepository, times(1)).save(any());
    }

    @Test
    void delete() {
        Owner owner = Owner.builder().firstName("Muhammad").lastName("Ali").build();

        //the repository
        ownerService.delete(owner);//the service utilizing the repository
        verify(ownerRepository,times(1)).delete(any());
    }

    @Test
    void deleteById() {
    }

    @Test
    void findAll() {
        Set<Owner> set=new HashSet<>();
        Owner owner1 = Owner.builder().firstName("Muhammad").lastName("Ali").build();
        Owner owner2 = Owner.builder().firstName("Sara").lastName("Adel").build();
        set.add(owner1);
        set.add(owner2);
        when(ownerRepository.findAll()).thenReturn(set);//the repository
        Set<Owner> returnedSet = ownerService.findAll();//the service utilizing the repository

        assertNotNull(returnedSet);
        assertEquals(2,returnedSet.size());
        verify(ownerRepository,times(1)).findAll();
    }
}