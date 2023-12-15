/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author vina
 */
public class Matrimonio extends Paquete{
    
    private String tiemposMenu,musicaVivo;

    public Matrimonio() {
    }

    public Matrimonio(String tiemposMenu, String musicaVivo, String descripcion, String tamañoRecinto, int canAsistentes, int canMesas, int precio) {
        super(descripcion, tamañoRecinto, canAsistentes, canMesas, precio);
        this.tiemposMenu = tiemposMenu;
        this.musicaVivo = musicaVivo;
    }

    public String getTiemposMenu() {
        return tiemposMenu;
    }

    public void setTiemposMenu(String tiemposMenu) {
        this.tiemposMenu = tiemposMenu;
    }

    public String getMusicaVivo() {
        return musicaVivo;
    }

    public void setMusicaVivo(String musicaVivo) {
        this.musicaVivo = musicaVivo;
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
        return super.toString() + "Matrimonio{" + "tiemposMenu=" + tiemposMenu + ", musicaVivo=" + musicaVivo + '}';
    }

  
    
 
    
  
    
    
}
