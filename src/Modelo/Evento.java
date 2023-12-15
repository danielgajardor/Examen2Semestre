/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author vina
 */
public class Evento {
    
  private String infoPaquete, infoCliente;
  private String fecha,hora;

    public Evento() {
    }

    public Evento(String infoPaquete, String infoCliente, String fecha, String hora) {
        this.infoPaquete = infoPaquete;
        this.infoCliente = infoCliente;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getInfoPaquete() {
        return infoPaquete;
    }

    public void setInfoPaquete(String infoPaquete) {
        this.infoPaquete = infoPaquete;
    }

    public String getInfoCliente() {
        return infoCliente;
    }

    public void setInfoCliente(String infoCliente) {
        this.infoCliente = infoCliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Evento{" + "infoPaquete=" + infoPaquete + ", infoCliente=" + infoCliente + ", fecha=" + fecha + ", hora=" + hora + '}';
    }

    public void get() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void getinfoPaquete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
  
    
}
