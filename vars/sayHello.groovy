#!/usr/bin/env groovy
@Library('pipeline-library')_

def call(String name = 'human') {
  echo "Hello, ${name}."
}

def clean() {
  sh 'mvn clean'
}

def build() {
  sh 'mvn install'
}

def test() {
  sh 'mvn test'
}

def checkoutSCM() {
  checkout scm
}

