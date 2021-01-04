package zatribune.spring.petclinic.data.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


@Data
@EqualsAndHashCode(callSuper = true,exclude = {"visits"})
@Entity
@Table(name = "pets")
public class Pet extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "pet_type",referencedColumnName = "id")
    private PetType petType;
    @ManyToOne
    @JoinColumn(name = "owner",referencedColumnName = "id")
    private Owner owner;
    private LocalDate birthDate;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "pet")
    private Set<Visit>visits=new HashSet<>();

}
