
package com.proyecto1.adso288.services;

import com.proyecto1.adso288.model.Aprendiz;
import com.proyecto1.adso288.repository.AprendizRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AprendizServiceImpl implements AprendizService{
    
    @Autowired
    private AprendizRepository aprendizRepository;

    @Override
    public Aprendiz newAprendiz(Aprendiz newAprendiz) {
        return aprendizRepository.save(newAprendiz);
    }

    @Override
    public Iterable<Aprendiz> getAll() {
        return this.aprendizRepository.findAll();
    }

    @Override
    public Aprendiz modifyAprendiz(Aprendiz aprendiz) {
        Optional<Aprendiz> aprendizEncontrado=this.aprendizRepository.findById(aprendiz.getIduser());
        if(aprendizEncontrado.get()!=null){
            aprendizEncontrado.get().setNombre(aprendiz.getNombre());
            aprendizEncontrado.get().setApellido(aprendiz.getApellido());
            aprendizEncontrado.get().setEmail(aprendiz.getEmail());
            return this.newAprendiz(aprendizEncontrado.get());
        
        }
        return null;
    }

    @Override
    public Boolean deleteAprendiz(Long iduser) {
        this.aprendizRepository.deleteById(iduser);
        return true;
    }
    
    
}
