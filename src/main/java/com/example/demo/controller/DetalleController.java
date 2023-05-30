package com.example.demo.controller;

import com.example.demo.service.DetalleService;

import java.util.List;

import com.example.demo.dto.DetalleDTO;
import com.example.demo.entity.Detalle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/detalle")
@CrossOrigin(origins = "http://localhost:4200")
public class DetalleController {

    @Autowired
    DetalleService detalleService;

    @GetMapping("/lista")
    public ResponseEntity<?> list(){
        List<Detalle> detalle= detalleService.list();
        return new ResponseEntity<List<Detalle>>(detalle,HttpStatus.OK);
    }

    // @GetMapping("/detalle/{id}")
    // public ResponseEntity<?> getIdFactura (@PathVariable("id") int id){
    //     List<Detalle> detalle = detalleService.getDetalleFactura(id);
    //     return new ResponseEntity<List<Detalle>>(detalle,HttpStatus.OK);
    // }


    @PostMapping("/crear")
    public ResponseEntity<?> create(@RequestBody DetalleDTO detalledto){

        Detalle detalle =new Detalle(detalledto.getIdDetalle(),detalledto.getIdFactura(),detalledto.getIdProducto(),detalledto.getIdCantidad(), detalledto.getPrecioUnitario());
        detalleService.save(detalle);
        return new ResponseEntity("Detalle Creado",HttpStatus.OK);
    }
    
}
