/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ucb.estudo.formas;

/**
 *
 * @author Vinixai
 */
public class App {

    public static void main(String[] args) {
        
        Retangulo ret = new Retangulo(5,3);
        Circulo circ = new Circulo(5);
        
        System.out.println(" A area do retangulo eh: " + ret.calcularArea());
        System.out.println(" O perimetro do retangulo eh: " + ret.calcularPerimetro());
        
        System.out.println(" A area do circulo eh: " + circ.calcularArea());
        System.out.println(" O perimetro do circulo eh: " + circ.calcularPerimetro());
        
    }
}
