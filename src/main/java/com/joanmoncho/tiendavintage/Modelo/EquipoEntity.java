package com.joanmoncho.tiendavintage.Modelo;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "equipo", schema = "futbolvintage", catalog = "")
public class EquipoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "nombre", nullable = true, length = 45)
    private String nombre;
    @Basic
    @Column(name = "nacionalidad", nullable = true)
    private Byte nacionalidad;
    @Basic
    @Column(name = "fkLiga", nullable = false)
    private int fkLiga;

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

    public Byte getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Byte nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getFkLiga() {
        return fkLiga;
    }

    public void setFkLiga(int fkLiga) {
        this.fkLiga = fkLiga;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EquipoEntity that = (EquipoEntity) o;
        return id == that.id && fkLiga == that.fkLiga && Objects.equals(nombre, that.nombre) && Objects.equals(nacionalidad, that.nacionalidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, nacionalidad, fkLiga);
    }
}
