import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
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
public class Triangulos extends JFrame {
     JLabel titulo, lado1, lado2, lado3, triangulo;
     JTextField l1, l2, l3;
     JButton verificar, limpar;
     
  public Triangulos(){

     super ("Triângulos");
     Container tela = getContentPane();
     setLayout(null);
       
    titulo = new JLabel("Verificar tipos de Triângulos:");    
    lado1 = new JLabel("Lado 1:");
    lado2 = new JLabel("Lado 2:");    
    lado3 = new JLabel("Lado 3:");
    triangulo = new JLabel (" ");
    
    l1 = new JTextField (5);
    l2 = new JTextField (5);
    l3 = new JTextField (5);

    
    verificar = new JButton ("verificar");
    limpar = new JButton("limpar");  
    
    titulo.setBounds(77, 10, 200, 20);    
    lado1.setBounds(75, 75, 100, 10);
    lado2.setBounds(75, 100, 100, 10);
    lado3.setBounds(75, 125, 100, 20); 
    triangulo.setBounds( 320, 110, 200, 20);
    
    
    l1.setBounds(150, 75, 50, 20);
    l2.setBounds(150, 100, 50, 20);
    l3.setBounds(150, 125, 50, 20);



    verificar.setBounds(65, 180, 100, 20);
    limpar.setBounds(180,180,80,20);
    
    
    
     verificar.addActionListener(
            
        new ActionListener(){
            
         public void actionPerformed(ActionEvent e){
        DecimalFormat df = new DecimalFormat("0.00");
             
         int num1, num2, num3;
        
         num1 = Integer.parseInt(l1.getText());
         num2 = Integer.parseInt(l2.getText());
         num3 = Integer.parseInt(l3.getText()); 
         
         if (num1!=num2 && num2!=num3 &&  num3 != num1){
             triangulo.setVisible(true);
             triangulo.setText("O triângulo é equilátero.");
         }       
         else if (num1 == num2 && num1==num3 && num2==num3){
             triangulo.setVisible(true);
             triangulo.setText("O triângulo é escaleno. ");
         }  
        else if ( num1 == num2 &&  num3 != num1 ){
            triangulo.setVisible(true);
            triangulo.setText("O triângulo é isósceles.");
                 }
        else if ( num1 == num3 &&  num2 != num1 ){
            triangulo.setVisible(true);
            triangulo.setText("O triângulo é isóceles.");
                 }
        else if ( num3 == num2 &&  num3 != num1 ){
            triangulo.setVisible(true);
            triangulo.setText("O triângulo é isóceles.");
                 }
     }});
     
     
       limpar.addActionListener(
            
        new ActionListener(){
            
         public void actionPerformed(ActionEvent e){
             String valor1 = "0";
             
          l1.setText(valor1);
          l2.setText(valor1);
          l3.setText(valor1);
          triangulo.setVisible(false);
    
         }});
    
       

       tela.add(titulo); 
       tela.add (lado1);
       tela.add(lado2);
       tela.add(lado3);
       tela.add(triangulo);
       tela.add(l1);
       tela.add(l2);
       tela.add(l3);
       tela.add(verificar);
       tela.add(limpar);
               
       setSize(550, 320);
       setVisible(true);
       setLocationRelativeTo(null);

}
   public static void main(String[] args) {
      Triangulos app = new Triangulos();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}    


