package zatribune.spring.petclinic.data.entities;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.StreamSupport;


@Data
@EqualsAndHashCode(callSuper = true,exclude = {"pets"})
@Entity
@NoArgsConstructor
//@Table(name = "owners")//the name in our database
public class Owner extends Person{
    private String address;
    private String city;
    private String phone;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "owner")
    private Set<Pet> pets=new HashSet<>();
    @Builder
    public Owner(String firstName,String lastName,String address,String city,String phone){
        super.setFirstName(firstName);
        super.setLastName(lastName);
        this.address=address;
        this.city=city;
        this.phone=phone;
    }
    @Builder
    public Owner(String firstName,String lastName){
        super.setFirstName(firstName);
        super.setLastName(lastName);
    }
    public Set<Pet> addPet(Pet pet){
        pet.setOwner(this);
        pets.add(pet);
        return pets;
    }


}
