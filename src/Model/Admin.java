package Model;

import Interfaces.AdminDao;

import java.util.List;

public class Admin extends Usuario implements AdminDao {



    @Override
    public void EditarProduto(Produto produto, String nome, int preco) {
        produto.setNome(nome);
        produto.setPreco(preco);
    }

    @Override
    public void Remover(List<? extends Produto> produtos, int index) {
        produtos.remove(index);
    }




}

