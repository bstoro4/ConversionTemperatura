package com.grade.ConversionTemperatura;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversionTemperatura extends SpringBootServletInitializer {

    @RequestMapping("/grade/celsiusToFahrenheit/{celsius}")
    public double celsiusToFahrenheit(@PathVariable double celsius) {
        return Math.round((celsius * 9 / 5 + 32) * 100.0) / 100.0;
    }


    @RequestMapping("/grade/celsiusToKelvin/{celsius}")
    public double celsiusToKelvin(@PathVariable double celsius) {
        return Math.round((celsius + 273.15) * 100.0) / 100.0;
    }

    @RequestMapping("/grade/fahrenheitToCelcius/{fahrenheit}")
    public double fahrenheitToCelcius(@PathVariable double fahrenheit) {
        return Math.round(((fahrenheit - 32) * 5 / 9) * 100.0) / 100.0;
    }
    
    
    @RequestMapping("/grade/farenheitToKelvin/{fahrenheit}")
    public double fahrenheitToKelvin(@PathVariable double fahrenheit) {
        return Math.round(((fahrenheit - 32) * 5 / 9 + 273.15) * 100.0) / 100.0;
    }
    
    
    @RequestMapping("/grade/kelvinToCelcius/{kelvin}")
    public double kelvinToCelcius(@PathVariable double kelvin) {
        return Math.round((kelvin - 273.15) * 100.0) / 100.0;
    }


    @RequestMapping("/grade/kelvinToFarenheit/{kelvin}")
    public double kelvinToFarenheit(@PathVariable double kelvin) {
        return Math.round(((kelvin - 273.15) * 9 / 5 + 32) * 100.0) / 100.0;
    }    


}