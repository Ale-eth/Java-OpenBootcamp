


      // Las clases abstractas no se pueden instanciar, se usan solo en superclases (es decir que tienen clases hijas)
      // y deben contener como minimo un metodo abstracto.

      public abstract class Auto{     // Para indicar que la clase es abstracta, escribimos abstract antes del class
        String color;
        String modelo;
        String patente;
      }

      // Suele usarse para forzar al desarrollador a usar una clase hija de esa clase abstracta
      // Ej:
      //        Auto: abstract class
      //        AutoElectrico: public class
      //        AutoHibrido: public class
  
  
      // Podremos instranciar AutoElectrico y AutoHibrido que son hijas de la clase Auto, pero no podremos instanciar Auto solo.



      // Ejemplo:
      //                clase:            SerVivo                      metodo: alimentarse();
      //                subclase:         Planta y Animal              metodo: alimentarse();
      //                subclase Animal:  Carnivoro y Herbivoro        metodo: alimentarse();

      // Todos son seres vivos y se alimentan, pero no de la misma manera







