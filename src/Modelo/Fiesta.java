/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author vina
 */
public class Fiesta extends Paquete{
    
    private String barAlcol,numDj;

    public Fiesta() {
    }

    public Fiesta(String barAlcol, String numDj, String descripcion, String tamañoRecinto, int canAsistentes, int canMesas, int precio) {
        super(descripcion, tamañoRecinto, canAsistentes, canMesas, precio);
        this.barAlcol = barAlcol;
        this.numDj = numDj;
    }

    public String getBarAlcol() {
        return barAlcol;
    }

    public void setBarAlcol(String barAlcol) {
        this.barAlcol = barAlcol;
    }

    public String getNumDj() {
        return numDj;
    }

    public void setNumDj(String numDj) {
        this.numDj = numDj;
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
        return super.toString() + "Fiesta{" + "barAlcol=" + barAlcol + ", numDj=" + numDj + '}';
    }
    
    

  



    
}
