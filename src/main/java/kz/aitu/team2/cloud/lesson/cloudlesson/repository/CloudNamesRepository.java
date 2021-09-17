package kz.aitu.team2.cloud.lesson.cloudlesson.repository;

import kz.aitu.team2.cloud.lesson.cloudlesson.model.CloudName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudNamesRepository extends JpaRepository<CloudName, Integer> {
}
