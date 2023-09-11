package com.example.PersistenciaPROG.Entidades;

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
@Table(name="Detalle_pedido")
public class DetallePedido extends Base {
    private int cantidad;

    private double subtotal;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "prod_id")
    @Builder.Default
    private List<Producto> productos = new ArrayList<>();

    public void agregarpro(Producto producto) {
        productos.add(producto);
    }
}
