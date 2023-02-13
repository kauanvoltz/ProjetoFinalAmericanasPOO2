package Interfaces;

import Model.Produto;

public interface PagamentoPJ {

    public default  void PagamentoFaturamento(Produto produto){
        System.out.println("Pagamento via Faturamento realizado com sucesso!");
    }

}
