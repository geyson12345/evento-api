pipeline{
    agent any
//         SCM Checkout: Clonar o código-fonte do repositório GitHub.
            stage('SCM Chekout') {
                steps {
                    git branch: 'main', credentialsId: 'jk-github-token', url: 'git@github.com:geyson12345/evento-api.git'
                }
            }

//         Build Docker Image: Construir a imagem Docker da aplicação a partir do Dockerfile.
        stage('Build Docker Image') {
            steps {
                sh 'docker build -t geyson12345/webapp .'
            }
        }
//         Login to Docker Hub
        stage('Login to Docker Hub') {
            steps {
                sh 'echo $DOCKERHUB_CREDENTIALS_USR | docker login -u $DOCKERHUB_CREDENTIALS_PSW --password-stdin'
            }
        }

//         Push Image: Publicar a imagem Docker construída no DockerHub.
        stage('Push to Docker Hub') {
            steps {
                sh 'docker push geyson12345/webapp'
            }
        }





}