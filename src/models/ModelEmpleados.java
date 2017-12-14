/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author fernando
 */
public class ModelEmpleados {
    private final ModelMain model_main;
    
    public ModelEmpleados(ModelMain model_main){
        this.model_main = model_main;
    }
    private int id_empleado;
    private String nombre;
    private int edad;
    private String genero;
    private String clave_elector;
    private String telefono;
    private String telefono2;
    private String identificaciones;
    private TableModel tabla_empleados;


    private String sql;
    
    
    public void AsignarDatos(){
        try{
            id_empleado = model_main.getRs().getInt("id_articulo");
            nombre = model_main.getRs().getString("nombre");
            edad = model_main.getRs().getInt("edad");
            genero = model_main.getRs().getString("genero");
            clave_elector = model_main.getRs().getString("clave_elector");
            telefono = model_main.getRs().getString("telefono");
            telefono2 = model_main.getRs().getString("telefono2");
            identificaciones = model_main.getRs().getString("identificacion");
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "error 202" + e);
        }
    }    
   
    public void llenarActualizarDatos(){
        model_main.setSql("SELECT * FROM clientes;");
        model_main.Ejecutar_Consulta();
        tabla_empleados = DbUtils.resultSetToTableModel(model_main.getRs());
        model_main.Mover_Primero();
        AsignarDatos();

    }

    public void insertar(){
        try{
            
            model_main.setSql("INSERT INTO clientes(id_empleado, nombre, edad, genero, clave_elector, telefono, telefono2, identificacion) VALUES (?,?,?,?);");
            model_main.Preparar_Statement();
            model_main.getPs().setInt(1, id_empleado);
            model_main.getPs().setString(2, nombre);
            model_main.getPs().setInt(3, edad);
            model_main.getPs().setString(4, genero);
            model_main.getPs().setString(5, clave_elector);
            model_main.getPs().setString(6, telefono);
            model_main.getPs().setString(4, telefono2);
            model_main.getPs().setString(4, identificaciones);
            model_main.Ejecutar_Actualizacion();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"error 208" + e);
        }
    }
    public void borrar(){
        try{
            model_main.setSql("DELETE FROM empleados WHERE id_empleado = ?;");
            model_main.Preparar_Statement();
            model_main.getPs().setInt(1, id_empleado);
            model_main.Ejecutar_Actualizacion();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"error 209" + e);
        }
    }
    public void modificar(){
        try{
            model_main.setSql("UPDATE inventario SET nombre=? , edad=? , genero=?, clave_elector=?, telefono=?, telefono2=?, identificacion=? WHERE id_empleado=?;");
            model_main.Preparar_Statement();
            model_main.getPs().setInt(8, id_empleado);
            model_main.getPs().setString(1, nombre);
            model_main.getPs().setInt(2, edad);
            model_main.getPs().setString(3, genero);
            model_main.getPs().setString(4, clave_elector);
            model_main.getPs().setString(5, telefono);
            model_main.getPs().setString(6, telefono2);
            model_main.getPs().setString(7, identificaciones);
            model_main.Ejecutar_Actualizacion();

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"error 210" + e);
        }
    }
    
    
    
    
    public TableModel getTabla_empleados() {
        return tabla_empleados;
    }

    public void setTabla_empleados(TableModel tabla_empleados) {
        this.tabla_empleados = tabla_empleados;
    }
    
    
    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getClave_elector() {
        return clave_elector;
    }

    public void setClave_elector(String clave_elector) {
        this.clave_elector = clave_elector;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getIdentificaciones() {
        return identificaciones;
    }

    public void setIdentificaciones(String identificaciones) {
        this.identificaciones = identificaciones;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

}
