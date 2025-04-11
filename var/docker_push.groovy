def call(String ProjectName, String ImageTag, String dockerHubUser){
  withCredentials([usernamePassword(credentialsId:'dockercred',passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")]){
    sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
    sh "docker push ${env.dockerHubUser}/${ProjectName}:latest"
    }
  }
