package com.example

public class SharedLib {

int addNumber() {
      sh 'echo Welcome to shared library'
      def x = 5
      return x + 10;
   }
}
