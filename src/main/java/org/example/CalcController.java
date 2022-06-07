package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CalcController {
    @RequestMapping("/add")
    public ModelAndView add(@RequestParam int n1, @RequestParam int n2){
        ModelAndView mv = new ModelAndView();
        System.out.print("add method was called! ");
        System.out.println(n1+n2);
        mv.setViewName("result");
        mv.addObject("result",n1+n2);
        return mv;
    }
}
