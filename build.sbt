name := "etl-engine"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-sql" % "2.1.2",
  "com.springml" %% "spark-sftp" % "1.1.1",

    "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)