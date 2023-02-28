package edu.escuelaing.ieti.app.controller.weather;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "v1/health" )
public class HealthController
{

    @GetMapping
    public String all()
    {
        return "API Working OK!";
    }
}
