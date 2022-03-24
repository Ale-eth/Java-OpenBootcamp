
  int numero;   // Cualquier clase que este en su mismo paquete podra acceder 

  public int numero;  // Cualquier clase que este en su mismo paquete o no, podra acceder 

  private int numero;  // Solo su misma clase podra acceder



  // Quien puede acceder?

public :    - Su misma clase
            - Otra clase del mismo paquete
            - Subclase de otro paquete
            - Otra clase de otro paquete


protected : - Su misma clase
            - Otra clase del mismo paquete
            - Subclase de otro paquete
 

default :   - Su misma clase
            - Otra clase del mismo paquete

private :   - Su misma clase
