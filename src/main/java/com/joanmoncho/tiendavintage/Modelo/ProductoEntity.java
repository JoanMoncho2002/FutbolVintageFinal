package com.joanmoncho.tiendavintage.Modelo;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "producto", schema = "futbolvintage", catalog = "")
public class ProductoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "nombre", nullable = true, length = 45)
    private String nombre;
    @Basic
    @Column(name = "talla", nullable = true, length = 1)
    private String talla;
    @Basic
    @Column(name = "materiales", nullable = true, length = 45)
    private String materiales;
    @Basic
    @Column(name = "fkEquipo", nullable = false)
    private int fkEquipo;
    @Basic
    @Column(name = "fkMarca", nullable = false)
    private int fkMarca;
    @Basic
    @Column(name = "fkTipoSeccion", nullable = false)
    private int fkTipoSeccion;
    @Basic
    @Column(name = "fkTalla", nullable = false)
    private int fkTalla;
    @Basic
    @Column(name = "fkTipoProducto", nullable = false)
    private int fkTipoProducto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMateriales() {
        return materiales;
    }

    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }

    public int getFkEquipo() {
        return fkEquipo;
    }

    public void setFkEquipo(int fkEquipo) {
        this.fkEquipo = fkEquipo;
    }

    public int getFkMarca() {
        return fkMarca;
    }

    public void setFkMarca(int fkMarca) {
        this.fkMarca = fkMarca;
    }

    public int getFkTipoSeccion() {
        return fkTipoSeccion;
    }

    public void setFkTipoSeccion(int fkTipoSeccion) {
        this.fkTipoSeccion = fkTipoSeccion;
    }

    public int getFkTalla() {
        return fkTalla;
    }

    public void setFkTalla(int fkTalla) {
        this.fkTalla = fkTalla;
    }

    public int getFkTipoProducto() {
        return fkTipoProducto;
    }

    public void setFkTipoProducto(int fkTipoProducto) {
        this.fkTipoProducto = fkTipoProducto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductoEntity that = (ProductoEntity) o;
        return id == that.id && fkEquipo == that.fkEquipo && fkMarca == that.fkMarca && fkTipoSeccion == that.fkTipoSeccion && fkTalla == that.fkTalla && fkTipoProducto == that.fkTipoProducto && Objects.equals(nombre, that.nombre) && Objects.equals(talla, that.talla) && Objects.equals(materiales, that.materiales);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, talla, materiales, fkEquipo, fkMarca, fkTipoSeccion, fkTalla, fkTipoProducto);
    }
}
