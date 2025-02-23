package pe.idat.edu.pedidos_cloud_client.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "pagos-cloud-client")
public interface ServicePagosClient {

    @GetMapping("/pagos")
    String obtenerPago();

    @PostMapping("/pagos/realizar/{idPedido}")
    String realizarPago(@PathVariable Long idPedido);

}
