package com.example.DemoSpringRest.services;

import com.example.DemoSpringRest.models.BootCamper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BootCamperService {

    private List<BootCamper> bootCampers=new ArrayList<>();

    public List <BootCamper>getAll(){
        return bootCampers;
    }

    public void add (BootCamper bootCamper){
        bootCampers.add(bootCamper);
    }

    public BootCamper get(String name){
        for (BootCamper bootCamper : bootCampers
             ) {
            if (bootCamper.getName().equalsIgnoreCase(name)){
                return bootCamper;
            }
        }
        return null;
    }
}
