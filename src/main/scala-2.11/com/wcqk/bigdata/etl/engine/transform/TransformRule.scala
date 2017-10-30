package com.wcqk.bigdata.etl.engine.transform

import org.apache.spark.sql.{DataFrame, SparkSession}

/**
  * Created by techi on 2017/10/27.
  */
trait TransformRule {

    def verify(sess: SparkSession, df: DataFrame)

    def transform(sess: SparkSession, df: DataFrame, meta: String)
}
