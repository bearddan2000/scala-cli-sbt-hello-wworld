lazy val root = (project in file("."))
  .settings(
  
  // Project name (artifact name in Maven)
  name := "scala-sbt",

  version := "1.0",

  scalaVersion := "2.13.1",

  mainClass := Some("example.Main")
)