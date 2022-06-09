package observer;
import java.io.File;
import java.io.FileWriter;
import java.util.Calendar;


public aspect Logger {
	
	File file = new File("Registro.txt");
	Calendar cal = Calendar.getInstance();
	
	pointcut successRojo() : call(void com.observer.Ventana.ChangeColorRed(..));
    after() : successRojo() {
    	cal=Calendar.getInstance();
    	try {
            FileWriter escribir = new FileWriter(file, true);
            for (int i = 0; i < 2; i++) {
                escribir.write("\r\n"); 
            }
            escribir.write("Cambio a color Rojo ");
            escribir.write(Integer.toString(cal.get(Calendar.HOUR_OF_DAY))+":"+Integer.toString(cal.get(Calendar.MINUTE)));
            escribir.close();
        } 
        catch (Exception e) {
            System.out.println("Error al escribir");
        }
    	}
    
    pointcut successAmarillo() : call(void com.observer.Ventana.ChangeColorYellow(..));
    after() : successAmarillo() {
    	cal=Calendar.getInstance();
    	try {
            FileWriter escribir = new FileWriter(file, true);
            for (int i = 0; i < 2; i++) {
                escribir.write("\r\n"); 
            }
            escribir.write("Cambio a color Amarillo ");
            escribir.write(Integer.toString(cal.get(Calendar.HOUR_OF_DAY))+":"+Integer.toString(cal.get(Calendar.MINUTE)));
            escribir.close();
        } 
        catch (Exception e) {
            System.out.println("Error al escribir");
        }  	
    }
    
    pointcut successAzul() : call(void com.observer.Ventana.ChangeColorBlue(..));
    after() : successAzul() {
    	cal=Calendar.getInstance();
    	try {
            FileWriter escribir = new FileWriter(file, true);
            for (int i = 0; i < 2; i++) {
                escribir.write("\r\n"); 
            }
            escribir.write("Cambio a color Azul ");
            escribir.write(Integer.toString(cal.get(Calendar.HOUR_OF_DAY))+":"+Integer.toString(cal.get(Calendar.MINUTE)));
            escribir.close();
        } 
        catch (Exception e) {
            System.out.println("Error al escribir");
        } 	
    }

}
