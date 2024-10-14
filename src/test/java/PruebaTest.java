import org.example.Ejercicio7.Operacion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PruebaTest {


   @Test
   public void testSumar() {
      Operacion o = new Operacion(25);
      assertEquals(Integer.valueOf(30), o.sumar(5));
   }

   @Test
   public void testMultiplicar() {
      Operacion o = new Operacion(25);
      assertEquals(Integer.valueOf(125), o.multiplicar(5));
   }

   @Test
   public void testDividir() {
      Operacion o = new Operacion(25);
      assertEquals(Integer.valueOf(5), o.dividir(5));
      Operacion o2 = new Operacion(5);
      assertEquals(Integer.valueOf(1), o2.dividir(5));
   }

   @Test
   public void testRestar(){
      Operacion o = new Operacion(25);
      assertEquals(Integer.valueOf(20), o.restar(5));
   }

}
