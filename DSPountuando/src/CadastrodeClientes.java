/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
/**
 *
 * @author dti
 */
public class CadastrodeClientes  extends JFrame {
    JLabel titulo, idcliente, nomec, endereco, bairro,cidade, estado, cep, celular, telefone, dataA, dataC;
    JComboBox est;  
    JTextField id, nc, end, br, cid;
    JButton incluir, sair, limpar;
    JFormattedTextField Cep, cel, tel, da, dc;
    MaskFormatter mascaraCep, mascaraTel, mascaraCel, mascaraDataA, mascaraDataC;
    ImageIcon lixo, add, sai;

public CadastrodeClientes (){
    super("Cadastro de Clientes ");
    Container tela = getContentPane();
    setLayout(null);
       
    titulo = new JLabel("Cadastro de Clintes:");
    idcliente = new JLabel("Código do Cliente");    
    nomec = new JLabel("Nome do Cliente:");
    endereco = new JLabel("Endereço:");
    bairro = new JLabel("Bairro:"); 
    cidade = new JLabel("Cidade:");
    estado = new JLabel("Estado:");
    cep = new JLabel("CEP:");
    celular = new JLabel("Celular:");
    telefone = new JLabel("Telefone:");
    dataA = new JLabel("Data de Aniversário:");
    dataC = new JLabel("Data de Cadastro:");
    
    try{
        mascaraCep = new MaskFormatter("#####-###");
        mascaraTel = new MaskFormatter("(##)####-####");
        mascaraCel = new MaskFormatter("(##)#####-####");
        mascaraDataA = new MaskFormatter("##/##/####");
        mascaraDataC = new MaskFormatter("##/##/####");
       
        mascaraCep.setPlaceholderCharacter('_');
        mascaraTel.setPlaceholderCharacter('_');
        mascaraCel.setPlaceholderCharacter('_');
        mascaraDataA.setPlaceholderCharacter('_');
        mascaraDataA.setPlaceholderCharacter('_');
    }
    catch(ParseException excp){}
   
    
    id = new JTextField (5);
    nc = new JTextField (5);
    end = new JTextField (5);
    br = new JTextField (5);
    cid = new JTextField(5);
    
    Cep = new JFormattedTextField (mascaraCep);
    cel = new JFormattedTextField (mascaraCel);
    tel = new JFormattedTextField (mascaraTel);
    da = new JFormattedTextField (mascaraDataA);
    dc = new JFormattedTextField (mascaraDataA); 
    
    lixo = new ImageIcon("lixo.png");
    add = new ImageIcon("incluir.png");
    sai = new ImageIcon("sair.png");
    
    est = new JComboBox();
    est.addItem(" ");
    est.addItem("AC");
    est.addItem("AL");
    est.addItem("AP");
    est.addItem("AM");
    est.addItem("BA");
    est.addItem("CE");
    est.addItem("DF");
    est.addItem("ES");
    est.addItem("GO");
    est.addItem("MA");
    est.addItem("MT");
    est.addItem("MS");
    est.addItem("MG");
    est.addItem("PA");
    est.addItem("PB");
    est.addItem("PR");
    est.addItem("PE");
    est.addItem("PI");
    est.addItem("RJ");
    est.addItem("RN");
    est.addItem("RS");
    est.addItem("RO");
    est.addItem("RR");
    est.addItem("SC");
    est.addItem("SP");
    est.addItem("SE");
    est.addItem("TO");
 
    
    limpar = new JButton ("limpar", lixo);
    sair = new JButton ("sair", sai);
    incluir = new JButton ("incluir", add);
      
    titulo.setBounds(133, 10, 200, 20);
    idcliente.setBounds(50, 44, 200, 20);    
     nomec.setBounds(50, 69, 300, 20);
    endereco.setBounds(50, 94, 100, 20);
    bairro.setBounds(50, 119, 100, 20);  
    cidade.setBounds(50, 144, 100, 20);
    estado.setBounds(50, 169, 100, 20);
    cep.setBounds(50, 194, 100, 20);
    celular.setBounds(50, 219, 200, 20);
    telefone.setBounds(50, 244, 200, 20);
    dataA.setBounds(50, 269, 200, 20);
    dataC.setBounds(50, 294, 200, 20);

    id.setBounds(200, 44, 100, 20);
    nc.setBounds(200, 69, 100, 20);
    end.setBounds(200, 94, 100, 20);
    br.setBounds(200, 119, 100, 20);
    cid.setBounds(200, 144, 100, 20);
    est.setBounds(200, 169, 100, 20);
    Cep.setBounds(200, 194, 100, 20);
    cel.setBounds(200, 219, 100, 20);
    tel.setBounds(200, 244, 100, 20);
    da.setBounds(200, 269, 100, 20);
    dc.setBounds(200, 294, 100, 20);

    limpar.setBounds(40, 330, 100, 20);
    sair.setBounds(150, 330, 100, 20);
    incluir.setBounds(260, 330, 100, 20);
    
    
     incluir.addActionListener(
            
        new ActionListener(){
            
         public void actionPerformed(ActionEvent e){
             String a, b, c, f, x, y, g, h, i, j, k, l;   
               a =(id.getText());
               b =(nc.getText());
               c =(end.getText());
               f =(br.getText());
               x = (cid.getText());
               g =(Cep.getText());
               h =(cel.getText());
               i =(tel.getText());
               j =(da.getText());
               k =(dc.getText());
               l =(String) est.getSelectedItem();
              
              JOptionPane.showMessageDialog(null, "Código do cliente: "+a
                      +"\n Nome do cliente: "+b
                      +"\n Endereço: "+c
                      +"\n Bairro: "+f
                      +"\n Cidade: "+x
                      +"\n Estado: "+l
                      +"\n CEP: "+g
                      +"\n Celular"+h
                      +"\n Telefone"+i
                      +"\n Data de Aniversário:"+j
                      +"\n Data de Cadastro:"+k);

     }
   }
  );
       limpar.addActionListener(
            
        new ActionListener(){
            
         public void actionPerformed(ActionEvent e){
             String valor1 = " ";
              br.setText(valor1);
              id.setText(valor1);
              nc.setText(valor1);
              end.setText(valor1);
              cid.setText(valor1);
              Cep.setText(null);
              cel.setText(null);
              tel.setText(null);
              da.setText(null);
              dc.setText(null);
              est.setSelectedItem(" ");
              
         }});
      
       sair.addActionListener(
            
        new ActionListener(){
            
         public void actionPerformed(ActionEvent e){
         
         System.exit(0);
         
         }});
   

       tela.add(titulo);
       tela.add(idcliente);
       tela.add(nomec);
       tela.add(endereco);
       tela.add(bairro);
       tela.add(estado);
       tela.add(cep);
       tela.add(celular);
       tela.add(telefone);
       tela.add(dataA);
       tela.add(dataC);
       tela.add(cidade);
       tela.add(cid);
       tela.add(id);
       tela.add(nc);
       tela.add(end);
       tela.add(est);
       tela.add(br);
       tela.add(Cep);
       tela.add(cel);
       tela.add(tel);
       tela.add(da);
       tela.add(dc);
       
       tela.add(limpar);
       tela.add(sair);
       tela.add(incluir);
       
       setSize(400, 420);
       setVisible(true);
       setLocationRelativeTo(null);

}
   public static void main(String[] args) {
        CadastrodeClientes app = new CadastrodeClientes();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}    
