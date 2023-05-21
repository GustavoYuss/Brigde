/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge;

/**
 *
 * @author yusgu
 */
public abstract class Forma {
    protected Color color;

    public Forma(Color color) {
        this.color = color;
    }

    public abstract void dibujar();
}
