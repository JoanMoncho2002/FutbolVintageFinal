package com.joanmoncho.tiendavintage.Modelo;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "lineasfactura", schema = "futbolvintage", catalog = "")
public class LineasfacturaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idlineas de factura", nullable = false)
    private int idlineasDeFactura;
    @Basic
    @Column(name = "lineas", nullable = true, length = 45)
    private String lineas;
    @Basic
    @Column(name = "cantidad", nullable = true)
    private Integer cantidad;
    @Basic
    @Column(name = "precio", nullable = true, precision = 0)
    private Double precio;
    @Basic
    @Column(name = "fkFactura", nullable = false)
    private int fkFactura;
    @Basic
    @Column(name = "fkProducto", nullable = false)
    private int fkProducto;

    public int getIdlineasDeFactura() {
        return idlineasDeFactura;
    }

    public void setIdlineasDeFactura(int idlineasDeFactura) {
        this.idlineasDeFactura = idlineasDeFactura;
    }

    public String getLineas() {
        return lineas;
    }

    public void setLineas(String lineas) {
        this.lineas = lineas;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getFkFactura() {
        return fkFactura;
    }

    public void setFkFactura(int fkFactura) {
        this.fkFactura = fkFactura;
    }

    public int getFkProducto() {
        return fkProducto;
    }

    public void setFkProducto(int fkProducto) {
        this.fkProducto = fkProducto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LineasfacturaEntity that = (LineasfacturaEntity) o;
        return idlineasDeFactura == that.idlineasDeFactura && fkFactura == that.fkFactura && fkProducto == that.fkProducto && Objects.equals(lineas, that.lineas) && Objects.equals(cantidad, that.cantidad) && Objects.equals(precio, that.precio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idlineasDeFactura, lineas, cantidad, precio, fkFactura, fkProducto);
    }
}
