package com.mqxu.sm.frame;

import com.mqxu.sm.factory.ServiceFacotry;
import com.mqxu.sm.utils.ResultEntity;
//import frame.MainFrame;

import javax.swing.*;

/**
 * @ClassName AdminLoginFrame
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/11/20
 **/
public class AdminLoginFrame extends JFrame {
    private JPanel mainPanel;
    private JTextField accountField;
    private JPasswordField passwordField;
    private JButton LoginBtn;
    private JButton resetBtn;

    public AdminLoginFrame(){
        this.setTitle("AdminLoginName");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        LoginBtn.addActionListener(e ->{
            String account=accountField.getText().trim();
            String password=new String(passwordField.getPassword()).trim();
            ResultEntity resultEntity= ServiceFacotry.getAdminServiceInstance().adminLogin(account,password);
            JOptionPane.showMessageDialog(mainPanel,resultEntity.getMessage());
            if(resultEntity.getCode()==0) {
                this.dispose();
                new MainFrame();

            }
            else{
                accountField.setText("");
                passwordField.setText("");
            }
        });
         resetBtn.addActionListener(e ->{
            accountField.setText("");
             passwordField.setText("");
});
    }
public  static void main(String[] args){
        new AdminLoginFrame();
}


}
