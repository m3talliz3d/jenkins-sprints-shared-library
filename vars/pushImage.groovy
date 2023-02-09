#!/usr/bin/env groovy

def call() {
     echo " push image to dockerhub repo " 
     sh "docker push  yahia90/devops:{env.BUILD_NUMBER}"
}
