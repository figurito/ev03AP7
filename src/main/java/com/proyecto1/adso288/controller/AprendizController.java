package com.proyecto1.adso288.controller;

import com.proyecto1.adso288.model.Aprendiz;
import com.proyecto1.adso288.services.AprendizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aprendiz")
public class AprendizController {
    
    @Autowired
    private AprendizService aprendizService;
    
    @PostMapping("/nuevo")
    public Aprendiz newAprendiz(@RequestBody Aprendiz newAprendiz){
        return this.aprendizService.newAprendiz(newAprendiz);
    }
    
    @GetMapping("/mostrar")
    public Iterable<Aprendiz> getAll(){
        return aprendizService.getAll();
        }
    
    @PostMapping("/modificar")
    public Aprendiz updateAprendiz(@RequestBody Aprendiz aprendiz){
        return this.aprendizService.modifyAprendiz(aprendiz);
    
    }
    
    @PostMapping(value="/(id)")
    public Boolean deleteAprendiz(@PathVariable(value = "id") Long id){
        return this.aprendizService.deleteAprendiz(id);
    
    }
}
