package Interfaces;

import Model.Produto;

public interface PagamentoPix {
    public default void  PagamentoPix(Produto produto){
        if(produto.getPreco() >= 1000){
            System.out.println("So aceitamos compras no pix abaixo de 1000");

        }
        else{
            System.out.println("Pagamento no Pix realizado com sucesso!");
        }
    }
}
