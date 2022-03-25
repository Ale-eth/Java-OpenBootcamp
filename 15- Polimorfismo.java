



      // El polimorfismo permite:

      public static void main (String[] args){
      
        Auto auto1 = new Auto():                        // Crea un objeto auto1 con la clase Auto
        AutoElectrico auto2 = new AutoElectrico();      // Crea un objeto auto2 con la clase AutoElectrico
        AutoHibrido auto3 = new AutoHibrido();          // Crea un objeto auto3 con la clase AutoHibrido
        
        // Polimorfismo:
        Auto auto4 = new AutoElectrico();     // En este caso, tenemos un objeto con la clase AutoElectrico, pero que va a ser tratado como clase Auto y AutoElectrico
        Auto auto5 = new AutoHibrido();       // En este caso, tenemos un objeto con la clase AutoHibrido, pero que va a ser tratado como clase Auto y AutoHibrido
      }


      // Para comprobar si un objeto pertenece a determinada clase podemos hacer lo siguiente:

          if (auto4 instanceof AutoElectrico){
            System.out.println("auto4 pertenece a la clase AutoElectrico");
          }

          if (auto4 instanceof Auto){
            System.out.println("auto4 pertenece a la clase Auto");
          }

                  // Ambos casos son verdaderos

      // instanceof nos permite comprobar si un objeto pertenece a una clase en particular.
      

      
