package Model;

import Interfaces.PagamentoBoleto;
import Interfaces.PagamentoCredito;
import Interfaces.PagamentoPJ;
import Interfaces.PagamentoPix;

public class ClientePj extends Usuario implements PagamentoBoleto, PagamentoPix, PagamentoCredito, PagamentoPJ {
}
