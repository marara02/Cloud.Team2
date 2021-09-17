package kz.aitu.team2.cloud.lesson.cloudlesson.controller;

import kz.aitu.team2.cloud.lesson.cloudlesson.model.CloudName;
import kz.aitu.team2.cloud.lesson.cloudlesson.service.CloudNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CloudNamesController {

    @Autowired
    private CloudNameService cloudNameService;

    @PostMapping("/addName")
    public CloudName addName(@RequestBody CloudName cloudName) {
        return cloudNameService.saveName(cloudName);
    }

    @PostMapping("/addNames")
    public List<CloudName> addNames(@RequestBody List<CloudName> cloudNames) {
        return cloudNameService.saveNames(cloudNames);
    }

    @GetMapping("/listName")
    public List<CloudName> findAllNames() {
        return cloudNameService.getNames();
    }

    @GetMapping("/listName/{id}")
    public CloudName findByNameId(int id) {
        return cloudNameService.getNameById(id);
    }

    @PutMapping("/update")
    public CloudName updateName(@RequestBody CloudName cloudName) {
        return cloudNameService.updateName(cloudName);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteName(@PathVariable int id) {
        return cloudNameService.deleteName(id);
    }


}
