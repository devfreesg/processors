name := Common.name

version := Common.version

organization := Common.organization

scalaVersion := "2.10.4"

lazy val core = project.in(file(".")).settings(
  addArtifact(Artifact(Common.name, Common.classifier), modelsTask in models).settings: _*
) aggregate models dependsOn models


lazy val models = project in file("models")

publishArtifact in (Compile, packageSrc) := false

publishArtifact in (Compile, packageDoc) := false

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-reflect" % "2.10.4",
  "org.scalatest" %% "scalatest" % "2.0.M6-SNAP17",
  "junit" % "junit" % "4.10" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "xom" % "xom" % "1.2.5",
  "joda-time" % "joda-time" % "2.1",
  "de.jollyday" % "jollyday" % "0.4.7",
  "com.googlecode.efficient-java-matrix-library" % "ejml" % "0.19",
  "edu.stanford.nlp" % "stanford-corenlp" % "3.3.1",
  "edu.stanford.nlp" % "stanford-corenlp" % "3.3.1" classifier "models",
  "ch.qos.logback" % "logback-classic" % "1.0.10",
  "org.slf4j" % "slf4j-api" % "1.7.3",
  "nz.ac.waikato.cms.weka" % "weka-dev" % "3.7.10",
  "net.sf.jopt-simple" % "jopt-simple" % "4.5",
  "de.bwaldvogel" % "liblinear" % "1.94",
  "log4j" % "log4j" % "1.2.17",
  "tw.edu.ntu.csie" % "libsvm" % "3.17",
  "edu.arizona.sista" %% "banner" % "1.0-SNAPSHOT",
  "edu.arizona.sista" %% "banner" % "1.0-SNAPSHOT" classifier "dragontool",
  "edu.arizona.sista" %% "banner" % "1.0-SNAPSHOT" classifier "heptag"
)