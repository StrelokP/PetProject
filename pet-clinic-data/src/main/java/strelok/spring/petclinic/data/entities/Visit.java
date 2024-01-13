package strelok.spring.petclinic.data.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "visits")
public class Visit extends BaseEntity {
    private LocalDate date;
    private String description;
    @ManyToOne
    @JoinColumn(name = "pet", referencedColumnName = "id")
    private Pet pet;

}
