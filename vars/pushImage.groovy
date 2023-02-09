#!/usr/bin/env groovy

def call() {
     echo " push my-appv2 to dockerhub repo " 
     sh "docker push  yahia90/devops:my-appv2"
}
