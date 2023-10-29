package com.apirest.productos.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "auditoria")
public class Auditoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_auditoria")
    private Long idAuditoria;

    @Column(name = "tabla_afectada",nullable = false)
    private String tablaAfectada;

    @Column(name = "id_registro_afectado",nullable = false)
    private Integer idRegistroAfectado;

    @Column(name = "accion",nullable = false)
    private String accion;

    @Column(name = "fecha_auditoria",nullable = false)
    private LocalDateTime fechaAuditoria;

    @Column(name = "usuario")
    private String usuario;

    @Column(name = "valores_anteriores",columnDefinition="json")
    private String valoresAnteriores;

    @Column(name = "valores_actuales",columnDefinition="json")
    private String valoresActuales;

    public Long getIdAuditoria() {
        return idAuditoria;
    }

    public void setIdAuditoria(Long idAuditoria) {
        this.idAuditoria = idAuditoria;
    }

    public String getTablaAfectada() {
        return tablaAfectada;
    }

    public void setTablaAfectada(String tablaAfectada) {
        this.tablaAfectada = tablaAfectada;
    }

    public Integer getIdRegistroAfectado() {
        return idRegistroAfectado;
    }

    public void setIdRegistroAfectado(Integer idRegistroAfectado) {
        this.idRegistroAfectado = idRegistroAfectado;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public LocalDateTime getFechaAuditoria() {
        return fechaAuditoria;
    }

    public void setFechaAuditoria(LocalDateTime fechaAuditoria) {
        this.fechaAuditoria = fechaAuditoria;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getValoresAnteriores() {
        return valoresAnteriores;
    }

    public void setValoresAnteriores(String valoresAnteriores) {
        this.valoresAnteriores = valoresAnteriores;
    }

    public String getValoresActuales() {
        return valoresActuales;
    }

    public void setValoresActuales(String valoresActuales) {
        this.valoresActuales = valoresActuales;
    }
}
