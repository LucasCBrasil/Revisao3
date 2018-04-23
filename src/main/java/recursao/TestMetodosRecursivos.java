package recursao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMetodosRecursivos {
	
	MetodosRecursivos metodos;

	@Before
	public void setUp() throws Exception {
		metodos = new MetodosRecursivos();
	}

	@Test
	public void testCalcularFatorial() {
		assert(this.metodos.calcularFatorial(0) == 1);
		assert(this.metodos.calcularFatorial(1) == 1);
		assert(this.metodos.calcularFatorial(5) == 120);
		assert(this.metodos.calcularFatorial(10) == 3628800);
	}
	
	@Test
	public void testCalcularFibonacci() {
		assert(this.metodos.calcularFibonacci(1) == 1);
		assert(this.metodos.calcularFibonacci(2) == 1);
		assert(this.metodos.calcularFibonacci(8) == 21);
		assert(this.metodos.calcularFibonacci(11) == 89);
		assert(this.metodos.calcularFibonacci(18) == 2584);
	}
	
	@Test
	public void testCountNotNull() {
		Object vetor[] = {1,2,null,null,5};
		assert(this.metodos.countNotNull(vetor) == 3);
	}
}
