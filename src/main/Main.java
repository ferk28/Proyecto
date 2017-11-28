/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import views.*;
import controllers.*;
import models.*;
/**
 *
 * @author fernando
 */
public class Main {   

    public static void main (String ferk[]){
        ModelMain model_main = new ModelMain();
        ModelClientes model_clientes = new ModelClientes(model_main);
        
        ViewMain view_main = new ViewMain();
        ViewClientes view_clientes = new ViewClientes();
        
        Object[] models = new Object[4];
        Object[] views = new Object[4];
        Object[] controllers = new Object[4];
        
        models[0] = model_main;
        models[1] = model_clientes;
        
        views[0] = view_main;
        views[1] = view_clientes;
        
        ControllerMain controller_main = new ControllerMain(models, views, controllers);
        controllers[0] = controller_main;     
        
        ControllerClientes controller_clientes = new ControllerClientes(models, views, controllers);
        controllers[1] = controller_clientes;
   
      }
}
