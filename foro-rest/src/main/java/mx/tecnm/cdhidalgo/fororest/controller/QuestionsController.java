/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.tecnm.cdhidalgo.fororest.controller;

import java.util.List;
import java.util.Optional;
import mx.tecnm.cdhidalgo.fororest.domain.QuestionsRepository;
import mx.tecnm.cdhidalgo.fororest.persistence.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lupdo
 */

@RestController
@RequestMapping("/questions")
public class QuestionsController {
    @Autowired
    private QuestionsRepository repo;
    
    @GetMapping("")
    public List<Questions> getAll(){
        return repo.findAll();
    }
    
     @GetMapping("/{id}")
     public Optional<Questions> getId(@PathVariable("id") int id) {
         return repo.findById(id);
     }
     
     @PostMapping("")
     public Questions create(@RequestBody Questions q) {
         return repo.save(q);
     }
     
     @PutMapping("/{id}")
     public Questions update(@PathVariable("id") int id, @RequestBody Questions q) {
         return repo.save(q);
     }
     
     @DeleteMapping("/{id}")
     public void delete(@PathVariable("id") int id) {
        repo.deleteById(id);
     }
    
}
