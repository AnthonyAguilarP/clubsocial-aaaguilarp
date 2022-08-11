package clubsocial;

import java.util.Scanner;

public class Registro {
    Registro(){
    }
    private Scanner sc=new Scanner(System.in);
    private String pNombre,sNombre,pApellido,sApellido,Dia,Mes,Año,Puesto;
    private Double NumMembresia,NumEmpleado;
    private int Genero;
    private Persona b=new Persona();
    private Miembro a=new Miembro();
    private Empleado c=new Empleado();
     public void Persona(){
         System.out.print("Ingrese su Nombre\nPrimer nombre: ");pNombre=sc.next();
         System.out.print("Segundo nombre: ");sNombre=sc.next();
         System.out.print("Primer apellido: ");pApellido=sc.next();
         System.out.print("Segundo apellido: ");sApellido=sc.next();
        while(9!=0){
        System.out.print("El programa espera un año de cuatro digitos\nIngrese su fecha de nacimiento\nDía: ");Dia=sc.next();
        System.out.print("Mes: ");Mes=sc.next();
        System.out.print("Año: ");Año=sc.next();
        b.setFecha(Dia, Mes, Año);
        if("Usted ingreso una fecha erronea".equals(b.getEdad()))System.out.println(b.getEdad());
        else break;}
        while(9!=0){
        System.out.print("Ingrese su Genero según sea la opción\n1.Masculino\n2.Femenino\nGenero: ");Genero=sc.nextInt();
        b.setGenero(Genero);
        if("Ingrese una opcion valida".equals(b.Genero()))System.out.println(b.Genero());
        else break;}
     }
    public void Miembro(){
        System.out.print("Numero de la membresia: ");NumMembresia=sc.nextDouble();
        a=new Miembro(NumMembresia,Dia,Mes,Año,pNombre,sNombre,pApellido,sApellido,Genero);
        a.Membresia();
    }
    public String RegistroMiembro(){
        return a.toString();
    }
    public void Empleado(){
        System.out.print("Ingrese el puesto del empleado\nPuesto del empleado: ");Puesto=sc.next();
        System.out.print("Ingrese el numero del empleado: ");NumEmpleado=sc.nextDouble();
        c=new Empleado(Dia,Mes,Año,pNombre,sNombre,pApellido,sApellido,Genero,NumEmpleado,Puesto);
        c.FechaIngreso();
    }
    public String RegistroEmpleado(){
        return c.toString();
    }
}
