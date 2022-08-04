package clubsocial;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;

public class Persona {
    private String Dia,Mes,Año,Nombre;
    private int Genero,edad;
    Persona(){
    }
    Persona(String Dia,String Mes,String Año, String Nombre, int Genero){
        this.Dia=Dia;
        this.Mes=Mes;
        this.Año=Año;
        this.Nombre=Nombre;
        this.Genero=Genero;
    }
    public void setGenero(int Genero){
        this.Genero=Genero;
    }
    public void setFecha(String Dia, String Mes, String Año){
        this.Año=Año;
        this.Dia=Dia;
        this.Mes=Mes;
    }
    public LocalDate Fecha(){
    if(Dia.length()<2)Dia="0"+Dia;if(Mes.length()<2)Mes="0"+Mes;
    LocalDate FechaA = LocalDate.parse(Año+"-"+Mes+"-"+Dia);
    return FechaA;
    }
    public LocalDate FechaActual(){
        Calendar FechaB = Calendar.getInstance();
        String d=Integer.toString(FechaB.get(Calendar.DATE));if(d.length()<2)d="0"+d;
        String m = Integer.toString(FechaB.get(Calendar.MONTH));if(m.length()<2)m="0"+m;
        String a = Integer.toString(FechaB.get(Calendar.YEAR));
        LocalDate FechaC= LocalDate.parse(a+"-"+m+"-"+d);
        return FechaC;
    }
    public String getEdad(){
        try{Period Edad = Period.between(Fecha(), FechaActual());
        edad=Edad.getYears();
        return "Edad= "+edad;}
        catch(Exception e){
            return "Usted ingreso una fecha erronea";
        }
    }
    public int getedad(){
        return edad;
    }
    public String Genero(){
        if(Genero==1)return "Masculino";
        if(Genero==2)return "Femenino";
        else return "Ingrese una opcion valida";
    }
    public String Persona(){
        return "Nombre= "+Nombre+", Genero= "+Genero()+", Fecha de nacimiento= "+Fecha()+", "+getEdad();
    }
}
