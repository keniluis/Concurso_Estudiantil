/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaAlumno;

import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Concurso extends javax.swing.JFrame {
DB_conection cc= new DB_conection();
Connection conect= cc.GetConnection();
    /**
     * Creates new form Alta_Carreras
     */
    public Concurso() {
        initComponents();
          this.setLocationRelativeTo(null);  
          codigoConcurso();
       ConsuAlumno();  
       ConsuDocente();
        
    }
    
    void ConsuAlumno(){  
     Conectar cc = new Conectar();
        java.sql.Connection cn = null;
        
        try {
            cn = cc.conexion();
        } catch (SQLException ex) {
            Logger.getLogger(Concurso.class.getName()).log(Level.SEVERE, null, ex);
        }
         String SSQL;
          SSQL= "SELECT Nombre, Apellido, Edad, Grupo FROM alumno WHERE Num_Concurso= '"+txtNum_Concurso2.getText()+"'";
        try {
               
        PreparedStatement st = cn.prepareStatement(SSQL);
        ResultSet rs = st.executeQuery();


        while (rs.next()){
         
      txtNombre.setText(rs.getString("Nombre"));
      txtApellido.setText(rs.getString("Apellido"));
      txtEdad.setText(rs.getString("Edad"));
      txtGrupo.setText(rs.getString("Grupo"));
        }
        } catch (SQLException e) {


        JOptionPane.showMessageDialog(null, e);
    
    cc.CerrarConexion();
    }           
 
     } 
   void ConsuDocente(){  
     Conectar cc = new Conectar();
        java.sql.Connection cn = null;
        
        try {
            cn = cc.conexion();
        } catch (SQLException ex) {
            Logger.getLogger(Concurso.class.getName()).log(Level.SEVERE, null, ex);
        }
         String SSQL;
          SSQL= "SELECT Nombre, Apellido, Edad, Asignatura FROM docente WHERE Num_Concurso= '"+txtNum_Concurso2.getText()+"'";
        try {
               
        PreparedStatement st = cn.prepareStatement(SSQL);
        ResultSet rs = st.executeQuery();


        while (rs.next()){
         
      txtNombre2.setText(rs.getString("Nombre"));
      txtApellido2.setText(rs.getString("Apellido"));
      txtEdad2.setText(rs.getString("Edad"));
      txtAsignatura.setText(rs.getString("Asignatura"));
        }
        } catch (SQLException e) {


        JOptionPane.showMessageDialog(null, e);
    
    cc.CerrarConexion();
    }           
 
     }  
    
   
      void codigoConcurso(){
     int j;
        int cont=1;
        String num="";
        String c="";
         String SQL="select max(Num_Concurso) from concurso";
        try {
            Statement st = conect.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            if(rs.next())
            {              
                 c=rs.getString(1);
            }
                
            if(c==null){
                txtNum_Concurso2.setText("CON-0001");
            }
            else{
            char r1=c.charAt(4);
            char r2=c.charAt(5);
            char r3=c.charAt(6);
            char r4=c.charAt(7);
            
            String r="";
            r=""+r1+r2+r3+r4;
            
                 j=Integer.parseInt(r);
                 GenerarCodigos gen= new GenerarCodigos();
                 gen.generar(j);
                 txtNum_Concurso2.setText("CON-"+gen.serie());
                
    }
       
        } catch (SQLException ex) {
           Logger.getLogger(Alta_Alumnos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtGrupo = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        txtaleatorio_estudiante = new javax.swing.JTextField();
        txtaleatorio_estudiante2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtApellido2 = new javax.swing.JTextField();
        txtEdad2 = new javax.swing.JTextField();
        txtNombre2 = new javax.swing.JTextField();
        txtAsignatura = new javax.swing.JTextField();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        txtaleatorio_docente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNum_Concurso2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        Num_ganador = new javax.swing.JTextField();
        txtApellido_Ganador = new javax.swing.JTextField();
        txtGA_Ganador = new javax.swing.JTextField();
        txtNombre_Ganador = new javax.swing.JTextField();
        txtEdad_Ganador = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CONCURSO");

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ESTUDIANTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtApellido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(0, 0, 204));
        txtApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellido.setEnabled(false);
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 106, 210, 40));

        txtEdad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEdad.setForeground(new java.awt.Color(0, 0, 204));
        txtEdad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEdad.setEnabled(false);
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 210, 40));

        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 204));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setEnabled(false);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 55, 211, 40));

        txtGrupo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtGrupo.setForeground(new java.awt.Color(0, 0, 204));
        txtGrupo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGrupo.setEnabled(false);
        txtGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrupoActionPerformed(evt);
            }
        });
        jPanel1.add(txtGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 210, 40));

        jToggleButton1.setText("PARTICIPAR");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 100, 30));

        jLabel2.setText("Numero Aleatorio:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        txtaleatorio_estudiante.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtaleatorio_estudiante.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtaleatorio_estudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 150, 40));
        jPanel1.add(txtaleatorio_estudiante2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 300, -1, 0));

        jPanel3.setBackground(new java.awt.Color(0, 51, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DOCENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtApellido2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtApellido2.setForeground(new java.awt.Color(0, 204, 51));
        txtApellido2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellido2.setEnabled(false);
        txtApellido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellido2ActionPerformed(evt);
            }
        });
        jPanel3.add(txtApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 210, 40));

        txtEdad2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEdad2.setForeground(new java.awt.Color(0, 204, 51));
        txtEdad2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEdad2.setEnabled(false);
        jPanel3.add(txtEdad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 210, 40));

        txtNombre2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNombre2.setForeground(new java.awt.Color(0, 204, 51));
        txtNombre2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre2.setEnabled(false);
        jPanel3.add(txtNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 211, 40));

        txtAsignatura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAsignatura.setForeground(new java.awt.Color(0, 204, 51));
        txtAsignatura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAsignatura.setEnabled(false);
        txtAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAsignaturaActionPerformed(evt);
            }
        });
        jPanel3.add(txtAsignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 210, 40));

        jToggleButton2.setText("PARTICIPAR");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 100, 30));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Numero Aleatorio:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        txtaleatorio_docente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtaleatorio_docente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(txtaleatorio_docente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 140, 40));

        jLabel7.setText("Concurso Nº:");

        txtNum_Concurso2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNum_Concurso2.setForeground(new java.awt.Color(255, 0, 51));
        txtNum_Concurso2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum_Concurso2.setEnabled(false);

        jPanel2.setBackground(new java.awt.Color(0, 204, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalles del Ganador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Num_ganador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Num_ganador.setForeground(new java.awt.Color(0, 204, 51));
        Num_ganador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Num_ganador.setEnabled(false);
        jPanel2.add(Num_ganador, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 210, 43));

        txtApellido_Ganador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtApellido_Ganador.setForeground(new java.awt.Color(0, 204, 0));
        txtApellido_Ganador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellido_Ganador.setEnabled(false);
        jPanel2.add(txtApellido_Ganador, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 260, 30));

        txtGA_Ganador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtGA_Ganador.setForeground(new java.awt.Color(0, 204, 0));
        txtGA_Ganador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGA_Ganador.setEnabled(false);
        jPanel2.add(txtGA_Ganador, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 260, 30));

        txtNombre_Ganador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNombre_Ganador.setForeground(new java.awt.Color(0, 204, 0));
        txtNombre_Ganador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre_Ganador.setEnabled(false);
        jPanel2.add(txtNombre_Ganador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 260, 30));

        txtEdad_Ganador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEdad_Ganador.setForeground(new java.awt.Color(0, 204, 0));
        txtEdad_Ganador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEdad_Ganador.setEnabled(false);
        jPanel2.add(txtEdad_Ganador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 260, 30));

        jButton1.setText("VER GANADOR");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ir al menú");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNum_Concurso2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNum_Concurso2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrupoActionPerformed

    private void txtAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAsignaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAsignaturaActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
     
    Random generadorAleatorios = new Random();

    //genera un numero entre 1 y 5 y lo guarda en la variable numeroAleatorio
    int numeroAleatorio = 1+generadorAleatorios.nextInt(5);
    //imprimo el numero en consola
    System.out.println(numeroAleatorio);
      txtaleatorio_estudiante.setText(""+numeroAleatorio);
        
      jToggleButton1.setEnabled(false);
      jButton1.setEnabled(true);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
   
       Random generadorAleatorios = new Random();

    //genera un numero entre 1 y 5 y lo guarda en la variable numeroAleatorio
    int numeroAleatorio = 1+generadorAleatorios.nextInt(5);
    //imprimo el numero en consola
    System.out.println(numeroAleatorio);
         txtaleatorio_docente.setText(""+numeroAleatorio);  
         jToggleButton2.setEnabled(false);
      jButton1.setEnabled(true);   
        
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        int a, b, c,d;
        String h,m,p,r,s,t;
    
        a = Integer.parseInt(txtaleatorio_docente.getText());
        b = Integer.parseInt(txtaleatorio_estudiante.getText());
        
        
        if (a>b){
        h =  txtNombre2.getText();
        m =  txtApellido2.getText();
        p =  txtAsignatura.getText();
        c = Integer.parseInt(txtEdad2.getText());
         Num_ganador.setText(""+a);
         txtNombre_Ganador.setText("Nombre: "+h);
         txtApellido_Ganador.setText("Apellidos: "+m);
         txtEdad_Ganador.setText("Edad: "+c);
         txtGA_Ganador.setText("Asignatura: "+p);
         
        }  else {
             Num_ganador.setText(""+b);
          r =  txtNombre.getText();
        s =  txtApellido.getText();
        t =  txtGrupo.getText();
        d = Integer.parseInt(txtEdad.getText());   
       Num_ganador.setText(""+a);
         txtNombre_Ganador.setText("Nombre: "+r);
         txtApellido_Ganador.setText("Apellidos: "+s);
         txtEdad_Ganador.setText("Edad: "+d);
         txtGA_Ganador.setText("Grupo: "+t);     
        }     
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtApellido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellido2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellido2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new GUI_MAIN().setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
   
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Concurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Concurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Concurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Concurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Concurso().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Num_ganador;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellido2;
    private javax.swing.JTextField txtApellido_Ganador;
    private javax.swing.JTextField txtAsignatura;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEdad2;
    private javax.swing.JTextField txtEdad_Ganador;
    private javax.swing.JTextField txtGA_Ganador;
    private javax.swing.JTextField txtGrupo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre2;
    private javax.swing.JTextField txtNombre_Ganador;
    private javax.swing.JTextField txtNum_Concurso2;
    private javax.swing.JTextField txtaleatorio_docente;
    private javax.swing.JTextField txtaleatorio_estudiante;
    private javax.swing.JTextField txtaleatorio_estudiante2;
    // End of variables declaration//GEN-END:variables
}
