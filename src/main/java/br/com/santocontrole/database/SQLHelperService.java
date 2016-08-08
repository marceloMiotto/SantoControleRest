package br.com.santocontrole.database;


import br.com.santocontrole.database.connectionHelper.ConHelper;
import br.com.santocontrole.model.StockTransaction;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLHelperService implements SQLPersistence, SQLHelper {

    private StockTransaction stockTrx;
    private Statement  stmt;

    public SQLHelperService() {}


    @Override
    public long sqlExec(String execType, SQLPersistence... sqlPersistence) {

        //define the object class

        if(sqlPersistence[0] instanceof StockTransaction){

            stockTrx =  (StockTransaction) sqlPersistence[0];

        }


        //get the database map
        String sql = "INSERT INTO SC.ITEM_TRANSACTIONS ("+
                     "ITEM_ID " +
                     ",ITEM_BULK_ID " +
                     ",QUANTITY " +
                     ",TRANSACTION_TYPE_LOOKUP_CODE " +
                     ",TRANSACTION_DATE "+
                     ",SALES_CHANNEL_LOOKUP_CODE "+
                     ",PRICE_ID "+
                     ",CREATION_DATE "+
                     ",CREATED_BY "+
                     ",LAST_UPDATE_DATE "+
                     ",LAST_UPDATED_BY " +
                     ",APP_USER_ID"+
                     ") VALUES "         +
                     "( "                +
                            stockTrx.getItemId() +
                     ", " + stockTrx.getItemBulkId() +
                     ", " + stockTrx.getQuantity() +
                     ", '" + stockTrx.getTransactionTypeLookupCode() + "'" +
                     ", current_timestamp " +
                     ", '" + stockTrx.getSalesChannelLookupCode() + "'" +
                     ", " + stockTrx.getPriceId() +
                     ", current_timestamp " +
                     ", " + stockTrx.getUserId() +
                     ", current_timestamp " +
                     ", " + stockTrx.getUserId() +
                     ", " + stockTrx.getAppUserId() +
                     ")";

        System.out.println(sql);

        ConHelper conHelper = new ConHelper();
        Connection conn = conHelper.getConnection();
        try {
            stmt = conn.createStatement();
            stmt.execute(sql);

        }catch (SQLException e){
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    conn.close();
            }catch(SQLException se){
            }// do nothing
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try

        //get connection

        //execute the command
        switch (execType){

            case PERSISTENCE_DELETE:
                //call delete
                break;
            case PERSISTENCE_POST:
                //call insert
                break;
            case PERSISTENCE_PUT:
                //call update
                break;
            default: break;

        }

        return 0;
    }

    private long sqlInsert() {

        return 0;
    }


    private int sqlUpdate() {
        return 0;
    }

    private int sqlDelete() {
        return 0;
    }


}
