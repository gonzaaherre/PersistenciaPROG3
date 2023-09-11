package com.example.PersistenciaPROG.Entidades;

import com.example.PersistenciaPROG.enums.tipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name="productos")
public class Producto extends Base{
     private tipo tipo;
     private int tiempoEstimado;
     private String denominacion;
     private double precioVenta;
     private double precioCompra;
     private int stockActual;
     private int stockMinimo;
     private String unidadMedida;
     private String foto;
     private String receta;


    }

