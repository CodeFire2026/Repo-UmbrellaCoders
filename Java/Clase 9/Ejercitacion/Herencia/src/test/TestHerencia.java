package test;

import domain.*;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Luciano", 68000.0);
        System.out.println("empleado1 = " + empleado1);
        
        Cliente cliente1 = new Cliente("Jose", new Date(), false);
        System.out.println("cliente1 = " + cliente1);
        
        Cliente cliente2 = new Cliente("Matias", new Date(), true);
        System.out.println("cliente2 = " + cliente2);
    }
}
