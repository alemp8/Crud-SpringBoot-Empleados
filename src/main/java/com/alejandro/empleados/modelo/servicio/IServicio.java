package com.alejandro.empleados.modelo.servicio;

import com.alejandro.empleados.modelo.entidades.Empleado;
import com.alejandro.empleados.modelo.repositorio.IRepositorio;

import java.util.List;

public interface IServicio {
    public List<Empleado> findall();
    public int crear (Empleado empleado);
    public int modificar (Empleado empleado);
    public int eliminar (int id);
}
