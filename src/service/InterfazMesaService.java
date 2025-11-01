package service;

import model.Mesa;
import exception.MesaNoDisponibleException;
import java.util.List;

// Interface para la gestión de mesas
public interface IMesaService {

    void abrirMesa(int numero) throws MesaNoDisponibleException;

    void cerrarMesa(int numero);

    Mesa obtenerMesa(int numero);

    List<Mesa> listarMesas();
}
