package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Factura {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idFactura;
    private int numeroFactura;
    private Date fecha;
    private String tipoPago;
    private String documentoCliente;
    private String nombreCliente;
    private Double subtotal;
    private Double descuento;
    private Double iva;
    private Double totalDescuento;
    private Double totalImpuesto;
    private Double total;


    public Factura() {
    }


    public Factura(int idFactura, int numeroFactura, Date fecha, String tipoPago, String documentoCliente,
            String nombreCliente, Double subtotal, Double descuento, Double iva, Double totalDescuento,
            Double totalImpuesto, Double total) {
        this.idFactura = idFactura;
        this.numeroFactura = numeroFactura;
        this.fecha = fecha;
        this.tipoPago = tipoPago;
        this.documentoCliente = documentoCliente;
        this.nombreCliente = nombreCliente;
        this.subtotal = subtotal;
        this.descuento = descuento;
        this.iva = iva;
        this.totalDescuento = totalDescuento;
        this.totalImpuesto = totalImpuesto;
        this.total = total;
    }


    public int getIdFactura() {
        return idFactura;
    }


    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }


    public int getNumeroFactura() {
        return numeroFactura;
    }


    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }


    public Date getFecha() {
        return fecha;
    }


    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


    public String getTipoPago() {
        return tipoPago;
    }


    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }


    public String getDocumentoCliente() {
        return documentoCliente;
    }


    public void setDocumentoCliente(String documentoCliente) {
        this.documentoCliente = documentoCliente;
    }


    public String getNombreCliente() {
        return nombreCliente;
    }


    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }


    public Double getSubtotal() {
        return subtotal;
    }


    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }


    public Double getDescuento() {
        return descuento;
    }


    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }


    public Double getIva() {
        return iva;
    }


    public void setIva(Double iva) {
        this.iva = iva;
    }


    public Double getTotalDescuento() {
        return totalDescuento;
    }


    public void setTotalDescuento(Double totalDescuento) {
        this.totalDescuento = totalDescuento;
    }


    public Double getTotalImpuesto() {
        return totalImpuesto;
    }


    public void setTotalImpuesto(Double totalImpuesto) {
        this.totalImpuesto = totalImpuesto;
    }


    public Double getTotal() {
        return total;
    }


    public void setTotal(Double total) {
        this.total = total;
    }


    @Override
    public String toString() {
        return "Factura [descuento=" + descuento + ", documentoCliente=" + documentoCliente + ", fecha=" + fecha
                + ", idFactura=" + idFactura + ", iva=" + iva + ", nombreCliente=" + nombreCliente + ", numeroFactura="
                + numeroFactura + ", subtotal=" + subtotal + ", tipoPago=" + tipoPago + ", total=" + total
                + ", totalDescuento=" + totalDescuento + ", totalImpuesto=" + totalImpuesto + "]";
    }

    

    

    
}
