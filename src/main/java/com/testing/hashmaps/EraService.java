package com.testing.hashmaps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EraService {
    @Autowired
    EraRepository eraRepository;

    public void addEra(Era era){
        eraRepository.save(era);
    }

    public List<Era> getEras(){
        return eraRepository.findAll();
    }
}
