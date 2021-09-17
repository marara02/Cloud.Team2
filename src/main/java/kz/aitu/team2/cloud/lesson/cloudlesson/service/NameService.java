package kz.aitu.team2.cloud.lesson.cloudlesson.service;

import kz.aitu.team2.cloud.lesson.cloudlesson.model.Name;
import kz.aitu.team2.cloud.lesson.cloudlesson.repository.NamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class NameService implements INameService {

    @Autowired
    private NamesRepository namesRepository;

    @Override
    public List<Name> findAll(){
        var names = (List<Name>) namesRepository.findAll();
        return names;
    }

    @Override
    public Name create(Name name){
        return namesRepository.save(name);
    }
}
