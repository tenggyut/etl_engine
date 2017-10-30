package com.wcqk.bigdata.etl.engine.datasource
import com.wcqk.bigdata.etl.engine.bean.{SourceInfo, TableInfo}
import org.apache.spark.sql.{DataFrame, SparkSession}

/**
  * Created by techi on 2017/10/30.
  */
class FtpSource extends DataSource {
    override def load(sess: SparkSession, sourceInfo: SourceInfo, table: TableInfo): Unit = ???

    override def write(df: DataFrame): Unit = ???
}
