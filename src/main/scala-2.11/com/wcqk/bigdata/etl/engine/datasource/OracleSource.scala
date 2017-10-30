package com.wcqk.bigdata.etl.engine.datasource

/**
  * Created by techi on 2017/10/30.
  */
class OracleSource extends MysqlSource {
    override def getDriverClass(url: String): String = {
        "oracle.jdbc.driver.OracleDriver"
    }
}
