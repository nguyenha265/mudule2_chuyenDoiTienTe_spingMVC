package controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/a")
    public String converter(Model model) {
        double usd = 23000;
        double rate = 5;
        double vnd = usd * rate;
        model.addAttribute("rate", rate);
        model.addAttribute("usd", usd);
        model.addAttribute("vnd", vnd);
        return "index";
    }
}
