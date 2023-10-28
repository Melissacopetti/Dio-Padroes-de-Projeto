package dio.padroesSpring.service.implement;

public interface ClienteService {

	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void insert(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);

}
