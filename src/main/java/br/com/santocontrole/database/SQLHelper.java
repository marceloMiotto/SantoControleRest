package br.com.santocontrole.database;

public interface SQLHelper {

    long sqlExec(String execType, SQLPersistence... sqlPersistence);

}
