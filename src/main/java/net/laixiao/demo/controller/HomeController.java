package net.laixiao.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.laixiao.demo.entity.City;
import net.laixiao.demo.service.HomeService;

@Controller
public class HomeController {

    @Autowired
    private HomeService homeService;

    @RequestMapping("/")
    public String home(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
            Model model) {
        List<City> cityList = homeService.getAllCityList();
        model.addAttribute("name", name);
        model.addAttribute("cityList", cityList);
        return "home";
    }
}
