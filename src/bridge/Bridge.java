/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bridge;


/**
 *
 * @author yusgu
 */
public class Bridge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Forma cuadradoRojo = new Cuadrado(new Rojo());
        Forma circuloVerde = new Circulo(new Verde());

        cuadradoRojo.dibujar(); // Dibujando un cuadrado. Aplicando color rojo
        circuloVerde.dibujar(); // Dibujando un círculo. Aplicando color verde
        
    }
    
}
