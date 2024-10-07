import javax.swing.JOptionPane;

public class notasestructuradas {
    public static void main(String[] args) throws Exception {
        for(int est = 1; est <=2; est++){
        String nombre = JOptionPane.showInputDialog(null,"ingrese el nombre del estudiante");
        float nota1 = Float.parseFloat(JOptionPane.showInputDialog(null,"ingrese la nota 1"));
        float nota2 = Float.parseFloat(JOptionPane.showInputDialog(null,"ingrese la nota 2"));
        float notafinal = (nota1 + nota2) / 2;
        JOptionPane.showConfirmDialog(null,"informacion del estudiante\nNombre: " + nombre + " nota final:" + notafinal);
        if (notafinal <=3) {
            JOptionPane.showInputDialog(null," el estudiante reprobo el curso");
        }
            else {
                JOptionPane.showInputDialog(null," El estudiante aprobo el curso");

            }
            
        }
        }
    }
