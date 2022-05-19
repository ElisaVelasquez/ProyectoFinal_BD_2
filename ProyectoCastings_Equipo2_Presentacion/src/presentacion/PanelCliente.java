package presentacion;

import Control.*;
import static Control.FabricaLogica.dameInstancia;
import ObjetoNegocio.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.bson.types.ObjectId;

/**
 *
 * @author Jarol, Daniel y Elisa.
 */
public class PanelCliente extends javax.swing.JPanel {

    ILogica logica;

    /**
     * Creates new form RegistrarClientes
     */
    public PanelCliente() {
        initComponents();
        logica = dameInstancia();
        llenarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoActividad = new javax.swing.ButtonGroup();
        fondo = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtContacto = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        Scroll = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        actividadCine = new javax.swing.JRadioButton();
        actividadModa = new javax.swing.JRadioButton();

        fondo.setBackground(new java.awt.Color(174, 198, 207));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        fondo.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 200, -1));

        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });
        fondo.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 200, -1));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        fondo.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        fondo.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, -1, -1));

        jLabel3.setText("Nombre:");
        fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel4.setText("Dirección:");
        fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel5.setText("Telefono:");
        fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel6.setText("Contacto:");
        fondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel8.setText("Tipo actividad:");
        fondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        txtContacto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactoKeyTyped(evt);
            }
        });
        fondo.add(txtContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 200, -1));

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        fondo.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 200, -1));

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Dirección", "Telefono", "Persona contacto", "Tipo actividad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Scroll.setViewportView(tblClientes);

        fondo.add(Scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 590, 370));

        grupoActividad.add(actividadCine);
        actividadCine.setText("Cine");
        fondo.add(actividadCine, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        grupoActividad.add(actividadModa);
        actividadModa.setText("Moda");
        fondo.add(actividadModa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 1207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        if (txtNombre.getText().trim().isEmpty() || txtDireccion.getText().trim().isEmpty()
                || txtTelefono.getText().trim().isEmpty() || txtContacto.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe llenar toda la informacion solicitada. \n No deje espacios en blanco.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

            String actividad = null;
            if (actividadCine.isSelected()) {
                actividad = actividadCine.getText();

            } else if (actividadModa.isSelected()) {
                actividad = actividadModa.getText();
            }

            Cliente c = new Cliente(new ObjectId(),
                    txtNombre.getText().trim().toUpperCase().charAt(0) + txtNombre.getText().trim().substring(1, txtNombre.getText().length()).toLowerCase(),
                    txtDireccion.getText().trim(),
                    txtTelefono.getText().trim(),
                    txtContacto.getText().trim(),
                    actividad,
                    new ArrayList<Casting>());

            try {
                c.validarDatos(c);

                logica.registrarCliente(c);
                limpiarCampos();
                llenarTabla();

                mostrarMensajeExito(c);

            } catch (RuntimeException ex) {
                mostrarError(ex);
                limpiarCampos();
            }
        }

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros && key != '-') {
            evt.consume();
            getToolkit().beep();
        }

        if (txtTelefono.getText().trim().length() >= 15) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        soloTexto(evt);
        if (txtNombre.getText().trim().length() == 40) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        if (txtDireccion.getText().trim().length() >= 100) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtContactoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactoKeyTyped
        // TODO add your handling code here:
        soloTexto(evt);
        if (txtContacto.getText().trim().length() == 40) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtContactoKeyTyped

    public JPanel despliegaPanel() {

        this.setSize(1040, 500);
        this.setLocation(5, 5);

        return this;
    }

    public void soloTexto(java.awt.event.KeyEvent evt) {
        char car = evt.getKeyChar();
        if (Character.isLetter(car) || car == ' ') {

        } else {
            evt.consume();
            getToolkit().beep();
        }
    }

    public void limpiarCampos() {
        txtNombre.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        txtContacto.setText("");
        grupoActividad.clearSelection();
    }

    public void mostrarError(Exception ex) {

        JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

    }

    /**
     * Muestra mensaje de exito y busca el cliente para obtener el id con el que
     * se registro para mostrarlo en el mensaje
     *
     * @param cliente
     */
    public void mostrarMensajeExito(Cliente cliente) {

        JOptionPane.showMessageDialog(this, "Registrado con exito Cliente:" + ((Cliente) logica.consultarPorNombre(cliente.getNombre())).getId());

    }

    public void llenarTabla() {
        List<Cliente> list = logica.consultarTodosClientes();
        DefaultTableModel model = (DefaultTableModel) tblClientes.getModel();

        int rowCount = model.getRowCount();

        for (int m = rowCount - 1; m >= 0; m--) {
            model.removeRow(m);
        }

        Object rowData[] = new Object[6];
        for (int i = 0; i < list.size(); i++) {
            rowData[0] = list.get(i).getId();
            rowData[1] = list.get(i).getNombre();
            rowData[2] = list.get(i).getDireccion();
            rowData[3] = list.get(i).getTelefono();
            rowData[4] = list.get(i).getPersonaContacto();
            rowData[5] = list.get(i).getTipoActividad();
            model.addRow(rowData);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Scroll;
    private javax.swing.JRadioButton actividadCine;
    private javax.swing.JRadioButton actividadModa;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JPanel fondo;
    private javax.swing.ButtonGroup grupoActividad;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtContacto;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
