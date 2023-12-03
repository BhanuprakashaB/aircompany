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
        bat 'set env.PATH = C:/Users/pc/Downloads/apache-maven-3.6.3/bin;c:/Windows/System32 			 		label: \'\', script: \'mvn package\''
      }
    }

  }
}