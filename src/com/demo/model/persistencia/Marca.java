package com.demo.model.persistencia;
// Generated 09-oct-2019 16:11:11 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Marca generated by hbm2java
 */
public class Marca  implements java.io.Serializable {


     private int idMarca;
     private String descripcion;
     private Set productos = new HashSet(0);

    public Marca() {
    }

	
    public Marca(int idMarca, String descripcion) {
        this.idMarca = idMarca;
        this.descripcion = descripcion;
    }
    public Marca(int idMarca, String descripcion, Set productos) {
       this.idMarca = idMarca;
       this.descripcion = descripcion;
       this.productos = productos;
    }
   
    public int getIdMarca() {
        return this.idMarca;
    }
    
    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getProductos() {
        return this.productos;
    }
    
    public void setProductos(Set productos) {
        this.productos = productos;
    }




}

