package kz.aitu.team2.cloud.lesson.cloudlesson.repository;

import kz.aitu.team2.cloud.lesson.cloudlesson.model.Name;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NamesRepository extends JpaRepository<Name, Long> {
    List<Name> findByName(String name);
}
