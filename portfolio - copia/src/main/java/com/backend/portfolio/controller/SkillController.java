/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.controller;

import com.backend.portfolio.model.Skill;
import com.backend.portfolio.service.ISkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author manu_
 */
@RequestMapping("/skill")
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SkillController {
    @Autowired
    private ISkillService service; 
    
    @GetMapping("/all")
    public List <Skill> getAll(){
        return service.getAll();
    }
    @PostMapping("/create")
    public void create(@RequestBody Skill e){
        service.create(e);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id){
        service.delete(id);
    }
    
}
