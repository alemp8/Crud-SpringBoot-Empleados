package com.alejandro.empleados.modelo.repositorio;

import com.alejandro.empleados.modelo.entidades.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ImplRepositorio implements IRepositorio{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Empleado> findall() {
        String SQL ="SELECT * FROM empleados";
        return jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(Empleado.class));
    }
    @Override
    public int crear(Empleado empleado) {
        String SQL= "INSERT INTO empleados ( nombre, apellido, correo, edad) VALUES(?,?,?,?)";
        return jdbcTemplate.update(SQL,new Object[]{empleado.getNombre(), empleado.getApellido(),
               empleado.getCorreo(), empleado.getEdad()});
    }

    @Override
    public int modificar(Empleado empleado) {
        String SQL= "UPDATE empleados SET nombre=?, apellido=?, correo=?, edad=? WHERE codigo =?";
        return jdbcTemplate.update(SQL,new Object[]{empleado.getNombre(), empleado.getApellido(),
                empleado.getCorreo(), empleado.getEdad()});
    }

    @Override
    public int eliminar(int id) {
        String SQL= "DELETE FROM empleados WHERE codigo=?";
        return jdbcTemplate.update(SQL,new Object[]{id});
    }
}
