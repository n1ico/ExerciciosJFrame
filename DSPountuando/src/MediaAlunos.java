/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
/**
 *
 * @author nico
 */

public class MediaAlunos extends JFrame {
    
//
    JLabel titulo, subt, n1, n2, n3, n4, maior, menor, media;
    JTextField nota1, nota2, nota3, nota4;
    JButton limpar, sair, calcular;
    

public MediaAlunos(){
    super("Média dos Alunos");
    Container tela = getContentPane();
    setLayout(null);
       
    titulo = new JLabel("Média dos Alunos");    
    subt = new JLabel("Digite as notas do:");
    n1 = new JLabel("1° Bimestre:");
    n2 = new JLabel("2° Bimestre:");    
    n3 = new JLabel("3° Bimestre:");
    n4 = new JLabel("4° Bimestre:");
    maior = new JLabel("A maior nota é:");
    menor = new JLabel("e a menor nota é:");
    media = new JLabel("e sua média é:");
    
    nota1 = new JTextField (5);
    nota2 = new JTextField (5);
    nota3 = new JTextField (5);
    nota4 = new JTextField (5);
        
    limpar = new JButton ("limpar");
    sair = new JButton ("sair");
    calcular = new JButton ("calcular");
      
    titulo.setBounds(140, 10, 200, 20);    
    subt.setBounds(90, 50, 300, 20);
    n1.setBounds(50, 80, 100, 20);
    n2.setBounds(50, 99, 100, 20);    
    n3.setBounds(50, 118, 100, 20);
    n4.setBounds(50, 137, 100, 20);
    maior.setBounds(50, 170, 200, 20);
    menor.setBounds(50, 190, 200, 20);
    media.setBounds(50, 210, 200, 20);

    nota1.setBounds(150, 80, 100, 20);
    nota2.setBounds(150, 99, 100, 20);
    nota3.setBounds(150, 118, 100, 20);
    nota4.setBounds(150, 137, 100, 20);

    limpar.setBounds(40, 310, 80, 20);
    sair.setBounds(150, 310, 80, 20);
    calcular.setBounds(260, 310, 80, 20);
    
    
     calcular.addActionListener(
            
        new ActionListener(){
            
         public void actionPerformed(ActionEvent e){
             
         int num1, num2,num3, num4, Media;
         
         Media=0;
         num1 = Integer.parseInt(nota1.getText());
         num2 = Integer.parseInt(nota2.getText());
         num3 = Integer.parseInt(nota3.getText()); 
         num4 = Integer.parseInt(nota4.getText());
         
         Media = (num1+num2+num3+num4)/4;
         
         media.setVisible(true);
         media.setText("A sua média é: "+Media); 
         
         
         
         if (num1>num2 && num1>num3 && num1>num4){
             maior.setVisible(true);
             maior.setText("A maior nota é: "+num1);
         }
         
         else if (num2>num1 && num2>num3 && num2>num4){
             maior.setVisible(true);
             maior.setText("A maior nota é: "+num2);
         }
         else if (num3>num2 && num3>num2 && num3>num4){
             maior.setVisible(true);
             maior.setText("A maior nota é: "+num3);
         }
         else{
         maior.setVisible(true);
             maior.setText("A maior nota é: "+num4);
         }         
         
         
         
         if (num1<num2 && num1<num3 && num1<num4){
             menor.setVisible(true);
             menor.setText("A menor nota é: "+num1);
         }
         
         else if (num2<num1 && num2<num3 && num2<num4){
             menor.setVisible(true);
             menor.setText("A menor nota é: "+num2);
         }
         else if (num3<num2 && num3<num2 && num3<num4){
             menor.setVisible(true);
             menor.setText("A menor nota é: "+num3);
         }
         else{
           menor.setVisible(true);
           menor.setText("A menor nota é: "+num4);
       } 
     }
   }
  );
       limpar.addActionListener(
            
        new ActionListener(){
            
         public void actionPerformed(ActionEvent e){
             String valor1 = "0";
             
          nota1.setText(valor1);
          nota2.setText(valor1);
          nota3.setText(valor1);
          nota4.setText(valor1);
          menor.setVisible(false);
          maior.setVisible(false);
          media.setVisible(false);
         }});
      
       sair.addActionListener(
            
        new ActionListener(){
            
         public void actionPerformed(ActionEvent e){
         
         System.exit(0);
         
         }});

       tela.add(titulo);       
       tela.add(n1);
       tela.add(n2);
       tela.add(n3);
       tela.add(n4);
       tela.add(maior);
       tela.add(menor);
       tela.add(media);
       tela.add(subt);
       tela.add(nota1);
       tela.add(nota2);
       tela.add(nota3);
       tela.add(nota4);
       tela.add(limpar);
       tela.add(sair);
       tela.add(calcular);
       
       setSize(400, 420);
       setVisible(true);
       setLocationRelativeTo(null);

}
   public static void main(String[] args) {
        MediaAlunos app = new MediaAlunos();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}    


