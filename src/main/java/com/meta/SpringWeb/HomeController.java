package com.meta.SpringWeb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

    @ModelAttribute("someConstantOrValue")
    public String setDataInModel() {
        return "default value";
    }

    @RequestMapping("/")
    public String home() {
        System.out.println("home method called");
        return "index";
        // because if you will see application.properties we have set prefix and suffix
        // for MVC
        // return "index.jsp";
    }

    // @RequestMapping("/add")
    // public String add(HttpServletRequest req, HttpSession session) {
    // int num1 = Integer.parseInt(req.getParameter("num1"));
    // int num2 = Integer.parseInt(req.getParameter("num2"));
    // session.setAttribute("result", (num1 + num2));
    // return "add.jsp";
    // }

    // if you want to work with data only use Model but with both use ModelAndView

    // @RequestMapping("/add")
    // public String add(@RequestParam("num1") int num1, int num2, Model model) {
    // // addAttribute as we can add multiple attributes
    // model.addAttribute("result", (num1 + num2));
    // System.out.println("add method called" + num1 + " " + num2);
    // return "add";
    // }

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("num1") int num1, int num2, ModelAndView mv) {
        mv.addObject("result", (num1 + num2));
        mv.setViewName("add");
        return mv;
    }

    // @RequestMapping("/student")
    // public String student(@RequestParam("id") int id, @RequestParam("sName")
    // String sName, Model model) {
    // Student s = new Student();
    // s.setId(id);
    // s.setsName(sName);
    // model.addAttribute("student", s);
    // return "student";
    // }

    @RequestMapping("/student")
    public String student(Student student) {
        // public String student(@ModelAttribute Student student)
        // @ModelAttribute in params is also optional
        return "student";
    }

}