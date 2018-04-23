package vetor;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestVetor {

	Vetor vetorTeste;
	Aluno alunoTeste;
	Aluno alunoTesteDois;
	
	@Before
	public void setUp() throws Exception {
		vetorTeste = new Vetor(2);
		alunoTeste = new Aluno("Jose", 2.5);
		alunoTesteDois = new Aluno("Joao", 5);
		this.vetorTeste.inserir(alunoTeste);
	}

	@Test
	public void testInserirObjetoValido() {
		this.vetorTeste.inserir(alunoTeste);
		assert(vetorTeste.procurar(alunoTeste) == alunoTeste);
	}
	
	@Test(expected = RuntimeException.class)
	public void testInserirObjetoVetorCheio() {
		Aluno alunoTeste = new Aluno("Jose", 2.5);
		this.vetorTeste.inserir(alunoTeste);
		this.vetorTeste.inserir(alunoTeste);
		this.vetorTeste.inserir(alunoTeste);
	}
	
	@Test
	public void testRemover() {
		this.vetorTeste.remover(alunoTeste);
		assert(this.vetorTeste.procurar(alunoTeste) == null);
	}
	
	@Test
	public void testRemoverObjetoNaoArmazenado() {
		assert(this.vetorTeste.remover(alunoTesteDois) == null);
	}
	
	@Test
	public void testProcurarObjetoArmazenado() {
		assert(this.vetorTeste.procurar(alunoTeste) == alunoTeste);
	}
	
	@Test
	public void testProcurarObjetoNaoArmazenado() {
		assert(this.vetorTeste.procurar(alunoTesteDois) == null);
	}
	
	@Test
	public void testIsVazioTrue() {
		Vetor vetorVazio = new Vetor(2);
		assert(vetorVazio.isVazio() == true);
	}
	
	@Test
	public void testIsVazioFalse() {
		assert(this.vetorTeste.isVazio() == false);
	}

}
