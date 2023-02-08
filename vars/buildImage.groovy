#!/usr/bin/env groovy

def call() {
    
    sh 'docker build -t yahia90/devops:my-appv2 .'    
}
