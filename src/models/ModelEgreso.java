/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import net.proteanit.sql.DbUtils;
import javax.swing.table.TableModel;
/**
 *
 * @author fernando
 */
public class ModelEgreso {/*
    private final ModelMain model_main;
    
    public ModelEgreso(ModelMain model_main){
        this.model_main = model_main;
    }

    private String sql;
    
    private int id_egreso;
    private String cantidad;
    private String monto;
    private TableModel tabla;
    private String fecha; 
    private DefaultComboBoxModel combo_dinamico;

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public int getId_egreso() {
        return id_egreso;
    }

    public void setId_egreso(int id_egreso) {
        this.id_egreso = id_egreso;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public TableModel getTabla() {
        return tabla;
    }

    public void setTabla(TableModel tabla) {
        this.tabla = tabla;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public DefaultComboBoxModel getCombo_dinamico() {
        return combo_dinamico;
    }

    public void setCombo_dinamico(DefaultComboBoxModel combo_dinamico) {
        this.combo_dinamico = combo_dinamico;
    }
   public void AsignarDatos(){
        try{
            id_egreso = model_main.getRs().getInt("id_egreso");
            cantidad = model_main.getRs().getString("nombre");
            monto = model_main.getRs().getString("genero");
            fecha = model_main.getRs().getString("fecha");
            combo_dinamico = model_main.getRs().getString("telefono2");
            
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
*/    
}
