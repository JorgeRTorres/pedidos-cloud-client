package pe.idat.edu.pedidos_cloud_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
public class PedidosCloudController {

    @Value("${mensaje:Default mensaje}")
    private String mensaje;

    @GetMapping("/mensaje")
    public String mensajePedidos(){
        return mensaje;
    }
}
