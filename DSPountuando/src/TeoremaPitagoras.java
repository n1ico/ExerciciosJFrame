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
public class TeoremaPitagoras extends JFrame {
     JLabel titulo,a, b, h;
     JTextField a1, b1;
     JButton calcular, limpar;
  public TeoremaPitagoras(){

     super ("Teorema de Pitagoras");
     Container tela = getContentPane();
     setLayout(null);
       
    titulo = new JLabel("Teorema de Pitagoras:");    
    a = new JLabel("Valor de a:");
    b = new JLabel("Valor de b:");    
    h = new JLabel (" ");
    
    a1 = new JTextField (5);
    b1 = new JTextField (5);

   
    calcular = new JButton ("Calcular");
    limpar = new JButton("Limpar");  
    
    titulo.setBounds(77, 10, 200, 20);    
    a.setBounds(75, 75, 100, 10);
    b.setBounds(75, 100, 100, 10);
    h.setBounds( 75, 130, 200, 20);

    
    a1.setBounds(150, 75, 50, 20);
    b1.setBounds(150, 100, 50, 20);

    calcular.setBounds(65, 180, 100, 20);
    limpar.setBounds(180,180,80,20);
    
    
    
     calcular.addActionListener(
            
        new ActionListener(){
            
         public void actionPerformed(ActionEvent e){
        DecimalFormat df = new DecimalFormat("0.00");
             
         double num1, num2, hipo;
        

         num1 = Double.parseDouble(a1.getText());
         num2 = Double.parseDouble(b1.getText());
         hipo = Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2));
          
         h.setText("A hipotenusa é : "+df.format(hipo));
      }});
     
     
       limpar.addActionListener(
            
        new ActionListener(){
            
         public void actionPerformed(ActionEvent e){
             String valor1 = "0";
             
          a1.setText(valor1);
          b1.setText(valor1);
          h.setVisible(false);
    
         }});
    
       

       tela.add(titulo); 
       tela.add(a);
       tela.add(b);
       tela.add(h);
       tela.add(b1);
       tela.add(a1);
       tela.add(calcular);
       tela.add(limpar);
               
       setSize(350, 320);
       setVisible(true);
       setLocationRelativeTo(null);

}
   public static void main(String[] args) {
      TeoremaPitagoras app = new TeoremaPitagoras();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}    
