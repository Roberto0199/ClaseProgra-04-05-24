package org.example;

import colas.ColaLineal;

public class Main {

    public static void main(String[] args) {
        ColaLineal cl= new ColaLineal();

        try {
           /* for (int i = 0; i<100; i++){
                cl.insertar(i);
            }*/
            cl.insertar("Carlos");
            cl.insertar(3);
            cl.insertar("Andrea");
            cl.insertar(3.5);
            System.out.println("Primer elemento="+cl.frenteCola());

            while (!cl.colaVacia()){
                System.out.println("Elemento quitado:"+cl.quitar());
            }

        }catch (Exception ex){
            System.out.println("error:"+ex.getMessage());
        }

    }
}