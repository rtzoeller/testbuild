#!/usr/bin/env groovy
//Leave the above line alone.  It identifies this as a groovy script.
@Library('vs-common-build') _

List<String> lvVersions = ['2016', '2017']
def buildInformation = new ni.vsbuild.BuildInformation('veristand', lvVersions, ni.vsbuild.BuildFlow.GROOVY)

//ni.vsbuild.PipelineExecutor.execute(this, groovyFlow(lvVersions))
ni.vsbuild.PipelineExecutor.execute(this, buildInformation)
