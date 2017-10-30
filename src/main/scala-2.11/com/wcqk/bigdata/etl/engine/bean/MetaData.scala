package com.wcqk.bigdata.etl.engine.bean

import com.wcqk.bigdata.etl.engine.datasource.DataSource

/**
  * Created by techi on 2017/10/26.
  */
case class TableInfo(dataSource: DataSource, tableName: String, schema: TableSchema)

case class ColumnSchema(name: String, colType: String)

case class TableSchema(columnDefs: Seq[ColumnSchema])