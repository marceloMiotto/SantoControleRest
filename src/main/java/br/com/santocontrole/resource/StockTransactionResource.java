package br.com.santocontrole.resource;


import br.com.santocontrole.database.SQLPersistence;
import br.com.santocontrole.model.StockTransaction;
import br.com.santocontrole.service.StockTransactionService;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("secured/estoque")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class StockTransactionResource {

    @POST
    public StockTransaction addStockTransaction(StockTransaction stockTransaction){

        StockTransactionService stockTransactionService = new StockTransactionService();
        long result = stockTransactionService.stockMovement(SQLPersistence.PERSISTENCE_POST,stockTransaction);


        stockTransaction.setTransactionId(result);
        return stockTransaction;

    }
}
