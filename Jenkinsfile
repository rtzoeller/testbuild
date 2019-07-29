#!/usr/bin/env groovy
//Leave the above line alone.  It identifies this as a groovy script.
@Library('vs-build-tools') _

List<String> lvVersions = ['2016', '2017', '2018']

List<String> dependencies = ['testbuild-deps']

ni.vsbuild.PipelineExecutor.execute(this, 'veristand', lvVersions, dependencies)
