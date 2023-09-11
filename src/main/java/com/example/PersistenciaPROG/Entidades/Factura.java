package com.example.PersistenciaPROG.Entidades;

import com.example.PersistenciaPROG.enums.FormaPago;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name="factura")
public class Factura extends Base{
    private Date fecha;
    private int numero;
    private double descuento;

    private FormaPago forma;

    private int total;
}
