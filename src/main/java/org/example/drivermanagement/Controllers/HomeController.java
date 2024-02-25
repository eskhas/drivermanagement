package org.example.drivermanagement.Controllers;

import org.example.drivermanagement.Models.Driver;
import org.example.drivermanagement.Services.DriverService;
import org.example.drivermanagement.Services.Impl.DriverServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private DriverServiceImpl driverService;

    @GetMapping("/driver-form")
    public String createDriverForm(Model model){
        model.addAttribute("driver",new Driver());
        return "driver-form";
    }

    @GetMapping("/drivers")
    public List<Driver> fetchDepartmentList()
    {

        return driverService.fetchDriverList();
    }

    @GetMapping("/")
    public String mainPage(){
        return "index";
    }
}
