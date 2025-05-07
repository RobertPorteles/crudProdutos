package repositories;

import java.util.UUID;

import entities.Produto;
import factories.ConnectionFactory;

public class ProdutoRepository {
	ConnectionFactory connectionFactory = new ConnectionFactory();
	
	public void inserir(Produto produto) {
		try {
			
			var connection = connectionFactory.obterConexao();
			var stmt = connection
					.prepareStatement("insert into Produtos" + "(id, nome, preco, quantidade) values (?,?,?,?)");
			stmt.setObject(1, produto.getId());
			stmt.setString(2, produto.getNome());
			stmt.setDouble(3, produto.getPreco());
			stmt.setInt(4, produto.getQuantidade());
			stmt.execute();
			connection.close();
			System.out.println("Produto inserido com sucesso");
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Erro ao inserir o produto");
		}
	}

	public void listar() {
		try {
			var connection = connectionFactory.obterConexao();
			var stmt = connection.prepareStatement("select * from Produtos");
			var result = stmt.executeQuery();
			while (result.next()) {
				System.out.println("ID: " + result.getObject("id"));
				System.out.println("Nome: " + result.getString("nome"));
				System.out.println("Preço: " + result.getDouble("preco"));
				System.out.println("Quantidade: " + result.getInt("quantidade"));
			}
			connection.close();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Erro ao listar o produto");
		}
	}

	public void alterar(Produto produto) {
		try {
			var connection = connectionFactory.obterConexao();
			var stmt = connection
					.prepareStatement("update Produtos set nome = ?, preco = ?, quantidade = ? where id = ?");
			stmt.setString(1, produto.getNome());
			stmt.setDouble(2, produto.getPreco());
			stmt.setInt(3, produto.getQuantidade());
			stmt.setObject(4, produto.getId());
			stmt.execute();
			connection.close();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Erro ao alterar o produto");
		}
	}
	

	public void excluir(UUID id) {
		try {
			var connection = connectionFactory.obterConexao();
			var stmt = connection.prepareStatement("delete from Produtos where id = ?");
			stmt.setObject(1, id);
			stmt.execute();

			connection.close();
			System.out.println("Produto excluido com sucesso");
			
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Erro ao excluir o produto");
		}
	}

	
}
