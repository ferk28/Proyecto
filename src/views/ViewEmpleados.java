/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author fernando
 */
public class ViewEmpleados extends javax.swing.JPanel {

    /**
     * Creates new form ViewEmpleados
     */
    public ViewEmpleados() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_id_empleado = new javax.swing.JLabel();
        jl_nombre = new javax.swing.JLabel();
        jl_edad = new javax.swing.JLabel();
        jl_genero = new javax.swing.JLabel();
        jl_clave_elector = new javax.swing.JLabel();
        jl_telefono = new javax.swing.JLabel();
        jl_telefono2 = new javax.swing.JLabel();
        jl_identificacion = new javax.swing.JLabel();
        jtf_id_empleado = new javax.swing.JTextField();
        jtf_nombre = new javax.swing.JTextField();
        jtf_clave_elector = new javax.swing.JTextField();
        jtf_telefono = new javax.swing.JTextField();
        jtf_telefono2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_empleados = new javax.swing.JTable();
        jbtn_nuevo = new javax.swing.JButton();
        jbtn_editar = new javax.swing.JButton();
        jbtn_agregar = new javax.swing.JButton();
        jbtn_eliminar = new javax.swing.JButton();
        jbtn_primero = new javax.swing.JButton();
        jbtn_anterior = new javax.swing.JButton();
        jbtn_siguiente = new javax.swing.JButton();
        jbtn_ultimo = new javax.swing.JButton();
        jcb_identificacion = new javax.swing.JComboBox<>();
        jcb_genero = new javax.swing.JComboBox<>();
        jsp_edad = new javax.swing.JSpinner();

        jl_id_empleado.setText("ID Empleado");

        jl_nombre.setText("Nombre");

        jl_edad.setText("Edad");

        jl_genero.setText("Genero");

        jl_clave_elector.setText("Clave de Elector");

        jl_telefono.setText("Telefono");

        jl_telefono2.setText("Telefono 2");

        jl_identificacion.setText("Identificaciones");

        jt_empleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jt_empleados);

        jbtn_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/expulsar.png"))); // NOI18N

        jbtn_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ajustes.png"))); // NOI18N

        jbtn_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/anadir_1.png"))); // NOI18N

        jbtn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eliminar.png"))); // NOI18N

        jbtn_primero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/espalda (1).png"))); // NOI18N

        jbtn_anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/avance-rapido (3).png"))); // NOI18N

        jbtn_siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/avance-rapido (2).png"))); // NOI18N

        jbtn_ultimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/espalda (2).png"))); // NOI18N

        jcb_identificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        jcb_genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_nombre)
                            .addComponent(jl_id_empleado)
                            .addComponent(jl_edad)
                            .addComponent(jl_genero)
                            .addComponent(jl_clave_elector)
                            .addComponent(jl_telefono)
                            .addComponent(jl_telefono2)
                            .addComponent(jl_identificacion))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jcb_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcb_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtf_telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                .addComponent(jtf_clave_elector)
                                .addComponent(jtf_telefono2)
                                .addComponent(jtf_nombre)
                                .addComponent(jtf_id_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jsp_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtn_primero)
                        .addGap(72, 72, 72)
                        .addComponent(jbtn_anterior)
                        .addGap(66, 66, 66)
                        .addComponent(jbtn_siguiente)
                        .addGap(50, 50, 50)
                        .addComponent(jbtn_ultimo)
                        .addGap(93, 93, 93)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn_agregar)
                    .addComponent(jbtn_eliminar)
                    .addComponent(jbtn_nuevo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtn_editar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_id_empleado)
                            .addComponent(jtf_id_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_nombre)
                            .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_edad)
                            .addComponent(jsp_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_genero)
                            .addComponent(jcb_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_clave_elector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_clave_elector))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_telefono)
                            .addComponent(jtf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_telefono2)
                            .addComponent(jtf_telefono2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcb_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_identificacion))
                        .addGap(0, 58, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_primero)
                    .addComponent(jbtn_siguiente)
                    .addComponent(jbtn_anterior)
                    .addComponent(jbtn_ultimo))
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jbtn_nuevo)
                .addGap(65, 65, 65)
                .addComponent(jbtn_editar)
                .addGap(73, 73, 73)
                .addComponent(jbtn_agregar)
                .addGap(67, 67, 67)
                .addComponent(jbtn_eliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtn_agregar;
    private javax.swing.JButton jbtn_anterior;
    private javax.swing.JButton jbtn_editar;
    private javax.swing.JButton jbtn_eliminar;
    private javax.swing.JButton jbtn_nuevo;
    private javax.swing.JButton jbtn_primero;
    private javax.swing.JButton jbtn_siguiente;
    private javax.swing.JButton jbtn_ultimo;
    private javax.swing.JComboBox<String> jcb_genero;
    private javax.swing.JComboBox<String> jcb_identificacion;
    private javax.swing.JLabel jl_clave_elector;
    private javax.swing.JLabel jl_edad;
    private javax.swing.JLabel jl_genero;
    private javax.swing.JLabel jl_id_empleado;
    private javax.swing.JLabel jl_identificacion;
    private javax.swing.JLabel jl_nombre;
    private javax.swing.JLabel jl_telefono;
    private javax.swing.JLabel jl_telefono2;
    private javax.swing.JSpinner jsp_edad;
    private javax.swing.JTable jt_empleados;
    private javax.swing.JTextField jtf_clave_elector;
    private javax.swing.JTextField jtf_id_empleado;
    private javax.swing.JTextField jtf_nombre;
    private javax.swing.JTextField jtf_telefono;
    private javax.swing.JTextField jtf_telefono2;
    // End of variables declaration//GEN-END:variables
}
