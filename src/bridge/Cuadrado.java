/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge;

/**
 *
 * @author yusgu
 */
public class Cuadrado extends Forma {
    public Cuadrado(Color color) {
        super(color);
    }

    @Override
    public void dibujar() {
        System.out.print("Dibujando un cuadrado. ");
    color.aplicarColor();
    }
}

