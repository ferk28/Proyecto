/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import javax.swing.table.TableModel;

/**
 *
 * @author fernando
 */

public class ModelClientes {
    private final ModelMain model_main;        

    public ModelClientes(ModelMain model_main){
        this.model_main = model_main;
    }
    
    private String sql; 
    
    private int id_cliente;
    private String nombre;
    private String genero;
    private String telefono;
    private String telefono2;
    private TableModel tabla_clientes;
    private String buscar;
        
    public void setBuscar(String buscar) {
        this.buscar = buscar;
    }

    public String getBuscar() {
        return buscar;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }
    
    public TableModel getTabla_clientes(){
       return tabla_clientes;
    }
    
    public int getId_cliente() {
        return id_cliente;
    }
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
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
    
    
   public void AsignarDatos(){
        try{
            id_cliente = model_main.getRs().getInt("id_cliente");
            nombre = model_main.getRs().getString("nombre");
            genero = model_main.getRs().getString("genero");
            telefono = model_main.getRs().getString("telefono");
            telefono2 = model_main.getRs().getString("telefono2");
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "error 102.2" + e);
        }
    }    
   
    public void llenarActualizarDatos(){
        model_main.setSql("SELECT * FROM clientes;");
        model_main.Ejecutar_Consulta();
        tabla_clientes = DbUtils.resultSetToTableModel(model_main.getRs());
        model_main.Mover_Primero();
        AsignarDatos();

    }
    public void buscar_jtable(){

        model_main.setSql("SELECT * FROM clientes WHERE nombre LIKE ('%"+buscar+"%') OR genero LIKE ('%"+buscar+"%') OR telefono LIKE ('%"+buscar+"%') OR telefono2 LIKE ('%"+buscar+"%');");       
        model_main.Ejecutar_Consulta();
        tabla_clientes = DbUtils.resultSetToTableModel(model_main.getRs());
        model_main.Mover_Primero();
        AsignarDatos();
        System.out.println("buscar jtable");
    }    

    public void insertar(){
        try{
            model_main.setSql("INSERT INTO clientes(nombre, genero, telefono, telefono2) VALUES (?,?,?,?);");
            model_main.Preparar_Statement();
            model_main.getPs().setString(1, nombre);
            model_main.getPs().setString(2, genero);
            model_main.getPs().setString(3, telefono);
            model_main.getPs().setString(4, telefono2);
            model_main.Ejecutar_Actualizacion();

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"error 108" + e);
        }
    }
    public void borrar(){
        try{
            model_main.setSql("DELETE FROM clientes WHERE id_cliente = ?;");
            model_main.Preparar_Statement();
            model_main.getPs().setInt(1, id_cliente);
            model_main.Ejecutar_Actualizacion();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"error 109" + e);
        }
    }
    public void modificar(){
        try{
            model_main.setSql("UPDATE clientes SET nombre=? , genero=? , telefono=? , telefono2=? WHERE id_cliente=?;");
            model_main.Preparar_Statement();
            model_main.getPs().setInt(5, id_cliente);
            model_main.getPs().setString(1, nombre);
            model_main.getPs().setString(2, genero);
            model_main.getPs().setString(3, telefono);
            model_main.getPs().setString(4, telefono2);
            model_main.Ejecutar_Actualizacion();

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"error 110" + e);
        }
    }
    
}
