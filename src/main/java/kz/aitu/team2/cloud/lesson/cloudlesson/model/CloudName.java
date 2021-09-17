package kz.aitu.team2.cloud.lesson.cloudlesson.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "NAMES")

public class CloudName {

    @Id
    @GeneratedValue
    private int id;
    private String name;
}
