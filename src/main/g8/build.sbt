import com.example.build.Dependencies._


lazy val scalaV = "$scalaVersion$"
lazy val localAppRepo = "create-local-app".at(
  (Path.userHome / ".ivy2" / "create-local-app").toURI.toURL.toString
)

// Project information
scalaVersion  := scalaV
organization  := "$organization$"
version       := "0.1.0-SNAPSHOT"
name          := "$name$"
description   := "$description$"

Compile / compile / scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-unchecked",
  // "-Xfatal-warnings",
  "-Xlint"
)

javacOptions ++= Seq("-encoding", "UTF-8")

publishTo := Some(localAppRepo)

// test in assembly := {}
