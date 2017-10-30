package com.wcqk.bigdata.etl.engine.bean

import com.wcqk.bigdata.etl.engine.transform.TransformRule

/**
  * Created by techi on 2017/10/26.
  */
class JobConfig(source: SourceInfo, sourceTable: TableInfo,
                target: SourceInfo, targetTable: TableInfo, rules: Seq[TransformRule]) {

}


object JobConfig {

    def apply(id: Long): JobConfig = {
        //TODO add convert code
        null
    }
}