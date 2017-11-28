/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import views.*;
import models.*;

/**
 *
 * @author fernando
 */
public class ControllerMain {
    private final ViewMain view_main;
    private final ViewClientes view_clientes;
    
    private final ModelMain model_main;
    private final ModelClientes model_clientes;  

    private final ControllerClientes controller_clientes;
    
    public ControllerMain(Object models[], Object views[], Object controllers[]){
        this.model_clientes = (ModelClientes)models[1];
        this.view_main = (ViewMain)views[0];
        this.model_main = (ModelMain)models[0];
        this.view_clientes = (ViewClientes)views[1];
        this.controller_clientes = (ControllerClientes)controllers[0];
        
        initView();
    }    
    public void initView(){
        view_main.setVisible(true);
        view_main.setResizable(false); //tamaño
        view_main.setLocationRelativeTo(null);
        view_main.setTitle("Bienvenido");
        this.view_main.jmi_clientes.addActionListener(e-> jmi_clientesActionPerformed());    
        this.view_main.jmi_cerrar_sesion.addActionListener(e-> jmi_cerrar_sesionActionPerformed());
    }
    public void jmi_clientesActionPerformed(){
        this.view_main.setContentPane(view_clientes);
        this.view_main.revalidate();
        this.view_main.repaint();
    }    
    public void jmi_cerrar_sesionActionPerformed(){
        System.exit(0);
    }    
}
