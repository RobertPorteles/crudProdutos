package controllers;

import java.util.Scanner;
import java.util.UUID;

import entities.Produto;
import repositories.ProdutoRepository;

public class ProdutoController {

    public void gerenciarProdutos() {
        var scanner = new Scanner(System.in);
        var produtoRepository = new ProdutoRepository();

        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Listar Produtos");
        System.out.println("3 - Atualizar produto");
        System.out.println("4 - Deletar produto");
        System.out.print("Digite a opção desejada: ");
        var opcao = scanner.nextInt();
        scanner.nextLine(); // limpa o buffer

        switch (opcao) {
            case 1:
                System.out.println("\nCadastrar produto");
                var produtoCadastro = new Produto();
                produtoCadastro.setId(UUID.randomUUID());

                System.out.println("Digite o nome: ");
                produtoCadastro.setNome(scanner.nextLine());

                System.out.println("Digite o preço: ");
                produtoCadastro.setPreco(Double.parseDouble(scanner.nextLine()));
                

                System.out.println("Digite a quantidade: ");
                produtoCadastro.setQuantidade(Integer.parseInt(scanner.nextLine()));
                

                produtoRepository.inserir(produtoCadastro);
                break;

            case 2:
                System.out.println("\nListar produtos");
                produtoRepository.listar();
                break;

            case 3:
                System.out.println("\nAtualizar produto");
                var produtoEdicao = new Produto();

                System.out.println("Digite o ID do produto: ");
                produtoEdicao.setId(UUID.fromString(scanner.nextLine()));

                System.out.println("Digite o nome: ");
                produtoEdicao.setNome(scanner.nextLine());

                System.out.println("Digite o preço: ");
                produtoEdicao.setPreco(scanner.nextDouble());
                scanner.nextLine();

                System.out.println("Digite a quantidade: ");
                produtoEdicao.setQuantidade(scanner.nextInt());
                scanner.nextLine();

                produtoRepository.alterar(produtoEdicao);
                break;

            case 4:
                System.out.println("\nDeletar produto");
                System.out.println("Digite o ID do produto: ");
                UUID id = UUID.fromString(scanner.nextLine());
                produtoRepository.excluir(id);
                break;

            default:
                System.out.println("\nOpção inválida");
                break;
        }

        scanner.close();
    }
}
