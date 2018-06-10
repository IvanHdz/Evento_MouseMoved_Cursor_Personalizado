/**
 *
 * @author Jesus Ivan
 */
import java.awt.Color;
import java.awt.Graphics;

public class Cuadrado {
    private int x1;
    private int y1;
    private int lado;

    public void cambiarPosicion(int x1, int y1){
        this.x1 = x1;
        this.y1 = y1;        
    }
    
    public void cambiarTamaño(int lado){
        this.lado = lado;
    }
    
    public void dibujar(Graphics g){
        //Se pinta un cuadrado de Color Blanco del tamaño de Toda la Pantalla
        //en dado caso que el usuario de click. y volver a pintar el cuadrado
        //azul.
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 500, 500);
        
        g.setColor(Color.BLUE);
        g.fillRect(x1, y1, lado, lado);
    }
}