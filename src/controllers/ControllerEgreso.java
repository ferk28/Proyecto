/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import models.ModelEgreso;
import views.ViewEgreso;
import models.ModelMain;
import java.awt.event.FocusEvent;

import java.awt.event.FocusListener;

/**
 *
 * @author fernando
 */
public class ControllerEgreso implements FocusListener{
    private final ModelEgreso model_egreso;
    private final ViewEgreso view_egreso;
    private final ModelMain model_main;
    
    public ControllerEgreso(Object views[], Object models[], Object controllers[]){
        this.model_egreso = (ModelEgreso) models[3];
        this.view_egreso = (ViewEgreso) views[3];
        this.model_main = (ModelMain) views[0];
        
        initView();
    }

    @Override
    public void focusGained(FocusEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void focusLost(FocusEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void initView() {
        view_egreso.addFocusListener(this);
    }
}
