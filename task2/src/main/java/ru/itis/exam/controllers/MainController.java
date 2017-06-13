package ru.itis.exam.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.itis.exam.model.Expression;

/**
 * Created by VladislavTitov on 08.06.2017.
 */
@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getCalc(){
        return "calc";
    }

    @RequestMapping(value = "/execute", method = RequestMethod.POST)
    public String executeExpression(@RequestParam("first") Double first, @RequestParam("second") Double second, @RequestParam("operator")
                                    Character operator){
        System.out.println(first);
        System.out.println(second);
        System.out.println(operator);
        double result;
        switch (operator){
            case '+':
                result = first * second;
                break;
        }

        return "calc";
    }

}
