#!/usr/bin/env groovy
//Leave the above line alone.  It identifies this as a groovy script.
@Library('vs-common-build') _

String nodeLabel = 'dcaf'
List<String> lvVersions = ["2016"]
String sourceVersion = '2016'
def buildType = BuildType.Groovy

def buildInfo = new BuildInformation(nodeLabel, sourceVersion, lvVersions, buildType)
//buildPipeline(buildInfo)
def tester = new org.vs-common-build.TestClass(this, 'test name')
tester.execute()

//buildPipeline(getCommonBuildInformation())
