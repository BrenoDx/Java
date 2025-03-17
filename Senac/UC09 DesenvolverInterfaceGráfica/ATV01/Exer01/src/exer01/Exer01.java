/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exer01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author breno
 */
public class Exer01 {
    public static void main(String[] args) {

      JFrame janela = new JFrame();
      janela.setSize(300,200);
      janela.setTitle("MVP");
      janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      janela.setVisible(true);
      janela.setLayout(new FlowLayout());
  
      JLabel rotulo = new JLabel();
      rotulo.setText("Informe valor da venda:");
      janela.add(rotulo);
      
      JTextField campo = new JTextField(10);
      janela.add(campo);
      
      JButton botao = new JButton();
      botao.setText("Clique Aqui");
      janela.add(botao);
      
      botao.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e){
             Double valor = Double.parseDouble(campo.getText());
           
              if(valor < 0){
                  JOptionPane.showMessageDialog(null, "Valor inválido");
            }else if (valor < 500){
                  JOptionPane.showMessageDialog(null, "Valor da venda: " + valor);
              }else{
                Double porcetagem = Double.parseDouble(JOptionPane.showInputDialog("Informe valor da porcetagem"));
                valor -= valor*(porcetagem/100);
                JOptionPane.showMessageDialog(null, "Valor da venda: " + valor);
            }
          }
          
      });

    }
    
}
