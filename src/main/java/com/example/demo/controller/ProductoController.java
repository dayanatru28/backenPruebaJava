package com.example.demo.controller;

import com.example.demo.service.ProductoService;
import java.util.List;

import com.example.demo.dto.ProductoDTO;
import com.example.demo.entity.Producto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producto")
@CrossOrigin(origins = "http://localhost:4200")

public class ProductoController {

    @Autowired
    ProductoService productoService;

    @GetMapping("/lista")
    public ResponseEntity<?> list(){
        List<Producto> producto= productoService.list();
        return new ResponseEntity<List<Producto>>(producto,HttpStatus.OK);
    }

    @GetMapping("/detalle/{id}")
    public ResponseEntity<Producto> getIdProducto (@PathVariable("id") int id){
        Producto producto = productoService.getOne(id).get();
        return new ResponseEntity<Producto>(producto,HttpStatus.OK);
    }
    
}
