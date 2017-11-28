package controllers;

import javax.swing.JOptionPane;
import views.ViewClientes;
import models.ModelClientes;
import views.ViewMain;
import models.ModelMain;
/**
 *
 * @author fernando
 */
public final class ControllerClientes {
    private final ModelClientes model_clientes;
    private final ViewMain view_main;        
    private final ViewClientes view_clientes;  
    private final ControllerMain controller_main;
    private final ModelMain model_main;
    
    public ControllerClientes(Object models[], Object views[], Object controllers[]){
        this.model_clientes = (ModelClientes)models[1];
        this.view_main = (ViewMain)views[0];                
        this.view_clientes = (ViewClientes)views[1];
        this.controller_main = (ControllerMain)controllers[0];
        this.model_main = (ModelMain)models[0];

        initView();
        }
    public void initView(){
        
        view_clientes.jbtn_primero.addActionListener(e-> jbtn_primero_click());
        view_clientes.jbtn_ultimo.addActionListener(e-> jbtn_ultimo_click());
        view_clientes.jbtn_siguiente.addActionListener(e-> jbtn_siguiente_click());
        view_clientes.jbtn_anterior.addActionListener(e-> jbtn_anterior_click());
        view_clientes.jbtn_agregar.addActionListener(e-> jbtn_agregar_click());
        view_clientes.jbtn_editar.addActionListener(e-> jbtn_editar_click());
        view_clientes.jbtn_eliminar.addActionListener(e-> jbtn_eliminar_click());
        view_clientes.jbtn_nuevo.addActionListener(e-> jbtn_nuevo_click());         
        
        view_clientes.jbtn_agregar.setEnabled(false);
        view_clientes.jtf_id_cliente.setEditable(false);
        
        getValores();
        botones();
    }
    public void getValores(){
        view_clientes.jtf_id_cliente.setText("" + model_clientes.getId_cliente());
        view_clientes.jtf_nombre.setText(model_clientes.getNombre());
        view_clientes.jtf_genero.setText(model_clientes.getGenero());
        view_clientes.jtf_telefono.setText(model_clientes.getTelefono());
        view_clientes.jtf_telefono2.setText(model_clientes.getTelefono2());
        
//        view_clientes.jt_clientes.setModel(model_clientes.getTabla_clientes());        
    }
    public void setValores(){
        model_clientes.setId_cliente(Integer.parseInt(view_clientes.jtf_id_cliente.getText()));
        model_clientes.setNombre(view_clientes.jtf_nombre.getText());
        model_clientes.setGenero(view_clientes.jtf_genero.getText());
        model_clientes.setTelefono(view_clientes.jtf_telefono.getText());
        model_clientes.setTelefono2(view_clientes.jtf_telefono2.getText());

    }    
    public void ActualizarInterfaz(){
        model_clientes.llenarDatos();
        getValores();
    }
    public void jbtn_nuevo_click(){
        agregar_true();
        view_clientes.jtf_id_cliente.setText("0");
        view_clientes.jtf_nombre.setText("");
        view_clientes.jtf_genero.setText("");
        view_clientes.jtf_telefono.setText("");
        view_clientes.jtf_telefono2.setText("");
    }
     public void jbtn_agregar_click(){
        
        if(view_clientes.jtf_nombre.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Ingrese texto! >:(");
        }else{
        setValores();
        model_clientes.insertar();
        ActualizarInterfaz();
        agregar_falso();
        }
    }
    public void jbtn_editar_click(){
        setValores();
        if (JOptionPane.showConfirmDialog(null, "Se modificará el registro ¿Desea continuar?",
        "Modificar registro", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        model_clientes.modificar();
        ActualizarInterfaz();
    }
    public void jbtn_eliminar_click(){
        setValores();
        if (JOptionPane.showConfirmDialog(null, "Se eliminará el registro, ¿Desea continuar?",
        "Eliminar Registro", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        model_clientes.borrar();
        ActualizarInterfaz();
    }
    public void jbtn_primero_click(){
        model_main.Mover_Primero();
        model_clientes.AsignarDatos();
        getValores();
        agregar_falso();
    }
    public void jbtn_ultimo_click(){
        model_main.Mover_Ultimo();
        model_clientes.AsignarDatos();
        getValores();
        agregar_falso();        
    }
    public void jbtn_anterior_click(){
        model_main.Mover_Anterior();
        model_clientes.AsignarDatos();
        getValores();
        agregar_falso();
    }
    public void jbtn_siguiente_click(){
        model_main.Mover_Siguiente();
        model_clientes.AsignarDatos();
        getValores();
        agregar_falso();
    }
    
    public void agregar_falso(){
        view_clientes.jbtn_agregar.setEnabled(false);
        view_clientes.jbtn_editar.setEnabled(true);
        view_clientes.jbtn_eliminar.setEnabled(true);          
    }
    public void agregar_true(){
        view_clientes.jbtn_agregar.setEnabled(true);
        view_clientes.jbtn_eliminar.setEnabled(false);
        view_clientes.jbtn_editar.setEnabled(false);        
    }
    public void botones(){
        view_clientes.jbtn_agregar.setOpaque(false);
        view_clientes.jbtn_agregar.setContentAreaFilled(false);                  
        view_clientes.jbtn_agregar.setBorderPainted(false);
        
        view_clientes.jbtn_anterior.setOpaque(false);
        view_clientes.jbtn_anterior.setContentAreaFilled(false);                  
        view_clientes.jbtn_anterior.setBorderPainted(false);
        
        view_clientes.jbtn_editar.setOpaque(false);
        view_clientes.jbtn_editar.setContentAreaFilled(false);                  
        view_clientes.jbtn_editar.setBorderPainted(false);
        
        view_clientes.jbtn_eliminar.setOpaque(false);
        view_clientes.jbtn_eliminar.setContentAreaFilled(false);                  
        view_clientes.jbtn_eliminar.setBorderPainted(false);
        
        view_clientes.jbtn_nuevo.setOpaque(false);
        view_clientes.jbtn_nuevo.setContentAreaFilled(false);                  
        view_clientes.jbtn_nuevo.setBorderPainted(false);
        
        view_clientes.jbtn_primero.setOpaque(false);
        view_clientes.jbtn_primero.setContentAreaFilled(false);                  
        view_clientes.jbtn_primero.setBorderPainted(false);
        
        view_clientes.jbtn_siguiente.setOpaque(false);
        view_clientes.jbtn_siguiente.setContentAreaFilled(false);                  
        view_clientes.jbtn_siguiente.setBorderPainted(false);
        
        view_clientes.jbtn_ultimo.setOpaque(false);
        view_clientes.jbtn_ultimo.setContentAreaFilled(false);                  
        view_clientes.jbtn_ultimo.setBorderPainted(false);
        
    }
        
}
