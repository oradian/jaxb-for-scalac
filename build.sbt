val jaxb = "javax.xml.bind" % "jaxb-api" % "2.3.1"

organization := "com.oradian.util"
name := "jaxb-for-scalac"
version := jaxb.revision

crossScalaVersions := Seq("2.12.10", "2.13.1")

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-compiler" % scalaVersion.value,
  jaxb % Provided,
)

assemblyJarName in ThisBuild := s"${name.value}_${scalaBinaryVersion.value}.jar"
fullClasspath in assembly := (fullClasspath in Compile).value
assemblyExcludedJars in assembly := (fullClasspath in assembly).value.filter(_.data.getName != s"${jaxb.name}-${jaxb.revision}.jar")
addArtifact(artifact in (Compile, assembly), assembly)
publishArtifact := false
