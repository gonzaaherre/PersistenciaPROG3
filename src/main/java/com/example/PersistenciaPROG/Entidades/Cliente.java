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
@Table(name="cliente")
public class Cliente extends Base{
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true,fetch = FetchType.EAGER)
    @JoinColumn(name = "cliente_id")
    @Builder.Default
    private List<Pedido> pedidoss = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true,fetch = FetchType.EAGER)//
    //esto es para cuando se borra la persona se borra el domicilio
    @JoinColumn(name = "cliente_id")
    //en domicilio existe un fk que apunta a persona_id
    @Builder.Default
    //si no se pone esto le da error
    private List<Domicilio> domicilios = new ArrayList<>();

    public void agregarDom(Domicilio domicilio){
        domicilios.add(domicilio);
    }

    public void agregarped(Pedido pedido){
        pedidoss.add(pedido);
    }
}
