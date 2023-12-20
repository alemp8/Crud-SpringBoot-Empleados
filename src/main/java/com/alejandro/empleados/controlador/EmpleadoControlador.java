package com.alejandro.empleados.controlador;

import com.alejandro.empleados.modelo.entidades.Empleado;
import com.alejandro.empleados.modelo.entidades.Response;
import com.alejandro.empleados.modelo.servicio.IServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v2/empleado")
@CrossOrigin("*")
public class EmpleadoControlador {
    @Autowired
    private IServicio iServicio;

    @GetMapping("/lista")
    public ResponseEntity<List<Empleado>> lista(){
        var result= iServicio.findall();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Response> crear(@RequestBody Empleado empleado){
        Response response = new Response();
        int result= iServicio.crear(empleado);
        if (result==1){
            response.setMessage("Completado con exito");
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/modificar")
    public ResponseEntity<Response> modificar (@RequestBody Empleado empleado){
        Response response = new Response();
        int result= iServicio.crear(empleado);
        if (result==1){
            response.setMessage("Completado con exito");
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/eliminar")
    public ResponseEntity<Response> eliminar(@PathVariable int id){
        Response response = new Response();
        int result= iServicio.eliminar(id);
        if (result==1){
            response.setMessage("Completado con exito");
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
