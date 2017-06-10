package ru.itis.exam.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.itis.exam.model.Expression;

/**
 * Created by VladislavTitov on 08.06.2017.
 */
@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getCalc(Model model){
        model.addAttribute(new Expression());
        return "calc";
    }

    @RequestMapping(value = "/execute", method = RequestMethod.POST)
    public String executeExpression(@ModelAttribute("exp") Expression expression){
        System.out.println(expression);
        if (expression.getOperator().equals("+")){

        }
        return "calc";
    }

}
