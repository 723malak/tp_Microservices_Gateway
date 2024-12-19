package ma.emsi.client.controllers;

import ma.emsi.client.entities.Client;
import ma.emsi.client.services.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    private final ClientService clientService;

    // Constructeur
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    // Find all clients
    @GetMapping
    public List<Client> findAll() {
        return clientService.findAll();
    }

    // Save a client
    @PostMapping
    public Client save(@RequestBody Client client) {
        return clientService.save(client);
    }

    // Find client by ID
    @GetMapping("/id/{id}")
    public Optional<Client> findById(@PathVariable Long id) {
        return clientService.findById(id);
    }

    // Delete client by ID
    @DeleteMapping("/id/{id}")
    public void deleteById(@PathVariable Long id) {
        clientService.deleteById(id);
    }
}
