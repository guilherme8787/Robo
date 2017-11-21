/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robo;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
    
/**
 *
 * @author Orion
 */
public class Robo {    
    public Icon roboIcon = new ImageIcon("C:\\Users\\Orion\\Documents\\GitHub\\Robo\\img\\roboIcon.png");
    private String Nome, DataFabricacao;
    private double Bateria;

    public Robo(String Nome, String DataFabricacao, double Bateria) {
        this.Nome = Nome;
        this.DataFabricacao = DataFabricacao;
        this.Bateria = Bateria;
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

    public double getBateria() {
            return Bateria;
    }

    public void setBateria(double Bateria) {
            this.Bateria = Bateria;
    }

    public void operacional(String operador) throws Exception{
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
            default:
                JOptionPane.showMessageDialog(null, "Omae wa mou shindeiru?");
        }
        JOptionPane.showMessageDialog(null, "O resultado é "+result+"!", "Resultado", JOptionPane.INFORMATION_MESSAGE, roboIcon);
    }
}
