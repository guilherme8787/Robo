/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robo;
import javax.swing.JOptionPane;
/**
 *
 * @author Orion
 */
public class Robo {    
        
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

    public double operacional(double n1, double n2, String operador) throws Exception{
        double result = 0;
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
        return result;
    }
}
