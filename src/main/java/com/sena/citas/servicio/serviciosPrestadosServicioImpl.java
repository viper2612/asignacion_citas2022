package com.sena.citas.servicio;

import com.sena.citas.entidad.serviciosPrestados;
import com.sena.citas.repositorio.serviciosPrestadosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class serviciosPrestadosServicioImpl implements serviciosPrestadosServicio{
    @Autowired
    private serviciosPrestadosRepositorio repositorio;

    @Override
    public List<serviciosPrestados> listarTodosLosServiciosPrestados() {
        return repositorio.findAll();
    }
    @Override
    public serviciosPrestados guardarDServiciosPrestados(serviciosPrestados serviciosPrestados) {
        return repositorio.save(serviciosPrestados);
    }
    //obtener el servicio por id
    @Override
    public serviciosPrestados obtenerServicioPorId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public void eliminarServicioPrestadoPorId(int id) {
        repositorio.deleteById(id);
    }
}
