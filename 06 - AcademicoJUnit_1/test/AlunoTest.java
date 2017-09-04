
import aluno.Aluno;
import junit.framework.TestCase;

public class AlunoTest extends TestCase {

	Aluno aluno;

	protected void setUp() throws Exception {
		super.setUp();
		aluno = new Aluno();
	}
        
	public void testCalcularAprovacao_ReprovacaoInfrequencia() {
		aluno.setFrequencia(74);
		assertEquals(false, aluno.calcularAprovacao());
	}
}
