package com.alejandro.empleados.modelo.repositorio;

import com.alejandro.empleados.modelo.entidades.Empleado;

import java.util.List;

public interface IRepositorio {
    public List<Empleado> findall();
    public int crear (Empleado empleado);
    public int modificar (Empleado empleado);
    public int eliminar (int id);
}
