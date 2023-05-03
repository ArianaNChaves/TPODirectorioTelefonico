package vistas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DirectorioTelefonico {

    private Map<String, Cliente> clientes; // Clave: número de teléfono, Valor: cliente

    public DirectorioTelefonico() {
        clientes = new HashMap<String, Cliente>();
    }

    public void agregarCliente(String telefono, Cliente cliente) {
        clientes.put(telefono, cliente);
    }

    public Cliente buscarCliente(String telefono) {
        return clientes.get(telefono);
    }

    public List<String> buscarTelefono(String apellido) {
        List<String> telefonos = new ArrayList<String>();

        for (Map.Entry<String, Cliente> entry : clientes.entrySet()) {
            Cliente cliente = entry.getValue();

            if (cliente.getApellido().equalsIgnoreCase(apellido)) {
                telefonos.add(entry.getKey());
            }
        }

        return telefonos;
    }

    public List<Cliente> buscarClientes(String ciudad) {
        List<Cliente> clientesCiudad = new ArrayList<Cliente>();

        for (Map.Entry<String, Cliente> entry : clientes.entrySet()) {
            Cliente cliente = entry.getValue();

            if (cliente.getCiudad().equalsIgnoreCase(ciudad)) {
                clientesCiudad.add(cliente);
            }
        }

        return clientesCiudad;
    }

    public boolean borrarCliente(Cliente cliente) {
        String telefono = null;
        for (Map.Entry<String, Cliente> entry : clientes.entrySet()) {
            if (entry.getValue().equals(cliente)) {
                telefono = entry.getKey();
                break;
            }
        }
        if (telefono != null) {
            clientes.remove(telefono);
            return true;
        } else {
            return false;
        }
    }

}
