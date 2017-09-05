name := """keepnpay"""
organization := "com.nerd-inc"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.12.2"

libraryDependencies += guice

// Compile the project before generating Eclipse files, so that generated .scala or .class files for views and routes are present
EclipseKeys.preTasks := Seq(compile in Compile, compile in Test)

playEbeanModels in Compile := Seq("models.*")

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.41"
libraryDependencies ++= Seq(evolutions, jdbc)
libraryDependencies += javaForms