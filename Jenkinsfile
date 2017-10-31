#!/usr/bin/env groovy
//Leave the above line alone.  It identifies this as a groovy script.
@Library('vs-common-build') _

List<String> lvVersions = ['2016']

node('dcafbuild01){
   stage('checkout') {
      deleteDir()
      echo 'Attempting to get source from repo.'
      timeout(time: 5, unit: 'MINUTES'){
         checkout(script.scm)
      }
   }

   def configuration = ni.vsbuild.v2.BuildConfiguration.load(this, 'output.txt')
   configuration.printInformation(this)
}
