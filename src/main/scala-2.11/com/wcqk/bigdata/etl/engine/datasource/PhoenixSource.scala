package com.wcqk.bigdata.etl.engine.datasource

/**
  * Created by techi on 2017/10/30.
  */
class PhoenixSource extends MysqlSource {

    override def getDriverClass(url: String): String = "org.apache.phoenix.jdbc.PhoenixDriver"
}
