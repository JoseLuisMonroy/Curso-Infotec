package com.example.springpost.dto;


import com.example.springpost.entity.Direccion;

public class DataDTODireccion {
    private Integer id;
    private String calle;
    private String numExt;
    private String numInt;
    private Integer cp;
    private String colonia;
    private Integer ciudad;
    private Integer estado;

    public DataDTODireccion() {
    }
    public DataDTODireccion(Direccion direccion) {
        this.id = direccion.getId();
        this.calle = direccion.getCalle();
        this.ciudad = direccion.getCiudad();
        this.cp = direccion.getCp();
        this.colonia = direccion.getColonia();
        this.estado = direccion.getEstado();
        this.numExt = direccion.getNumExt();
        this.numInt = direccion.getNumInt();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumExt() {
        return numExt;
    }

    public void setNumExt(String numExt) {
        this.numExt = numExt;
    }

    public String getNumInt() {
        return numInt;
    }

    public void setNumInt(String numInt) {
        this.numInt = numInt;
    }

    public Integer getCp() {
        return cp;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public Integer getCiudad() {
        return ciudad;
    }

    public void setCiudad(Integer ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
}
