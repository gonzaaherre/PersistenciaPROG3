package com.example.PersistenciaPROG;

import com.example.PersistenciaPROG.Entidades.*;
import com.example.PersistenciaPROG.enums.EstadoPedido;
import com.example.PersistenciaPROG.enums.TipoEnvio;
import com.example.PersistenciaPROG.repositorios.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class PersistenciaProgApplication {
	@Autowired
	UsuarioRepository usuarioRepository;
	@Autowired
	PedidoRepository pedidoRepository;
	@Autowired
	DomicilioRepository domicilioRepository;
	@Autowired
	DetallePedidoRepository detallePedidoRepository;
	@Autowired
	Clienterepository clienterepository;

	public static void main(String[] args) {
		SpringApplication.run(PersistenciaProgApplication.class, args);
		System.out.printf("sdf");
	}

	@Bean
	CommandLineRunner init(PedidoRepository Pedidorepository) {
		return args -> {
			System.out.println("-----------------ESTOY FUNCIONANDO---------");
			/*Pedido p1 = Pedido.builder()
					.fecha("5/9/2023")
					.estado(EstadoPedido.PREPARACION)
					.horaEstimada(new Date())
					.tipoenvio(TipoEnvio.DELIVERY)
					.total(120.00)
					.build();
			Usuario usuario1 = Usuario.builder()
					.nombre("gonzalo")
					.password("123")
					.rol("a")
					.build();
			usuario1.agregarPedido(p1);
			usuarioRepository.save(usuario1);
			pedidoRepository.save(p1);*/
/*El método builder() se genera automáticamente por Lombok
y te permite crear una instancia de Persona.Builder.
Luego, puedes encadenar llamadas a los métodos
setters generados automáticamente para establecer los
valores de los atributos de la clase.
Finalmente, build() crea la instancia
 de la clase Persona con los valores proporcionados.
			DetallePedido deta = DetallePedido.builder()
					.cantidad(1)
					.subtotal(120)
					.build();

			// Crear instancia de pedido
			Pedido p1 = Pedido.builder()
					.fecha("5/9/2023")
					.estado(EstadoPedido.PREPARACION)
					.horaEstimada(new Date())
					.tipoenvio(TipoEnvio.DELIVERY)
					.total(120.00)
					.build();
			p1.agregarDetalle(deta);

			Usuario usuario1 = Usuario.builder()
					.nombre("gonzalo")
					.password("123")
					.rol("a")
					.build();

			Usuario usuario2 = Usuario.builder()
					.nombre("jeremias")
					.password("1234")
					.rol("b")
					.build();
			Domicilio dom1 = Domicilio.builder()
					.calle("asd")
					.numero("123")
					.localidad("ddsa")
					.build();

			Cliente c1 = Cliente.builder()
					.nombre("pachi")
					.apellido("reche")
					.telefono("2613449934")
					.email("pachi@gmail.com")
					.build();
			c1.agregarDom(dom1);
			c1.agregarped(p1);
			dom1.agregarped(p1);
			usuario1.agregarPedido(p1);
			//detallePedidoRepository.save(deta);

			usuarioRepository.save(usuario1);
			Pedidorepository.save(p1);
			clienterepository.save(c1);
			domicilioRepository.save(dom1);
			//usuarioRepository.save(usuario2);



			// Recuperar el objeto Persona desde la base de datos

	/*Persona personaRecuperada = personaRepository.findById(persona.getId()).orElse(null);


			if (personaRecuperada != null) {
		System.out.println("Nombre: " + personaRecuperada.getNombre());
		System.out.println("Apellido: " + personaRecuperada.getApellido());
		System.out.println("Edad: " + personaRecuperada.getEdad());
		personaRecuperada.mostrarDomicilios();


	}*/


		};

	}
}

