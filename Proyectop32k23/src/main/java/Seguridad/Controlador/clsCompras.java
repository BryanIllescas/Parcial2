/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Seguridad.Controlador;

import java.util.Date;

/**
 *
 * @author illescas
 */
public class clsCompras {
    
    private int id_compra;
    private int id_proveedor;
    private Date fecha_compra;
    private double total_compra;
    
    // Constructor de la clase
    public clsCompras(int id_compra, int id_proveedor, Date fecha_compra, double total_compra) {
        this.id_compra = id_compra;
        this.id_proveedor = id_proveedor;
        this.fecha_compra = fecha_compra;
        this.total_compra = total_compra;
    }

    public clsCompras() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    // Métodos getter y setter para cada atributo de la clase
    public int getIdCompra() {
        return id_compra;
    }

    public void setIdCompra(int id_compra) {
        this.id_compra = id_compra;
    }

    public int getIdProveedor() {
        return id_proveedor;
    }

    public void setIdProveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public Date getFechaCompra() {
        return fecha_compra;
    }

    public void setFechaCompra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public double getTotalCompra() {
        return total_compra;
    }

    public void setTotalCompra(double total_compra) {
        this.total_compra = total_compra;
    }
    
    // Método que devuelve la información de la compra en forma de cadena
    public String toString() {
        return "ID de compra: " + id_compra + ", ID de proveedor: " + id_proveedor + ", Fecha de compra: " + fecha_compra + ", Total de compra: " + total_compra;
    }

    public void setMontoCompra(double monto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setMonedaCompra(String moneda) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setEstadoCompra(String estado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public double getMontoCompra() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getMonedaCompra() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getEstadoCompra() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getIdCompras() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombreCompras() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getEstatusCompras() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setIdCompras(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setNombreCompras(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setEstatusCompras(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
