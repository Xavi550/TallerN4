
package Clases;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTiempo { 
    
    public Calendar fecha = new GregorianCalendar();
    
    public String anho = Integer.toString(fecha.get(Calendar.YEAR));
    public String mes = Integer.toString(fecha.get(Calendar.MONTH+1));
    public String dia = Integer.toString(fecha.get(Calendar.DATE));
    
    public String fechacomp = anho+"-"+mes+"-"+dia;
    
    public String hora = Integer.toString(fecha.get(Calendar.HOUR_OF_DAY));
    public String minuto = Integer.toString(fecha.get(Calendar.MINUTE));
    
    public String horacomp = hora+":"+minuto;
    
}
