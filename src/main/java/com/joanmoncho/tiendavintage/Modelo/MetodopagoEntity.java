package com.joanmoncho.tiendavintage.Modelo;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "metodopago", schema = "futbolvintage", catalog = "")
public class MetodopagoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "transferenciaBancaria", nullable = true, length = 45)
    private String transferenciaBancaria;
    @Basic
    @Column(name = "paypal", nullable = true, length = 45)
    private String paypal;
    @Basic
    @Column(name = "aPlazos", nullable = true, length = 45)
    private String aPlazos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTransferenciaBancaria() {
        return transferenciaBancaria;
    }

    public void setTransferenciaBancaria(String transferenciaBancaria) {
        this.transferenciaBancaria = transferenciaBancaria;
    }

    public String getPaypal() {
        return paypal;
    }

    public void setPaypal(String paypal) {
        this.paypal = paypal;
    }

    public String getaPlazos() {
        return aPlazos;
    }

    public void setaPlazos(String aPlazos) {
        this.aPlazos = aPlazos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MetodopagoEntity that = (MetodopagoEntity) o;
        return id == that.id && Objects.equals(transferenciaBancaria, that.transferenciaBancaria) && Objects.equals(paypal, that.paypal) && Objects.equals(aPlazos, that.aPlazos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, transferenciaBancaria, paypal, aPlazos);
    }
}
