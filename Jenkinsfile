pipeline {
  agent any
  stages {
    stage('checkout') {
      steps {
        git(url: 'https://github.com/BhanuprakashaB/aircompany.git', branch: 'main')
      }
    }

    stage('build') {
      steps {
        bat 'script{ 					env.PATH =\'C:\\\\apache-maven-3.9.5\\\\bin;C:\\\\Windows\\\\System32\' 				} 				bat label: \'\', script: \'mvn package\''
      }
    }

    stage('archive') {
      steps {
        archiveArtifacts 'archiveArtifacts \'target/*.jar\''
      }
    }

  }
}