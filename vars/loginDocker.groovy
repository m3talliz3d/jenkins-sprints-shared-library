def call() {
  
  echo " login to dockerhub repo "
  withCredentials([usernamePassword(credentialsId:"docker-hub",usernameVariable:"USERNAME",passwordVariable:"PASSWORD")]){       
                sh 'docker login --username $USERNAME --password $PASSWORD'
               
     }
}
  
  
