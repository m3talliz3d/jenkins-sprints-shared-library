#!/usr/bin/env groovy

def call() {
     pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'docker build -t yahia90/devops:my-appv2 .'
            }
     
}
