/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculoimc_actividad1_anamireles;

import javax.swing.JOptionPane;

/**
 *
 * @author anaca
 */
public class Persona {
    
    private float peso;
    private float estatura;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }
    
    public float calculcarimc(){
        float imc = getPeso()/(getEstatura()*getEstatura());
        
        if (imc < 18.5){
            JOptionPane.showMessageDialog(null, "Bajo Peso");
        } else if (imc >= 18.5 && imc <= 24.9){
            JOptionPane.showMessageDialog(null, "Peso Normal");
        } else if (imc >= 25 && imc <= 29.9){
            JOptionPane.showMessageDialog(null, "Sobrepeso");
        } else if (imc >= 30 && imc <= 34.9){
            JOptionPane.showMessageDialog(null, "Obesidad I");
        } else if (imc >= 35 && imc <= 39){
            JOptionPane.showMessageDialog(null, "Obesidad II");
        } else{
            JOptionPane.showMessageDialog(null, "Obesidad III");
        }
        return imc;
    }
}
