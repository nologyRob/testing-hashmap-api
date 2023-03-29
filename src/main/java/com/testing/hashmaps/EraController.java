package com.testing.hashmaps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin
public class EraController {

    @Autowired
    EraService eraService;

    @PostMapping("/era")
    public String addEra(@RequestBody Era era){

        eraService.addEra(era);
        return "Added era";
    }

    @GetMapping("/eras")
    public List<Era> getEras(){
        return eraService.getEras();
    }
}
