
package com.proyecto1.adso288.services;

import com.proyecto1.adso288.model.Aprendiz;


public interface AprendizService {
    Aprendiz newAprendiz (Aprendiz newAprendiz);
    Iterable<Aprendiz> getAll();
    Aprendiz modifyAprendiz (Aprendiz aprendiz);
    Boolean deleteAprendiz(Long iduser);
}
