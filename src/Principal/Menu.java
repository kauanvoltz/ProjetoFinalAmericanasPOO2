package Principal;

import Model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Menu {
    public static void main(String[] args) {
        List<Produto> produtoLista = new ArrayList<Produto>();
        Admin admin = new Admin();

        Produto livro1 = new Livro("teste",5,"butia","lester");
        Produto livro2 = new Livro("teste2",5,"butia","lester");
        Produto livro3 = new Livro("teste3",5,"butia","lester");

        Produto infor1 = new Informatica("informatica",5,"lestdaf","note");
        Produto mer2 = new Mercado("mercado",5,"butia","lester");

        admin.AdicionarLista(produtoLista,livro1);
        admin.AdicionarLista(produtoLista,livro2);
        admin.AdicionarLista(produtoLista,livro3);
        admin.AdicionarLista(produtoLista,infor1);
        admin.AdicionarLista(produtoLista,mer2);


        admin.Remover(produtoLista,1);
        admin.EditarProduto(livro1 ,"livro",100);
        //admin.exibirNomeDosAnimais(produtoLista);


        ClienteClt clienteClt =new ClienteClt();
        ClientePj clientePj = new ClientePj();

        clienteClt.exibirProdutos(produtoLista);

        clienteClt.PagamentoPix(livro1);
        clientePj.PagamentoFaturamento(livro3);


    }



}
