package com.example.demo.repository;
import com.example.demo.entity.Detalle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DetalleRepository  extends JpaRepository<Detalle,Integer>{
    Optional<Detalle> getOne(int id);
    
    // @Query("select * from detalle d where d.idFactura=:idFactura")
    // List<Detalle> findByIdFactura(int idFactura);

}
