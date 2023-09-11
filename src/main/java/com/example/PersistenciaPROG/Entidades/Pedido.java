package com.example.PersistenciaPROG.Entidades;


import com.example.PersistenciaPROG.enums.EstadoPedido;
import com.example.PersistenciaPROG.enums.TipoEnvio;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name="pedido")
public class Pedido extends Base{

    private String fecha;
    @Enumerated
    private EstadoPedido estado;

    @Temporal(TemporalType.TIMESTAMP)
    private Date horaEstimada;
    @Enumerated
    private TipoEnvio tipoenvio;

    private double total;


    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true,fetch = FetchType.EAGER)
    @JoinColumn(name = "Pedido_id")
    @Builder.Default//esto se va a crear en DetallePedido
    private List<DetallePedido> Detallepedidos = new ArrayList<>();

    public void agregarDetalle(DetallePedido detallePedido){
        Detallepedidos.add(detallePedido);
    }

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "PedidoS_id")
    private Factura factura;

    /*@ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;*/


}
