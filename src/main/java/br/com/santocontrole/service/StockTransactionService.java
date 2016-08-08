package br.com.santocontrole.service;


import br.com.santocontrole.database.SQLHelperService;
import br.com.santocontrole.database.SQLPersistence;
import br.com.santocontrole.model.StockTransaction;

public class StockTransactionService {

    public StockTransactionService() {

    }

    public long stockMovement(String persistenceType, StockTransaction stockTransaction){

        SQLPersistence sqlPersistence = stockTransaction;
        SQLHelperService helperService = new SQLHelperService();
        long stockTrxId = helperService.sqlExec(persistenceType,sqlPersistence);

        return stockTrxId;

    }
}
