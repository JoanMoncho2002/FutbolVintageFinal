package com.joanmoncho.tiendavintage.Modelo;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "factura", schema = "futbolvintage", catalog = "")
public class FacturaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idfactura", nullable = false)
    private int idfactura;
    @Basic
    @Column(name = "fkMetodoPago", nullable = false)
    private int fkMetodoPago;
    @Basic
    @Column(name = "fkUsuario", nullable = false)
    private int fkUsuario;

    public int getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(int idfactura) {
        this.idfactura = idfactura;
    }

    public int getFkMetodoPago() {
        return fkMetodoPago;
    }

    public void setFkMetodoPago(int fkMetodoPago) {
        this.fkMetodoPago = fkMetodoPago;
    }

    public int getFkUsuario() {
        return fkUsuario;
    }

    public void setFkUsuario(int fkUsuario) {
        this.fkUsuario = fkUsuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FacturaEntity that = (FacturaEntity) o;
        return idfactura == that.idfactura && fkMetodoPago == that.fkMetodoPago && fkUsuario == that.fkUsuario;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idfactura, fkMetodoPago, fkUsuario);
    }
}
