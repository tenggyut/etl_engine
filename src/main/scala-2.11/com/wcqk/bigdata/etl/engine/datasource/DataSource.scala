package com.wcqk.bigdata.etl.engine.datasource

import com.wcqk.bigdata.etl.engine.bean.{SourceInfo, TableInfo}
import org.apache.spark.sql.{DataFrame, SparkSession}

/**
  * Created by techi on 2017/10/26.
  */
trait DataSource {

    def load(sess: SparkSession, sourceInfo: SourceInfo, table: TableInfo)

    def write(df: DataFrame)
}
