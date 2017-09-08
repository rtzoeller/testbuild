#!/usr/bin/env groovy
//Leave the above line alone.  It identifies this as a groovy script.
@Library('vs-common-build') _

String nodeLabel = 'dcaf'
List<String> lvVersions = ["2016"]
String sourceVersion = '2016'
def buildType = ni.vsbuild.BuildType.Groovy
def packageType = ni.vsbuild.PackageType.NIPM
def officialSupport = true

def buildInfo = new ni.vsbuild.BuildInformation(nodeLabel, sourceVersion, lvVersions, packageType, officialSupport)
//buildPipeline(buildInfo)
//def tester = new ni.vsbuild.TestClass(this, 'test name')
//tester.execute()

ni.vsbuild.Executor.execute(this, buildInfo)
//def executor = new ni.vsbuild.Executor(this, buildInfo)
//executor.execute()

//ni.vsbuild.nipm.Pipeline.builder(this).buildFullPipeline().execute()

//buildPipeline(getCommonBuildInformation())
