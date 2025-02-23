package pe.idat.edu.pedidos_cloud_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class PedidosCloudClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(PedidosCloudClientApplication.class, args);
	}

}
