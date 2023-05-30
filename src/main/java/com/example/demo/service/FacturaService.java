package com.example.demo.service;
import java.util.Optional;
import java.util.List;

import com.example.demo.entity.Factura;
import com.example.demo.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class FacturaService {

    @Autowired
    FacturaRepository facturaRepository;

    public List<Factura> list(){
        return facturaRepository.findAll();
    }

    public Optional<Factura> getOne(int id){
        return facturaRepository.findById(id);
    }

    public void save(Factura factura){
        facturaRepository.save(factura);
    }

    public void delete(int id){
        facturaRepository.deleteById(id);
    }

    
}
