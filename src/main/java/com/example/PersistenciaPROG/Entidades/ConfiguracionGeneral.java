package com.example.PersistenciaPROG.Entidades;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ConfiguracionGeneral extends Base{
    private int cantidadCocineros;
    private String emailEmpresa;
    private String tokenMercadoPago;

}
