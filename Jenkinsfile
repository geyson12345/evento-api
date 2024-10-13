pipeline{
    agent any

        stages {
            stage('SCM Chekout') {
                steps {
                    git branch: 'main', credentialsId: 'jk-github-token', url: 'git@github.com:geyson12345/evento-api.git'
                }
            }


        stage('Build Docker Image') {
            steps {
                sh 'docker build -t geyson12345/webapp .'
            }
        }

        stage('Login to Docker Hub') {
            steps {
                sh 'echo $DOCKERHUB_CREDENTIALS_USR | docker login -u $DOCKERHUB_CREDENTIALS_PSW --password-stdin'
            }
        }


        stage('Push to Docker Hub') {
            steps {
                sh 'docker push geyson12345/webapp'
            }
        }



    }

}