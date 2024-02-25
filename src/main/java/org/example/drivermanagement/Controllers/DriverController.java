package org.example.drivermanagement.Controllers;


import org.example.drivermanagement.Models.Driver;
import org.example.drivermanagement.Services.Impl.DriverServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DriverController {

    @Autowired
    private DriverServiceImpl driverService;

    @PostMapping(value = "/driver",params ={"save"})
    public String saveDriver(@Validated @ModelAttribute Driver driver)
    {
        driverService.saveDriver(driver);
        return "success";
    }

    @PutMapping(value = "/driver",params = {"update"})
    public String updateDriver(@RequestBody Driver driver,
                               @PathVariable("id") int driverId)
    {
        driverService.updateDriver(driver,driverId);
        return "success";
    }
    @DeleteMapping(value="/driver",params = {"delete"})
    public String deleteDriverById(@PathVariable("id") int driverId){
        driverService.deleteDriver(driverId);
        return "Driver deleted successfully.";
    }

}
