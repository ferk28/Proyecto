/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javax.swing.JSpinner;

/**
 *
 * @author fernando
 */
public class ViewEgreso extends javax.swing.JPanel {

    /**
     * Creates new form ViewIngreso
     */
    public ViewEgreso() {
        initComponents();
//        jsp_fecha.setEditor(new JSpinner.DateEditor(jsp_fecha, "YYYY-MM-DD"));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_id_egreso = new javax.swing.JLabel();
        jl_monto = new javax.swing.JLabel();
        jl_cantidad = new javax.swing.JLabel();
        jl_fecha = new javax.swing.JLabel();
        jl_tipo_de_egreso = new javax.swing.JLabel();
        jtf_monto = new javax.swing.JTextField();
        jtf_cantidad = new javax.swing.JTextField();
        jtf_id_egreso = new javax.swing.JTextField();
        jcb_tipo_egreso = new javax.swing.JComboBox<>();
        jbtn_agregar_egreso = new javax.swing.JButton();
        jbtn_primero = new javax.swing.JButton();
        jbtn_anterior = new javax.swing.JButton();
        jbtn_siguiente = new javax.swing.JButton();
        jbtn_ultimo = new javax.swing.JButton();
        jbtn_nuevo = new javax.swing.JButton();
        jbtn_editar = new javax.swing.JButton();
        jbtn_agregar = new javax.swing.JButton();
        jbtn_eliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_table = new javax.swing.JTable();
        jtf_fecha = new javax.swing.JTextField();

        jl_id_egreso.setText("ID Egreso");

        jl_monto.setText("Monto");

        jl_cantidad.setText("Cantidad");

        jl_fecha.setText("Fecha");

        jl_tipo_de_egreso.setText("Tipo de Egreso");

        jcb_tipo_egreso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jbtn_primero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/espalda (1).png"))); // NOI18N

        jbtn_anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/espalda (1).png"))); // NOI18N

        jbtn_siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/avance-rapido (2).png"))); // NOI18N

        jbtn_ultimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/espalda (2).png"))); // NOI18N

        jbtn_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/expulsar.png"))); // NOI18N

        jbtn_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ajustes.png"))); // NOI18N

        jbtn_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/anadir_1.png"))); // NOI18N

        jbtn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eliminar.png"))); // NOI18N

        jt_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jt_table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jl_monto)
                                            .addComponent(jl_cantidad)
                                            .addComponent(jl_id_egreso))
                                        .addGap(91, 91, 91))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jl_fecha)
                                        .addGap(116, 116, 116)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtf_id_egreso, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(jtf_monto)
                                    .addComponent(jtf_cantidad)
                                    .addComponent(jtf_fecha)))
                            .addComponent(jcb_tipo_egreso, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jl_tipo_de_egreso)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn_nuevo)
                    .addComponent(jbtn_editar)
                    .addComponent(jbtn_agregar)
                    .addComponent(jbtn_eliminar))
                .addGap(65, 65, 65))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jbtn_agregar_egreso)
                .addGap(231, 231, 231)
                .addComponent(jbtn_primero)
                .addGap(88, 88, 88)
                .addComponent(jbtn_anterior)
                .addGap(69, 69, 69)
                .addComponent(jbtn_siguiente)
                .addGap(60, 60, 60)
                .addComponent(jbtn_ultimo)
                .addContainerGap(318, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn_nuevo)
                                .addGap(37, 37, 37)
                                .addComponent(jbtn_editar)
                                .addGap(47, 47, 47)
                                .addComponent(jbtn_agregar)
                                .addGap(54, 54, 54)
                                .addComponent(jbtn_eliminar))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_id_egreso)
                            .addComponent(jtf_id_egreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_monto)
                            .addComponent(jtf_monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtf_cantidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jl_cantidad)
                                .addGap(82, 82, 82)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_fecha)
                            .addComponent(jtf_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addComponent(jl_tipo_de_egreso)
                        .addGap(18, 18, 18)
                        .addComponent(jcb_tipo_egreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtn_primero)
                            .addComponent(jbtn_anterior)
                            .addComponent(jbtn_siguiente)
                            .addComponent(jbtn_ultimo))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbtn_agregar_egreso)
                        .addGap(67, 67, 67))))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JButton jbtn_agregar;
    public javax.swing.JButton jbtn_agregar_egreso;
    public javax.swing.JButton jbtn_anterior;
    public javax.swing.JButton jbtn_editar;
    public javax.swing.JButton jbtn_eliminar;
    public javax.swing.JButton jbtn_nuevo;
    public javax.swing.JButton jbtn_primero;
    public javax.swing.JButton jbtn_siguiente;
    public javax.swing.JButton jbtn_ultimo;
    public javax.swing.JComboBox<String> jcb_tipo_egreso;
    public javax.swing.JLabel jl_cantidad;
    public javax.swing.JLabel jl_fecha;
    public javax.swing.JLabel jl_id_egreso;
    public javax.swing.JLabel jl_monto;
    public javax.swing.JLabel jl_tipo_de_egreso;
    public javax.swing.JTable jt_table;
    public javax.swing.JTextField jtf_cantidad;
    public javax.swing.JTextField jtf_fecha;
    public javax.swing.JTextField jtf_id_egreso;
    public javax.swing.JTextField jtf_monto;
    // End of variables declaration//GEN-END:variables
}
