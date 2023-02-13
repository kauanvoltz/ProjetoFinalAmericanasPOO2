package Interfaces;

import Model.Produto;

public interface PagamentoCredito {
    public  default  void PagamentoCartaoDeCredito(Produto produto){
        if(produto.getPreco() >= 2000){
            System.out.println("So aceitamos compras no cartao de credito abaixo de 2000");

        }
        else{
            System.out.println("Pagamento no credito realizado com sucesso!");
        }

    }

}
