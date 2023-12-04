pipeline {
  agent any
  stages {
    stage('checkout') {
      steps {
        git(url: 'https://github.com/BhanuprakashaB/aircompany.git', branch: 'test')
      }
    }

    stage('build') {
      steps {
        bat(script: 'set MVN_HOME="C:\\apache-maven-3.9.5" set PATH=%MVN_HOME%\\bin;%PATH% ', returnStdout: true)
      }
    }

    stage('buildproject') {
      steps {
        bat 'mvn package'
      }
    }

  }
}