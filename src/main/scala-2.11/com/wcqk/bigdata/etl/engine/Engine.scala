package com.wcqk.bigdata.etl.engine

import com.wcqk.bigdata.etl.engine.bean.JobConfig
import org.apache.spark.sql.SparkSession

/**
  * Created by techi on 2017/10/26.
  */
object Engine {

    def main(args: Array[String]): Unit = {
        val sess = SparkSession.builder().appName("aa").master("local[*]").getOrCreate()

        val jobConfig = JobConfig(args(0).toLong)


    }

}
