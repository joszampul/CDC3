package us.dit;

public class Control {
   public static void main(String[] args) {
    	int var1=40;
    	int var2=10;        
        int resultado = operacion(var1,var2);        
        System.out.println(us.dit.Validador.validar(resultado));       
        }
        
   public static int operacion(int a, int b) {
        return a/b;
   }    
  
}
