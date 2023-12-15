/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author vina
 */
public class Cliente {
    
    private String nombreCompleto,correoElectronico;
    private int rut,telefono;

    public Cliente() {
    }

    public Cliente(String nombreCompleto, String correoElectronico, int rut, int telefono) {
        this.nombreCompleto = nombreCompleto;
        this.correoElectronico = correoElectronico;
        this.rut = rut;
        this.telefono = telefono;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombreCompleto=" + nombreCompleto + ", correoElectronico=" + correoElectronico + ", rut=" + rut + ", telefono=" + telefono + '}';
    }
    
    
}
