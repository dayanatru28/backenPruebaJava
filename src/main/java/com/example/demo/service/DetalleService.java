package com.example.demo.service;
import java.util.Optional;
import java.util.List;

import com.example.demo.entity.Detalle;
import com.example.demo.repository.DetalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class DetalleService {

    @Autowired
    DetalleRepository detalleRepository;

    public List<Detalle> list(){
        return detalleRepository.findAll();
    }

    public Optional<Detalle> getOne(int id){
        return detalleRepository.findById(id);
    }

    // public List<Detalle> getDetalleFactura(int idFactura){
    //     return detalleRepository.findByIdFactura(idFactura);
    // }

    public void save(Detalle factura){
        detalleRepository.save(factura);
    }
    
}
