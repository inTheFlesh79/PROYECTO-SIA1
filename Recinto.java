/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectosia1_sistemaventaseminarios;

/**
 * Integrantes:
 * Constanza Contreras
 * Vicente Parada
 * Raul Rozas
 */
public class Recinto {

  private String idRecinto;
  private String nombreRecinto;
  private String ubicacion;
  private int cupos;
  // constructor
  public Recinto(){
     //empty
  }

  
  // setters
  public void setIdRecinto(String idRecinto) {
    //validaciones pertinentes
    this.idRecinto = idRecinto;
  }

  public void setNombreRecinto(String nombreRecinto) {
    //validaciones pertinentes
    this.nombreRecinto = nombreRecinto;
  }

  public void setUbicacion(String ubicacion) {
    //validaciones pertinentes
    this.ubicacion = ubicacion;
  }

  public void setCupos(int cupos) {
    //validaciones pertinentes
    this.cupos = cupos;
  }

  //getters
  public String getIdRecinto() {
    return idRecinto;
  }

  public String getNombreRecinto() {
    return nombreRecinto;
  }

  public String getUbicacion() {
    return ubicacion;
  }

  public int getCupos() {
    return cupos;
  }
}
