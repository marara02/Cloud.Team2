package kz.aitu.team2.cloud.lesson.cloudlesson.controller;

import kz.aitu.team2.cloud.lesson.cloudlesson.model.Name;
import kz.aitu.team2.cloud.lesson.cloudlesson.repository.NamesRepository;
import kz.aitu.team2.cloud.lesson.cloudlesson.service.INameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyNameController {

    @Autowired
    private NamesRepository namesRepository;

    @Autowired
    private INameService iNameService;

    @GetMapping("/listNames")
    public String getNames(Model model) {
        var name = (List<Name>) namesRepository.findAll();
        model.addAttribute("names", name);
        return "index";
    }

    @GetMapping("/getHello")
    public String helloSecond(@RequestParam(value = "name") String name, Model model){
        Name name1 = new Name();
        name1.setName(name);
        Name newName = iNameService.create(name1);
        model.addAttribute("newName", newName);
        System.out.println(name);
        return String.format("Hello %s!", name);
    }

    @GetMapping("/page")
    public String showHomePage() {
        return "main";
    }
}
