package com.edu.videojuego.model;

public class Personaje {
  
  private int id;
  private String nombre;
  private String tipo;
  private int puntosAtaque;
  private int puntosDefensa;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public int getPuntosAtaque() {
    return puntosAtaque;
  }

  public void setPuntosAtaque(int puntosAtaque) {
    this.puntosAtaque = puntosAtaque;
  }

  public int getPuntosDefensa() {
    return puntosDefensa;
  }

  public void setPuntosDefensa(int puntosDefensa) {
    this.puntosDefensa = puntosDefensa;
  }

  @Override
  public String toString() {
    return "Personaje [nombre=" + nombre + ", tipo=" + tipo + ", puntosAtaque=" + puntosAtaque + ", puntosDefensa="
        + puntosDefensa + "]";
  }

}
