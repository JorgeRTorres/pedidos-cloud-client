package pe.idat.edu.pedidos_cloud_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.idat.edu.pedidos_cloud_client.service.ServicePagosClient;

@RestController
@RequestMapping("/pedidos")
public class PedidosCloudController {

    private final ServicePagosClient pagoClient;

    public PedidosCloudController(ServicePagosClient pagoClient) {
        this.pagoClient = pagoClient;
    }

    @Value("${mensaje:Default mensaje}")
    private String mensaje;

    @GetMapping("/mensaje")
    public String mensajePedidos() {
        return mensaje;
    }

    @GetMapping("/realizar-pago/{idPedido}")
    public String realizarPago(@PathVariable Long idPedido) {
        return pagoClient.realizarPago(idPedido);
    }
}
