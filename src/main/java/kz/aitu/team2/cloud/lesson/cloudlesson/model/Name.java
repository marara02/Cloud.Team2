package kz.aitu.team2.cloud.lesson.cloudlesson.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "names")
public class Name {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    public Name() {
    }

    public Name(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Name(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
