@Library("Shared")_ 
    
pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                hello()            
            }
        }
        stage('cloning repo') {
            steps {
                clone("https://github.com/snowkluster/ghw-sort", "master")
            }
        }
        stage('docker build') {
            steps {
                docker("flask-app")
            }
        }
        stage("docker run"){
            steps {
                docker_run(5000,"ghw-flask-app","flask-app")
            }
        }
    }
    post {
        success {
            echo "Pipeline execution successful"
        }
        always { 
            echo 'I will always say Hello again!'
        }
    }
}
