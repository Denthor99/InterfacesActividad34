package org.ieslosremedios.daw1.prog.ut3.interfaces.actividad1;

public class TestImpresiones {
    public static void main(String[] args) {
        // Objetos de la Clase Impresora
        Imprimible print1 = new Impresora();
        print1.imprime();
        Borrable print2 = new Impresora();
        print2.borrar();
        print1.establecerContenido("Esto es un test");

        // Objetos de la Clase Consola
        Imprimible cons1 = new Consola();
        cons1.imprime();
        Borrable cons2 = new Consola();
        cons2.borrar();
        cons1.establecerContenido("Esto es un test");

        // No podemos generar objetos directamente desde una interfaz ya que no se puede instanciar un objeto desde ellas, solo podemos generar campos y metodos para que lo implenten varias clases.
        Imprimible nueve1 = new Imprimible();
    }
}