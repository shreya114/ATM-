/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author dell
 */
public class Home {
      
    public void homeView(int id) throws SQLException {
        Operations operations = new Operations();
        Font txt = new Font("", Font.BOLD, 25);
        Commons commons = new Commons();
        JFrame frame = (JFrame)commons.Frame();
        JLabel quick = new JLabel("<Quick Cash");
        quick.setBounds(30, 250, 200, 30);
        quick.setFont(txt);
        JLabel withdraw = new JLabel("Withdraw>");
        withdraw.setBounds(350, 250, 200, 30);
        withdraw.setHorizontalAlignment(JLabel.RIGHT);
        withdraw.setFont(txt);
        JLabel deposit = new JLabel("< Deposit");
		deposit.setBounds(30, 350, 200, 30);
		deposit.setFont(txt);
		JLabel sts = new JLabel("Mini Statement >");
		sts.setBounds(350, 350, 200, 30);
		sts.setHorizontalAlignment(JLabel.RIGHT);
		sts.setFont(txt);
		JLabel bal = new JLabel("< Balance Enquiry");
		bal.setBounds(30, 450, 250, 30);
		bal.setFont(txt);
		JLabel pinchange = new JLabel("Change Pin >");
		pinchange.setBounds(350, 450, 200, 30);
		pinchange.setHorizontalAlignment(JLabel.RIGHT);
		pinchange.setFont(txt);
		frame.add(quick);
		frame.add(withdraw);
		frame.add(deposit);
		frame.add(sts);
		frame.add(bal);
		frame.add(pinchange);
		frame.setVisible(true);
                
                quick.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        Quick qk = new Quick();
                        try {
                            qk.quickView(id);
                        } catch (SQLException e1) {
                        }
                        frame.dispose();
                    }
                });
                
                withdraw.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        try {
                            operations.opView("Withdraw Amount",id);
                        } catch (SQLException e1) {
                        } 
                        frame.dispose();
                    }
                });
                
                deposit.addMouseListener(new MouseAdapter() {
                    @Override

                    public void mousePressed(MouseEvent e) {
                        try{
                            operations.opView("Deposit Amount",id);
                        } catch (SQLException e1) {

                        }
                        frame.dispose();
                    }
                });
                
                sts.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        Statements state = new Statements();
                        try{
                            state.stateView(id);
                        } catch(SQLException e1) {
                        }
                        frame.dispose();
                    }
                });
                
                bal.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e){
                        try {
                            operations.opView("Balance", id);
                        } catch(SQLException e1) {
                        }
                        frame.dispose();
                    }
                });
                
                pinchange.addMouseListener(new MouseAdapter(){
                    @Override
                    public void mousePressed(MouseEvent e){
                        try {
                            operations.opView("New PIN", id);
                        } catch(SQLException e1) {
                        }
                        frame.dispose();
                    }
                });
    }
}

    

    

