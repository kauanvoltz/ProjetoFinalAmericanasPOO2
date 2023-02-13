package Model;

import Interfaces.PagamentoBoleto;
import Interfaces.PagamentoCredito;
import Interfaces.PagamentoPix;

public class ClienteClt extends Usuario implements PagamentoBoleto, PagamentoPix, PagamentoCredito {

}
