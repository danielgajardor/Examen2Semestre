/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author vina
 */
class Paquete {
    
    protected String descripcion, tamañoRecinto;
    protected int canAsistentes,canMesas,precio;

    public Paquete() {
    }

    public Paquete(String descripcion, String tamañoRecinto, int canAsistentes, int canMesas, int precio) {
        this.descripcion = descripcion;
        this.tamañoRecinto = tamañoRecinto;
        this.canAsistentes = canAsistentes;
        this.canMesas = canMesas;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTamañoRecinto() {
        return tamañoRecinto;
    }

    public void setTamañoRecinto(String tamañoRecinto) {
        this.tamañoRecinto = tamañoRecinto;
    }

    public int getCanAsistentes() {
        return canAsistentes;
    }

    public void setCanAsistentes(int canAsistentes) {
        this.canAsistentes = canAsistentes;
    }

    public int getCanMesas() {
        return canMesas;
    }

    public void setCanMesas(int canMesas) {
        this.canMesas = canMesas;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Paquete{" + "descripcion=" + descripcion + ", tama\u00f1oRecinto=" + tamañoRecinto + ", canAsistentes=" + canAsistentes + ", canMesas=" + canMesas + ", precio=" + precio + '}';
    }
    
    
}
