package kz.aitu.team2.cloud.lesson.cloudlesson.service;

import kz.aitu.team2.cloud.lesson.cloudlesson.model.CloudName;
import kz.aitu.team2.cloud.lesson.cloudlesson.repository.CloudNamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudNameService {

    @Autowired
    private CloudNamesRepository cloudNamesRepository;

    public CloudName saveName(CloudName cloudName) {
        return cloudNamesRepository.save(cloudName);
    }

    public List<CloudName> saveNames(List<CloudName> cloudNames) {
        return cloudNamesRepository.saveAll(cloudNames);
    }

    public List<CloudName> getNames() {
        return cloudNamesRepository.findAll();
    }

    public CloudName getNameById(int id) {
        return cloudNamesRepository.findById(id).orElse(null);
    }

    public String deleteName(int id) {
        cloudNamesRepository.deleteById(id);
        return "Name removed " + id;
    }

    public CloudName updateName(CloudName cloudName) {
        CloudName existingName = cloudNamesRepository.findById(cloudName.getId()).orElse(null);
        existingName.setName(cloudName.getName());
        return cloudNamesRepository.save(existingName);
    }
}
