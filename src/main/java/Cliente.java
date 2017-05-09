/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2107713
 */
public class Cliente {
    int ID;
    String nombreEmpresa;
    int telefono;
    String direccion;
    String sectorActividad;
    String ciudad;
    String email;
    String fechaInicioContrato;
    String representante;

    public Cliente(int ID, String nombreEmpresa, int telefono, String direccion, String sectorActividad, String ciudad, String email, String fechaInicioContrato, String representante) {
        this.ID = ID;
        this.nombreEmpresa = nombreEmpresa;
        this.telefono = telefono;
        this.direccion = direccion;
        this.sectorActividad = sectorActividad;
        this.ciudad = ciudad;
        this.email = email;
        this.fechaInicioContrato = fechaInicioContrato;
        this.representante = representante;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSectorActividad() {
        return sectorActividad;
    }

    public void setSectorActividad(String sectorActividad) {
        this.sectorActividad = sectorActividad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaInicioContrato() {
        return fechaInicioContrato;
    }

    public void setFechaInicioContrato(String fechaInicioContrato) {
        this.fechaInicioContrato = fechaInicioContrato;
    }
    
    
    
}
