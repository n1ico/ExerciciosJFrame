
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
public class CalcularBhaskara extends JFrame {
     JLabel titulo, formula, a, b, c, x1, x2;
     JTextField valorA, valorB, valorC;
     JButton calcular, limpar;
  public CalcularBhaskara(){

     super ("Calcular Bhaskara ");
     Container tela = getContentPane();
     setLayout(null);
       
    titulo = new JLabel("Fórmula de Bhaskara:");    
    formula = new JLabel("ax² + bx + c = 0");
    a = new JLabel("Valor de A:");
    b = new JLabel("Valor de B:");    
    c = new JLabel("Valor de C:");


    
    valorA = new JTextField (5);
    valorB = new JTextField (5);
    valorC = new JTextField (5);

   
    calcular = new JButton ("calcular");
    limpar = new JButton("limpar");  
    
    titulo.setBounds(77, 10, 200, 20);    
    a.setBounds(75, 75, 100, 10);
    b.setBounds(75, 100, 100, 10);
    c.setBounds(75, 125, 100, 20);    
    formula.setBounds(100,40, 200, 20);
    
    
    valorA.setBounds(150, 75, 50, 20);
    valorB.setBounds(150, 100, 50, 20);
    valorC.setBounds(150, 125, 50, 20);



    calcular.setBounds(65, 180, 80, 20);
    limpar.setBounds(150,180,80,20);
    
    
    
     calcular.addActionListener(
            
        new ActionListener(){
            
         public void actionPerformed(ActionEvent e){
        DecimalFormat df = new DecimalFormat("0.00");
             
         int num1, num2, num3;
         double delta, xum, xdois;
        
         num1 = Integer.parseInt(valorA.getText());
         num2 = Integer.parseInt(valorB.getText());
         num3 = Integer.parseInt(valorC.getText()); 

         
         delta = (num2*num2)+(-4*(num1*num3));
         
        
         if (delta>0){

             xum = (-num2 + Math.sqrt(delta))/2*num1;
             xdois = (-num2 - Math.sqrt(delta))/2*num1;
             JOptionPane.showMessageDialog(null, "Esta equação possui duas raízes, sendo x1  =  "+df.format(xum)+" e  x2  = "+df.format(xdois));
         }
         
         else if (delta == 0){
            xum = (-(num2) + Math.sqrt(delta))/2*num1;
            JOptionPane.showMessageDialog(null, "Esta equação só possui uma raiz, sendo  x1  =  "+df.format(xum));
         }
         else if (delta < 0){
            JOptionPane.showMessageDialog(null, "O delta é igual a 0, logo está equação não possui raiz.");
         }  
         else{
         JOptionPane.showMessageDialog(null, "A informação inserida é inválida");
         }
             
            
     }});
     
     
       limpar.addActionListener(
            
        new ActionListener(){
            
         public void actionPerformed(ActionEvent e){
             String valor1 = "0";
             
          valorA.setText(valor1);
          valorB.setText(valor1);
          valorC.setText(valor1);
         }});
    
       
       
       tela.add(titulo);
       tela.add(valorA);
       tela.add(valorB);
       tela.add(valorC);
       tela.add(formula);
       tela.add(a);
       tela.add(b);
       tela.add(c);
       tela.add(limpar);
       tela.add(calcular);
       
       setSize(300, 320);
       setVisible(true);
       setLocationRelativeTo(null);

}
   public static void main(String[] args) {
        CalcularBhaskara app = new CalcularBhaskara();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}    

