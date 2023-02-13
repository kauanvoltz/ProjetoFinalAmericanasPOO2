package Interfaces;

import Model.Produto;

import java.util.List;

public interface AdminDao {
    public  void EditarProduto(Produto produto, String nome,int preco);

    public  void Remover(List<? extends Produto> produtos, int index);

    public default   void AdicionarLista(List<Produto> produtos, Produto obj){
        produtos.add(obj);
    };



}
