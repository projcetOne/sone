package com.example.sec.controller;

import com.example.sec.entity.Person;
import com.example.sec.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@Controller
@RequiredArgsConstructor
public class PersonController {
    private final PersonRepository personRepository;



    @PostMapping("/users")
    public String personSave(Person p) {

        p.setPersonName("aa");
        p.setAge(10);
        personRepository.save(p);
        return "완료";

    }
}
