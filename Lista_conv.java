
package lista_convidados;

import java.util.ArrayList;
import java.util.List;


public class Lista_conv {

   
    public static void main(String[] args) {
        List<String> Convidados = new ArrayList<>();
        Convidados.add("1");
        Convidados.add("2");
        Convidados.add("3 -  daniel");
        Convidados.add("Car");
        
        String nome = "Car";
        
        for( String Convidado : Convidados){
            if (Convidado.equals(nome)){
            
            System.out.println(("Esta presente"));
            }
        }  
    }
}
