package com.alejandro.empleados.modelo.servicio;

import com.alejandro.empleados.modelo.entidades.Empleado;
import com.alejandro.empleados.modelo.repositorio.IRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Servicios implements IServicio{

    @Autowired
    private IRepositorio iRepositorio;

    @Override
    public List<Empleado> findall() {
        List<Empleado> lista;
        try {
            lista = iRepositorio.findall();
        } catch (Exception e){
            throw e;
        }
        return lista;
    }

    @Override
    public int crear(Empleado empleado) {
        int fila=0;
        try {
            fila = iRepositorio.crear(empleado);
        } catch (Exception e){
            throw e;
        }
        return fila;
    }

    @Override
    public int modificar(Empleado empleado) {
        int fila=0;
        try {
            fila = iRepositorio.crear(empleado);
        } catch (Exception e){
            throw e;
        }
        return fila;
    }

    @Override
    public int eliminar(int id) {
        int fila=0;
        try {
            fila = iRepositorio.eliminar(id);
        } catch (Exception e){
            throw e;
        }
        return fila;
    }
}
