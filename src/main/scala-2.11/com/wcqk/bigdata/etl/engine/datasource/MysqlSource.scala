package com.wcqk.bigdata.etl.engine.datasource

import com.wcqk.bigdata.etl.engine.bean.{JdbcSourceInfo, SourceInfo, TableInfo}
import org.apache.spark.sql.{DataFrame, SparkSession}

/**
  * Created by techi on 2017/10/30.
  */
class MysqlSource extends DataSource {

    override def load(sess: SparkSession, sourceInfo: SourceInfo, table: TableInfo): Option[DataFrame] = {
        sourceInfo match {
            case info: JdbcSourceInfo =>
                Option(sess.read.format("jdbc")
                    .option("driver", getDriverClass(info.url))
                    .option("url", "url")
                    .option("dbtable", table.tableName)
                    .option("user", info.user)
                    .option("password", info.pwd)
                    .load())
            case _ => Option.empty
        }

    }

    override def write(df: DataFrame): Unit = ???

    def getDriverClass(url: String): String = {
        "com.mysql.jdbc.Driver"
    }
}
