
// Previamente tenemos la clase Auto, que nos va a servir de plantilla:

        public class Auto {
        
        // Atributos
        String marca;
        String color;
        String patente;
        Double peso_kg;
        Integer velocidad = 0;
      
      
        // Metodos constructores
        public Auto(String marca, String color, String patente, Double peso_kg){
          this.marca = marca;              
          this.color = color;
          this.patente = patente;
          this.peso_kg = peso_kg:
        }
      
        // Comportamiento
        public void acelerar(Integer cantidad){
          this.velocidad += cantidad;
          }
        }



    
// 1. Creamos una nueva clase con su metodo main
          
    public class AutoMain{
      public static void main (String[] args){
          
          Auto autoObj1 = new Auto("Audi", "Negro", "AJ67KJ", 895);     // Crea un nuevo objeto en este caso Auto con sus caracteristicas
          
          autoObj1.acelerar(50);      // Accede a un metodo de comportamiento de la clase Auto, y aumenta la velocidad en 50 kmph
          
          System.out.println(autoObj);   // Imprime todas las caracteristicas del objeto
      }
    }








