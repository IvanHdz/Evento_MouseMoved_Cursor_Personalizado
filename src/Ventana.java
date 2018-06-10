/**
 *
 * @author Jesus Ivan
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;

public class Ventana extends JFrame {
    private final Cuadrado miCuadrado;
    
   public Ventana(){
        super("Viruz Blog: Cuadrado en Cursor :");
        setSize(500, 500);
        setBackground(Color.WHITE);
        addEventos();
        
        miCuadrado = new Cuadrado();
        setVisible(true);
    }
   
    @Override
     public void paint(Graphics g){
        miCuadrado.dibujar(g);
    }
    
     private void addEventos(){
         addMouseMotionListener(new MouseMotionAdapter(){
      //mouseMoved maneja el evento cuando el puntero del ratón esta en Movimiento.
            @Override
           public void mouseMoved(MouseEvent e){
            miCuadrado.cambiarPosicion(e.getX(), e.getY());
            miCuadrado.cambiarTamaño(70);
            repaint();
        }
     });
    }
}