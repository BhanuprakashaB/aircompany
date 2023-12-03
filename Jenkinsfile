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
        bat 'mvn package'
      }
    }

  }
}