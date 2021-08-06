package ui;

import java.util.ArrayList;

public class MetodosTokens {

    ArrayList<String> cadenas = new ArrayList<>();

    public ArrayList<String> separarToken(String texto) {

        String aux = "";
        boolean splt = false, fin = false;
        int contador = 0;

        do {

            do {

                if (texto.charAt(contador) != ' ') {
                    aux += texto.charAt(contador);
                    contador++;

                } else {
                    splt = true;

                }

            } while (splt==true);
            
            cadenas.add(aux);
            
            if (contador == texto.length()) {
                fin = true;
            } 
            
        } while (fin==true);
        
        return cadenas;

    }

}
