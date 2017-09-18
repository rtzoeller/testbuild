#!/usr/bin/env groovy
//Leave the above line alone.  It identifies this as a groovy script.
@Library('vs-common-build') _

String nodeLabel = 'dcaf'
List<String> lvVersions = ["2016"]
String sourceVersion = '2016'
def buildType = ni.vsbuild.BuildType.GROOVY
def packageType = ni.vsbuild.PackageType.NIPM
def officialSupport = false

def buildInfo = new ni.vsbuild.BuildInformation(nodeLabel, sourceVersion, lvVersions, packageType, officialSupport)

ni.vsbuild.PipelineExecutor.execute(this, buildInfo)
