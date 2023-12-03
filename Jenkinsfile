pipeline {
  agent any
  stages {
    stage('checkout') {
      steps {
        git 'https://github.com/BhanuprakashaB/aircompany.git'
      }
    }

    stage('build') {
      steps {
        bat 'mvn package'
      }
    }

  }
}