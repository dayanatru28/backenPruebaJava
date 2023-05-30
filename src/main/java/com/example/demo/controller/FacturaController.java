package com.example.demo.controller;

import com.example.demo.service.FacturaService;

import java.util.List;

import com.example.demo.dto.FacturaDTO;
import com.example.demo.entity.Factura;

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
@RequestMapping("/factura")
@CrossOrigin(origins = "http://localhost:4200")
public class FacturaController {

    @Autowired
    FacturaService facturaService;

    @GetMapping("/lista")
    public ResponseEntity<?> list(){
        List<Factura> factura= facturaService.list();
        return new ResponseEntity<List<Factura>>(factura,HttpStatus.OK);
    }

    @GetMapping("/detalle/{id}")
    public ResponseEntity<Factura> getIdFactura (@PathVariable("id") int id){
        Factura factura = facturaService.getOne(id).get();
        return new ResponseEntity<Factura>(factura,HttpStatus.OK);
    }


    @PostMapping("/crear")
    public ResponseEntity<?> create(@RequestBody FacturaDTO facturadto){

        Factura factura =new Factura(facturadto.getIdFactura(),facturadto.getNumeroFactura(),
        facturadto.getFecha(), facturadto.getTipoPago(),facturadto.getDocumentoCliente(),
        facturadto.getNombreCliente(), facturadto.getSubtotal(), facturadto.getDescuento(), 
        facturadto.getIva(), facturadto.getTotalDescuento(), facturadto.getTotalImpuesto(), facturadto.getTotal());

        facturaService.save(factura);

        return new ResponseEntity("Factura Creado",HttpStatus.OK);
    }


    @PutMapping("/actualizar/{idfactura}")
    public ResponseEntity<?> update(@PathVariable("idFactura") int idFactura ,@RequestBody FacturaDTO facturadto){

        Factura factura= facturaService.getOne(idFactura).get();

        factura.setIdFactura(facturadto.getNumeroFactura());
        factura.setFecha(facturadto.getFecha());
        factura.setTipoPago(facturadto.getTipoPago());
        factura.setDocumentoCliente(facturadto.getDocumentoCliente());
        factura.setNombreCliente(facturadto.getNombreCliente());
        factura.setSubtotal(facturadto.getSubtotal());
        factura.setDescuento(facturadto.getDescuento());
        factura.setIva(facturadto.getIva());
        factura.setTotalDescuento(facturadto.getTotalDescuento());
        factura.setTotalImpuesto(facturadto.getTotalImpuesto());
        factura.setTotal(facturadto.getTotal());

        facturaService.save(factura);

        return new ResponseEntity("Factura Modificado",HttpStatus.OK);
    }

    @DeleteMapping("eliminar/{idFactura}")
    public ResponseEntity<?> delete(@PathVariable("idFactura") int id){
        facturaService.delete(id);
        return new ResponseEntity("Factura Eliminado",HttpStatus.OK);
    }


    
}
