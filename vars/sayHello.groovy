#!/usr/bin/env groovy

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
  'checkout scm'
}

def addNumber(Integer var1 = 10) {
  def x= 5
  x + var1
}

