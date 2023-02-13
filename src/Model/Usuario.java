package Model;

import Model.Produto;

import java.util.List;

public abstract class Usuario {

    public  void exibirProdutos(List<? extends Produto> produtos) {

        for (Produto produto : produtos) {
            System.out.println(produto.getClass().getSimpleName() + ": " + produto.getNome() + " preco: " + produto.getPreco() );
        }

    }
}
