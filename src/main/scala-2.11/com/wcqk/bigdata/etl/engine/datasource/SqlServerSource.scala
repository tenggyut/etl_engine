package com.wcqk.bigdata.etl.engine.datasource

/**
  * Created by techi on 2017/10/30.
  */
class SqlServerSource extends MysqlSource {
    override def getDriverClass(url: String): String = {
        "com.microsoft.sqlserver.jdbc.SQLServerDriver"
    }
}
