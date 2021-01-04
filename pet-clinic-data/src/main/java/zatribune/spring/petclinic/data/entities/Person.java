package zatribune.spring.petclinic.data.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Person extends BaseEntity{

    @Column(name = "first_name")//default naming strategy for hibernate --> the snake-case
    private String firstName;
    private String lastName;

}
