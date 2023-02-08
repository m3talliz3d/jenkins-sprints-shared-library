#!/usr/bin/env groovy

def call() {

  withCredentials([usernamePassword(credentialsId:"docker-hub",usernameVariable:"USERNAME",passwordVariable:"PASSWORD")]){       
                sh 'docker login --username $USERNAME --password $PASSWORD'
               
}
