package com.testing.hashmaps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@CrossOrigin
public class EraController {

    @Autowired
    EraService eraService;


    @PostMapping("/era")

    public ResponseEntity<Era> createItem(@RequestBody Era era) {
        eraService.addEra(era);
        return ResponseEntity.status(HttpStatus.CREATED).body(era);
    }


    @GetMapping("/eras")
    public List<Era> getEras(){
        return eraService.getEras();
    }
}
