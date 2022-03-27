



    // La palabra reservada 'super' se usa para acceder a un elemento en la clase padre.
    // Se usa frecuentemente para invocar al constructor de la clase padre
    // Sirve para reducir la cantidad de codigo escrita en las clases hijas

    
    

    public class Padre{
      
      public void Saludar(){
        System.out.println("Hola yo soy la clase Padre!");  
      }
    }




    // En este caso cada clase Padre e Hija tienen sus metodos saludar.
    public class Hija extends Padre{
    
      public void Saludar(){
        Syatem.out.println("Hola yo soy la clase Hija!");                 // Al instanciar la clase Hija y ejecutar Saludar() retornara:
      }                                                                   //    "Hola yo soy la clase Hija!"
    }



    // Ahora accedemos al metodo Saludar() de su clase Padre
    public class Hija extends Padre{
    
      public void Saludar(){
        super.Saludar();                                                  // Al instanciar la clase Hija y ejecutar Saludar() retornara:
      }                                                                   //    "Hola yo soy la clase Padre!"
    }                                                                     // Esto se debe a que esta accediento al metodo Saludar() pero de su clase Padre
                                                                          // gracias a la palabra reservada 'super'







