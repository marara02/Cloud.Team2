package kz.aitu.team2.cloud.lesson.cloudlesson.service;
import kz.aitu.team2.cloud.lesson.cloudlesson.model.Name;

import java.util.List;
public interface INameService {
    List<Name> findAll();
    public Name create(Name name);
}
