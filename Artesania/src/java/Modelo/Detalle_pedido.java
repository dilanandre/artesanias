/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author HPLAPTOP01
 */
public class Detalle_pedido {
    int Id_detalle;
    int Id_pedido;
    int numero_pedido;
    int Id_cliente;
    String nombre_producto;
    int total_pedido;
    int id_producto;

    public Detalle_pedido() {
    }

    public Detalle_pedido(int Id_detalle, int Id_pedido, int numero_pedido, int Id_cliente, String nombre_producto, int total_pedido, int id_producto) {
        this.Id_detalle = Id_detalle;
        this.Id_pedido = Id_pedido;
        this.numero_pedido = numero_pedido;
        this.Id_cliente = Id_cliente;
        this.nombre_producto = nombre_producto;
        this.total_pedido = total_pedido;
        this.id_producto = id_producto;
    }

    public int getId_detalle() {
        return Id_detalle;
    }

    public void setId_detalle(int Id_detalle) {
        this.Id_detalle = Id_detalle;
    }

    public int getId_pedido() {
        return Id_pedido;
    }

    public void setId_pedido(int Id_pedido) {
        this.Id_pedido = Id_pedido;
    }

    public int getNumero_pedido() {
        return numero_pedido;
    }

    public void setNumero_pedido(int numero_pedido) {
        this.numero_pedido = numero_pedido;
    }

    public int getId_cliente() {
        return Id_cliente;
    }

    public void setId_cliente(int Id_cliente) {
        this.Id_cliente = Id_cliente;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public int getTotal_pedido() {
        return total_pedido;
    }

    public void setTotal_pedido(int total_pedido) {
        this.total_pedido = total_pedido;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }
    
}
