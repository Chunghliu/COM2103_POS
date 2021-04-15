

package main;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class UserLogin extends javax.swing.JFrame {
    utilities.DisplayTrayIcon DTI = new utilities.DisplayTrayIcon();
    int pX, pY, x=0;
    Connection conn = null;
    Statement stm = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    /**
     * Creates new form logPanel
     */
    public UserLogin() {
        initComponents();
        iconMethod();
       
    }
    public void iconMethod()
    {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pwd = new javax.swing.JPasswordField();
        username = new javax.swing.JTextField();
        btn_login = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        pwd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pwd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pwdKeyPressed(evt);
            }
        });
        getContentPane().add(pwd);
        pwd.setBounds(260, 180, 180, 30);

        username.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usernameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usernameMouseExited(evt);
            }
        });
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usernameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usernameKeyTyped(evt);
            }
        });
        getContentPane().add(username);
        username.setBounds(260, 120, 180, 30);

        btn_login.setText("LOGIN");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_login);
        btn_login.setBounds(290, 240, 100, 40);

        jLabel2.setFont(new java.awt.Font("Modern No. 20", 1, 20)); // NOI18N
        jLabel2.setText("Username :");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 100, 140, 80);

        jLabel3.setFont(new java.awt.Font("Modern No. 20", 1, 20)); // NOI18N
        jLabel3.setText("Password :");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 160, 100, 70);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attatchments/close_16.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(660, 10, 40, 40);

        jLabel6.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attatchments/fast-food.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(450, 170, 260, 230);

        jLabel7.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel7.setText("User Login");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 40, 200, 50);

        setSize(new java.awt.Dimension(715, 399));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <= 1.0; i = i + 0.1) 
        {
            String val = i + "F";
            
            float f = Float.valueOf(val);
            
            this.setOpacity(f);

            try{
                Thread.sleep(100);

            }catch (Exception e) 
            {

            }

        }
    }//GEN-LAST:event_formWindowOpened

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - pX, this.getLocation().y + evt.getY() - pY);
        
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
         pX = evt.getX();
         pY = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
      
       int option=JOptionPane.showConfirmDialog(null,"Are you sure you want to exit?");
        ///delete whole or specific exam
        if(option==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel5MouseClicked
    public void close()
    {
        this.dispose();
    }
    private void pwdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwdKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            DatabaseConnection.DbConnection Connect = new DatabaseConnection.DbConnection();
            conn = Connect.Connectdb();
        if(username.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter your username first.");
            return;

        }
        if(pwd.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "You must enter your password.");
            return;
        }

          try{
            
            String sql = "SELECT * FROM `profilemaster` WHERE `Username` = ? AND `Password` = ?";

            pst = conn.prepareStatement(sql);
            pst.setString(1, username.getText().toUpperCase());
            pst.setString(2, pwd.getText());
            rs = pst.executeQuery();
            if(rs.next())
            {
                this.hide();
                ImageIcon II = new ImageIcon(getClass().getResource("/attatchments/management_lock_open.png"));
                
                if(rs.getString("Role").equals("Admin"))
                {
                    long time = System.currentTimeMillis();
                    java.sql.Timestamp timestamp = new java.sql.Timestamp(time);
                    close();
                    Dashboard mainPanel = new Dashboard(true, rs.getString("Name"), timestamp.toString());
                    mainPanel.setVisible(true);
                    setTimeStamp(rs.getString("Name"), timestamp.toString());
                }else{
                     long time = System.currentTimeMillis();
                    java.sql.Timestamp timestamp = new java.sql.Timestamp(time);
                    close();
                    Dashboard mainPanel = new Dashboard(false, rs.getString("Name") , timestamp.toString());
                    mainPanel.setVisible(true);
                    setTimeStamp(rs.getString("Name"), timestamp.toString());
                }
                
            }else{
                JOptionPane.showMessageDialog(this, "User not found\nKindly check your username/password ", "Error", JOptionPane.ERROR_MESSAGE);
            
                ImageIcon II = new ImageIcon(getClass().getResource("/attatchments/management_lock.png"));
            
                pwd.setText("");
            }
        }catch(Exception e)
        {
            e.printStackTrace();
           // JOptionPane.showMessageDialog(null, "SYSTEM ERROR!!\nPLEASE CONFIRM YOUR DATABASE IS UP AND RUNNING.");
            JOptionPane.showMessageDialog( null, "PLEASE CONFIRM YOUR DATABASE IS UP AND RUNNING.","SYSTEM ERROR!! ", JOptionPane.ERROR_MESSAGE);
                       
        }
        }
    }//GEN-LAST:event_pwdKeyPressed

    private void usernameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/attatchments/management_lock_open.png"));
       
    }//GEN-LAST:event_usernameMouseEntered

    private void usernameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseExited
        if(username.getText().equals(""))
        {
          ImageIcon II = new ImageIcon(getClass().getResource("/attatchments/management_lock.png"));
          
        }
        
    }//GEN-LAST:event_usernameMouseExited

    private void usernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyPressed
        
    }//GEN-LAST:event_usernameKeyPressed

    private void usernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyReleased
      
    }//GEN-LAST:event_usernameKeyReleased

    private void usernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyTyped
        
    }//GEN-LAST:event_usernameKeyTyped

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        DatabaseConnection.DbConnection Connect = new DatabaseConnection.DbConnection();
            conn = Connect.Connectdb();
        if(username.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter your username first.");
            return;

        }
        if(pwd.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "You must enter your password.");
            return;
        }

          try{
            
            String sql = "SELECT * FROM `profilemaster` WHERE `Username` = ? AND `Password` = ?";

            pst = conn.prepareStatement(sql);
            pst.setString(1, username.getText().toUpperCase());
            pst.setString(2, pwd.getText());
            rs = pst.executeQuery();
            if(rs.next())
            {
                this.hide();
                ImageIcon II = new ImageIcon(getClass().getResource("/attatchments/management_lock_open.png"));
               
                if(rs.getString("Role").equals("Admin"))
                {
                     long time = System.currentTimeMillis();
                    java.sql.Timestamp timestamp = new java.sql.Timestamp(time);
                    close();
                    Dashboard mainPanel = new Dashboard(true, rs.getString("Name"), timestamp.toString());
                    mainPanel.setVisible(true);
                    setTimeStamp(rs.getString("Name"), timestamp.toString());
                }else{
                     long time = System.currentTimeMillis();
                    java.sql.Timestamp timestamp = new java.sql.Timestamp(time);
                    close();
                    Dashboard mainPanel = new Dashboard(false, rs.getString("Name"), timestamp.toString());
                    mainPanel.setVisible(true);
                    setTimeStamp(rs.getString("Name"), timestamp.toString());
                }
                
            }else{
                JOptionPane.showMessageDialog(this, "User not found\nKindly check your username/password ", "Error", JOptionPane.ERROR_MESSAGE);
            
                ImageIcon II = new ImageIcon(getClass().getResource("/attatchments/management_lock.png"));
               
                pwd.setText("");
            }
        }catch(Exception e)
        {
            e.printStackTrace();
           // JOptionPane.showMessageDialog(null, "SYSTEM ERROR!!\nPLEASE CONFIRM YOUR DATABASE IS UP AND RUNNING.");
            JOptionPane.showMessageDialog( null, "PLEASE CONFIRM YOUR DATABASE IS UP AND RUNNING.","SYSTEM ERROR!! ", JOptionPane.ERROR_MESSAGE);
                       
        }
    }//GEN-LAST:event_btn_loginActionPerformed
    private void setTimeStamp(String User, String TimeStamp)
    {
        try{
            String NewStudent = "INSERT INTO `login_time_stamps`( `User`, `Activity`, `Time`) VALUES ( ?, ?, ? )";
            pst = conn.prepareStatement(NewStudent);
            pst.setString(1, User);
            pst.setString(2, "Logged In");
            pst.setString(3, TimeStamp);
            pst.execute();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
              try
              {
              Thread.sleep(4500);
              }
              catch(Exception e)
              {
              
              } 
                
                new UserLogin().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
