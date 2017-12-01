/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Guilherme
 */

public class Bateria{
    private File arquivo = new File("C:\\Users\\Guilherme\\Documents\\GitHub\\Robo\\files\\bateria.txt");
    double Bateria;
    private Robo robo;

    public Bateria(double Bateria) throws Exception{
        FileWriter fw = new FileWriter(arquivo);
        BufferedWriter bw = new BufferedWriter(fw);
        if(arquivo.exists() == false){
            arquivo.createNewFile();
        }
        bw.write(String.valueOf(Bateria));  
        bw.flush();  
        bw.close();
        fw.close();
        this.Bateria = Bateria;
    }
    
    public double getBateria() throws IOException{
        FileReader fr = new FileReader(arquivo);
        BufferedReader br = new BufferedReader(fr);
        double Bateria = Double.parseDouble(br.readLine());
        br.close();
        fr.close();
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
}