package com.sena.citas.servicio;

import com.sena.citas.entidad.cargo;

import java.util.List;

public interface cargoServicio {
    public List<cargo> listarTodosLosCargos();
    public cargo guardarCargo(cargo cargo);
    public cargo obtenerCargoPorId(int id);
    public void eliminarCargo(int id);
}
