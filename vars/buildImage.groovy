#!/usr/bin/env groovy

def call() {
    
    echo " build dockerfile "
    sh 'docker build -t yahia90/devops:my-appv2 .'    
}
