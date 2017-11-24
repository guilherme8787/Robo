/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Orion
 */
public class Robo {    
    public Icon roboIcon = new ImageIcon("C:\\Users\\Guilherme\\Documents\\GitHub\\Robo\\img\\roboIcon.png");
    private File arquivo = new File("C:\\Users\\Guilherme\\Documents\\GitHub\\Robo\\files\\bateria.txt");
    private String Nome, DataFabricacao;
    private double Bateria;

    public Robo(String Nome, String DataFabricacao, double Bateria) {
        this.Nome = Nome;
        this.DataFabricacao = DataFabricacao;
        try {
            setBateria(Bateria);
            this.Bateria = Bateria;
        } catch (Exception ex) {
            Logger.getLogger(Robo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getNome() {
            return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDataFabricacao() {
            return DataFabricacao;
    }

    public void setDataFabricacao(String DataFabricacao) {
        this.DataFabricacao = DataFabricacao;
    }

    public double getBateria() throws IOException{
        FileReader fr = new FileReader(arquivo);
        BufferedReader br = new BufferedReader(fr);
        double Bateria = Double.parseDouble(br.readLine());
        this.Bateria = Bateria;
        return Bateria;
    }

    public void setBateria(double Bateria) throws IOException, Exception {
        //para adicionar uma novar linha é só colocar (arquivo, true)
            FileWriter fw = new FileWriter(arquivo);
            BufferedWriter bw = new BufferedWriter(fw);
            if(arquivo.exists() == false){
                arquivo.createNewFile();
            }
            bw.write(String.valueOf(Bateria + this.Bateria));  
            bw.flush();  
            bw.close();
            fw.close();
    }

    public void operacional(String operador) throws Exception{
        if (getBateria() == 0){
            throw new Exception("Bateria fraca");
        }
        else 
        {
            double result = 0;
            double n1, n2;
            n1 = Double.parseDouble((String) JOptionPane.showInputDialog(null, "Entre com o valor 1: ", "Insira o valor para o calculo", JOptionPane.QUESTION_MESSAGE, roboIcon, null, null));
            n2 = Double.parseDouble((String) JOptionPane.showInputDialog(null, "Entre com o valor 2: ", "Insira o valor para o calculo", JOptionPane.QUESTION_MESSAGE, roboIcon, null, null));
            switch(operador){
                case "+": result = n1 + n2;
                break;
                case "-": result = n1 - n2;
                break;
                case "*": result = n1 * n2;
                break;
                case "/": result = n1 / n2;
                break;
                default: JOptionPane.showMessageDialog(null, "Omae wa mou shindeiru?");
            }
            JOptionPane.showMessageDialog(null, "O resultado é "+result+"!", "Resultado", JOptionPane.INFORMATION_MESSAGE, roboIcon);
            this.Bateria -= 1;
            setBateria(0);
        }
    }
}