

import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.*;

public class JF_test extends JDialog{
    public JF_test(){
        this.setTitle("test");
        Container con = this.getContentPane();
        con.setLayout(new FlowLayout()); // 设置布局
        JLabel label2 = new JLabel("+");
        JTextField R = new JTextField(5);
        JButton button = new JButton("=");
        JTextField L = new JTextField(5);
        JTextField result = new JTextField(3);
  con.add(R);
        con.add(label2); con.add(L);
        con.add(button);
        con.add(result);
        button.addActionListener((e)->{
            String r= R.getText();
            String l =  L.getText();
            result.setText(String.valueOf(Integer.parseInt(r)+Integer.parseInt(l)));
        });
        this.setVisible(true);
        this.setSize(250,350);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //设置关闭方式，可以选择多种关闭玄子选项
    }

    public static void main(String[] args) {
        new JF_test();

    }

}

