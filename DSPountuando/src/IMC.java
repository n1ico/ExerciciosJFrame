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
public class IMC extends JFrame {
     JLabel titulo, peso, altura, resultado;
     JTextField ps, alt;
     JButton verificar, limpar;
  public IMC(){

     super ("Calculo do IMC");
     Container tela = getContentPane();
     setLayout(null);
       
    titulo = new JLabel("Verificar IMC:");    
    altura = new JLabel("Informe sua altura:");
    peso = new JLabel("Informe o seu peso:");    
    resultado = new JLabel (" ");
    
    ps = new JTextField (5);
    alt = new JTextField (5);

   
    verificar = new JButton ("verificar");
    limpar = new JButton("limpar");  
    
    titulo.setBounds(115, 10, 200, 30);    
    altura.setBounds(60, 75, 200, 30);
    peso.setBounds(60, 100, 200, 30);
    resultado.setBounds(85, 125, 200, 30); 
    
    ps.setBounds(180, 75, 80, 20);
    alt.setBounds(180, 100, 80, 20);

    verificar.setBounds(65, 180, 100, 20);
    limpar.setBounds(180,180,80,20);
    
    
    
     verificar.addActionListener(
            
        new ActionListener(){
            
         public void actionPerformed(ActionEvent e){

         double a, p, imc;
        imc = 0 ;
         a = Integer.parseInt(alt.getText());
         p = Integer.parseInt(ps.getText());
         
         imc = (a*a)/p;

        if ( imc<18 ){
            resultado.setVisible(true);
            resultado.setText("Você está abaixo do peso.");
                 }
        else if(imc>= 18.5 && imc<=24.99){
            resultado.setVisible(true);
            resultado.setText("Você está no peso ideal.");
        }
        else {
            resultado.setVisible(true);
            resultado.setText("Você está acima do peso ideal.");
        }
     }});
     
     
       limpar.addActionListener(
            
        new ActionListener(){
            
         public void actionPerformed(ActionEvent e){
             String valor1 = "0";
             
          ps.setText(valor1);
          alt.setText(valor1);
          resultado.setVisible(false);
    
         }});
    
       

       tela.add(titulo); 
       tela.add (altura);
       tela.add(peso);
       tela.add(resultado);
       tela.add(alt);
       tela.add(ps);
       tela.add(verificar);
       tela.add(limpar);
               
       setSize(350, 320);
       setVisible(true);
       setLocationRelativeTo(null);

}
   public static void main(String[] args) {
      IMC app = new IMC();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}    
