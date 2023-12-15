/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author vina
 */
public interface ColeccionBLL {
    
    
    boolean agregarEvento (Evento even);
    ArrayList <Evento> listar ();
    
    boolean agregarCliente (Cliente cli);
    ArrayList <Cliente> listar ();
    
    boolean agregarPaquete (Paquete paq);
    ArrayList <Paquete> listar ();
    
    
    
    
    
    
   