pipeline {
    agent any
        tools {
            maven 'Maven3' 
        }
        stages {
            stage ('test') {
                steps {
                    bat "mvn clean compile test"
            }
            }
            stage ('Build application') {
                steps {
                    bat "mvn -f pom.xml clean install -Dmaven.test.skip=true"
            }
            }
            stage ('Pasamos a producción') {
                steps {
                    bat "Movemos al servidor y lo ponemos en producción"
            }
        }
    }
}
