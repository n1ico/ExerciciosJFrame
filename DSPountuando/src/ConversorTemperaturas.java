import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/** 
 *
 * @author Nico
 */
public class ConversorTemperaturas extends JFrame {
     JLabel titulo, c;
     JTextField valorC;
     JButton converter, limpar;
  public ConversorTemperaturas(){

     super ("Conversor de Temperaturas ");
     Container tela = getContentPane();
     setLayout(null);
       
    titulo = new JLabel("Conversor de Temperaturas:");    
    c = new JLabel("Temperatura em celsius:");

    valorC = new JTextField (5);

   
    converter = new JButton ("converter");
    limpar = new JButton("limpar");  
    
    titulo.setBounds(67, 60, 200, 20);    
    c.setBounds(35, 125, 200, 20);    
    valorC.setBounds(190, 125, 75, 20);
    converter.setBounds(55, 180, 100, 20);
    limpar.setBounds(165,180,80,20);
    
    
    
    converter.addActionListener(
            
        new ActionListener(){
            
         public void actionPerformed(ActionEvent e){
        DecimalFormat df = new DecimalFormat("0.00");
             
         double numc, f, k;
         f = 0;
         k = 0;
         numc = Integer.parseInt(valorC.getText()); 
         
         f = ((numc*1.8)+32);
         k = (numc+ 273.15);
       
         JOptionPane.showMessageDialog(null, numc+" ºC em Fahrenheit é : "+f+" ºF e em Kelvin é : "+k+" ºK");
            
     }});
     
     
       limpar.addActionListener(
            
        new ActionListener(){
            
            
            
         public void actionPerformed(ActionEvent e){
             String valor1 = "0";
             valorC.setText(valor1);
         }});
    
       
       
       tela.add(titulo);
       tela.add(valorC);
       tela.add(c);
       tela.add(limpar);
       tela.add(converter);
       
       setSize(320, 300);
       setVisible(true);
       setLocationRelativeTo(null);

}
   public static void main(String[] args) {
        ConversorTemperaturas app = new ConversorTemperaturas();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}    

