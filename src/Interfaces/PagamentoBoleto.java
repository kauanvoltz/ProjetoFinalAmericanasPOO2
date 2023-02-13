package Interfaces;

import Model.Produto;

public interface PagamentoBoleto {
    public default  void PagamentoBoleto(Produto produto){
        System.out.println("Pagamento no boleto realizado com sucesso!");
    }
}
