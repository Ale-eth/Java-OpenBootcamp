



 // Primero hay que importar
import java.util.HashMap;
import java.util.Map;


public static void main (String[] args){
  
    Map<String, String> personas = new HashMap<>();
  
    //              key      value
    personas.put("12345", "Alejandro");
    personas.put("6789", "Juan");
    personas.put("54321", "Manuel");
  
    System.out.println(personas);
  
  
    // Recorremos por KEY
    for (String key :personas.keySet()){
      System.out.println(key);
    }
    
    // Asi recorremos por VALUE
    for (String value :personas.value()){
      System.out.println(value);
    }
  
  
    // De esta forma recorremos el mapa entero, por Key y por Value
    for (Map.Entry<String, String>pair : personas.entrySet(){
      System.out.println("Key: "+ pair.getKey() +"Value: "+ pair.getValue());
    }
}
         
         
         
         
         
         
