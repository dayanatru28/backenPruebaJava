package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Detalle {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idDetalle;
    private int idFactura;
    private int idProducto;
    private int idCantidad;
    private Double precioUnitario;
    
    public Detalle() {
    }

    public Detalle(int idDetalle, int idFactura, int idProducto, int idCantidad, Double precioUnitario) {
        this.idDetalle = idDetalle;
        this.idFactura = idFactura;
        this.idProducto = idProducto;
        this.idCantidad = idCantidad;
        this.precioUnitario=precioUnitario;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdCantidad() {
        return idCantidad;
    }

    public void setIdCantidad(int idCantidad) {
        this.idCantidad = idCantidad;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
  
}
