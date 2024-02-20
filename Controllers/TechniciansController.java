package com.FAT.backendDB.Controller;

import com.FAT.backendDB.Model.Technicians;
import com.FAT.backendDB.Repository.TechnicianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/api/v1/technicians"})
public class TechniciansController {
    @Autowired
    private TechnicianRepository technicianRepository;

    @GetMapping
    public List<Technicians> findAll()
    {
        return technicianRepository.findAll();
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Technicians createUser(@RequestBody Technicians tech)
    {
        return (Technicians)technicianRepository.save(tech);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTechnicianById(@PathVariable Long id)
    {
      technicianRepository.deleteById(id);
    }


}

