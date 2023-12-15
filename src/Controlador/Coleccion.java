/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cliente;
import Modelo.ColeccionBLL;
import Modelo.Evento;
import java.util.ArrayList;

/**
 *
 * @author vina
 */
public class Coleccion implements ColeccionBLL{

  private static final ArrayList<Evento> listaEvento = new ArrayList<>();

    @Override
    public boolean agregarEvento(Evento even) {
      return listaEvento.add(even);
    }

    @Override
    public ArrayList<Evento> listar() {
       
        ArrayList<Evento> lista = new ArrayList <>();
       
        for (Evento evento : lista) {
            evento.get();
            evento.get();
            evento.get();
                 
           lista.add(evento);
                 
        }
        return lista;
    }
    
   ;

    @Override
    public boolean agregarCliente(Cliente cli) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean agregarPaquete(Paquete paq) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}

    

