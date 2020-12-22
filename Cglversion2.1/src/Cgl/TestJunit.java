package Cgl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestJunit {
	
	   @Test
	   public void testOne() {
		   //ComplexNumber cn1 = new ComplexNumber(3, 4);
		   //ComplexNumber cn2 = new ComplexNumber(3, -8);
		   Board b = new Board();
	       System.out.println("======TEST ONE EXECUTED=======");
	       Assertions.assertEquals("true", b.createBoard(5));
	   }
	   
	   @Test
	   public void testTwo() {
		   //ComplexNumber cn1 = new ComplexNumber(3, 4);
		   //ComplexNumber cn2 = new ComplexNumber(4, -1);
		   Board b = new Board();
		   System.out.println("======TEST TWO EXECUTED=======");
	       Assertions.assertEquals("false", b.createBoard(-1));
	   }
	   
	   @Test
	   public void testThree() {
		   //ComplexNumber cn1 = new ComplexNumber(3, 4);
		   //ComplexNumber cn2 = new ComplexNumber(5, 6);
		   System.out.println("======TEST THREE EXECUTED=======");
	       
	   }
	}




}
