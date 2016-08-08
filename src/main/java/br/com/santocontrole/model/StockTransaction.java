package br.com.santocontrole.model;


import br.com.santocontrole.database.SQLPersistence;

import javax.xml.bind.annotation.XmlRootElement;
import java.sql.Date;

@XmlRootElement
public class StockTransaction implements SQLPersistence {

    private long   transactionId;
    private long   itemId;
    private long   itemBulkId;
    private double quantity;
    private String transactionTypeLookupCode;
    private Date   transactionDate;
    private String salesChannelLookupCode;
    private long   priceId;
    private long   userId;
    private long   appUserId;


    public StockTransaction() {}

    public StockTransaction(long transactionId, long itemId, long itemBulkId, double quantity, String transactionTypeLookupCode
                           ,Date transactionDate, String salesChannelLookupCode, long priceId, long userId, long appUserId){


        this.transactionId = transactionId;
        this.itemId        = itemId;
        this.itemBulkId    = itemBulkId;
        this.quantity      = quantity;
        this.transactionTypeLookupCode = transactionTypeLookupCode;
        this.transactionDate = transactionDate;
        this.salesChannelLookupCode = salesChannelLookupCode;
        this.priceId         = priceId;
        this.userId          = userId;
        this.appUserId       = appUserId;
    }

    public long getAppUserId() {
        return appUserId;
    }

    public void setAppUserID(long appUserId) {
        this.appUserId = appUserId;
    }

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public long getItemBulkId() {
        return itemBulkId;
    }

    public void setItemBulkId(long itemBulkId) {
        this.itemBulkId = itemBulkId;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getTransactionTypeLookupCode() {
        return transactionTypeLookupCode;
    }

    public void setTransactionTypeLookupCode(String transactionTypeLookupCode) {
        this.transactionTypeLookupCode = transactionTypeLookupCode;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactinoDate) {
        this.transactionDate = transactinoDate;
    }

    public String getSalesChannelLookupCode() {
        return salesChannelLookupCode;
    }

    public void setSalesChannelLookupCode(String salesChannelLookupCode) {
        this.salesChannelLookupCode = salesChannelLookupCode;
    }

    public long getPriceId() {
        return priceId;
    }

    public void setPriceId(long priceId) {
        this.priceId = priceId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
