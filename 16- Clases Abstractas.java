


      // Las clases abstractas no se pueden instanciar, por lo general se usan cuando aplicamos herencias

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
