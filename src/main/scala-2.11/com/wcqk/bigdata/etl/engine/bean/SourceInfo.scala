package com.wcqk.bigdata.etl.engine.bean

/**
  * Created by techi on 2017/10/30.
  */
case class SourceInfo(sourceType: String)

case class JdbcSourceInfo(url: String, user: String = "", pwd: String = "") extends SourceInfo("jdbc")

case class FtpSourceInfo(host: String, port: String, user: String = "", pwd: String = "") extends SourceInfo("ftp")