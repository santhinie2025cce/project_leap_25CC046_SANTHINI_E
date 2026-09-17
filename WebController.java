package com.example.project_leap_25CC046_SANTHINI_E.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project_leap_25CC046_SANTHINI_E.model.Base;
import com.example.project_leap_25CC046_SANTHINI_E.model.Location;
import com.example.project_leap_25CC046_SANTHINI_E.model.Menu;
import com.example.project_leap_25CC046_SANTHINI_E.model.Student;

@RestController
public class WebController {

    @GetMapping("/add")
    public int calculate() {
        return 100 + 200;
    }

    @PostMapping("/calculateString")
    public String calculateString() {
        return "PLS GO AWAY";
    }

    @GetMapping("/calculate")
    public String calculate(int a, int b, String operation) {

        switch (operation) {

            case "+":
                return String.valueOf(a + b);

            case "-":
                return String.valueOf(a - b);

            case "*":
                return String.valueOf(a * b);

            default:
                return String.valueOf(a / b);
        }
    }

    @GetMapping("/Student")
    public Student getStudentDetails() {

        Student student = new Student();

        student.setName("Santhini");
        student.setDepartment("CCE");
        student.setRollno("25CC046");

        return student;
    }

    @GetMapping("/Location")
    public Base getLocation() {

        Location location = new Location();

        location.setName("Nagapattinam");
        location.setId("NGT");

        Base base = new Base();

        base.setResponseObject(List.of(location));

        return base;
    }

    @GetMapping("/Menu")
    public Menu getMenu() {

        Menu menu = new Menu();

        menu.setName("Santhini");
        menu.setDept("CCE");
        menu.setRollNo(46);
        menu.setActive(true);
        menu.setUsername("santhini46");

        return menu;
    }
}
