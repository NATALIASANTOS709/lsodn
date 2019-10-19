package br.com.unipac.cliente.api.clienteapi.resources;

public class ClienteDAOImp {
	package br.com.unipac.cliente.api.clienteapi.resources;

	import java.util.ArrayList;
	import java.util.List;

	import org.springframework.stereotype.Repository;

	@Repository

	public class ClienteDAOImpl {

		List<Cliente> clientes = new ArrayList<>();
		
		public boolean salvar(Cliente cliente) {
		return clientes.add(cliente);
		}


		public boolean alterar(Long id, Cliente cliente) {
		cliente.update(id, cliente);
		return clientes.add(cliente);
		}

		public List<Cliente> listarTodos() {
		return clientes;
		}

		public boolean buscarPorId(Cliente cliente) {
			return clientes.contains(cliente);
			}



		public boolean removerPorId(Cliente cliente) {
		return clientes.remove(cliente);
		}

		
		
		
	}


}
