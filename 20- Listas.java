


  // Con listas dinamicas podemos recorrer objetos
 

 // Primero hay que importar
import java.util.List;

    public static void main (String[] args){
    
      // Declaramos la lista
      List <String> nombres = new ArrayList<>();
      
      // Con add pusheamos un valor a la lista
      nombres.add("1 Juan");
      nombres.add("2 Manuel");
      nombres.add("3 Jorge);
                  
                  
      // ForEach para recorrer una lista 
      for (String nombre : nombres){
          System.out.println(nombre);
      }
    }
                  
                  
