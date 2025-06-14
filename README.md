
![LLVM-Logo-Derivative-4.png](http://llvm.org/img/LLVM-Logo-Derivative-4.png)
# LLVM Intellij Plugin [![Build Status](https://travis-ci.org/snefru/io.vypa.llvm.svg?branch=master)](https://travis-ci.org/snefru/io.vypa.llvm)
                      
[LLVM](http://llvm.org) [Intellij](http://www.jetbrains.org/pages/viewpage.action?pageId=983889) Editor Plugin


## Overview

### Grammar

Underlying grammar defined in the following [Syntax Diagrams](http://snefru.github.io/io.alef.llvm/syntax-diagrams.xhtml).

### Snapshots

![overview](./images/overview.png)


## To Install as a Plugin

* Download and install [IntelliJ Community Edition (Free) or Ultimate (Paid) ](https://www.jetbrains.com/idea/download/) 
* Go to Preferences > Plugins > Browse Repositories and search For "LLVM" 
* Click install 
* Click restart intellij

Alternatively 
* Download the [plugin jar](https://plugins.jetbrains.com/plugin/9283) to your local disk
*  Go to Preferences > Plugins > Install plugin from disk and choose the file you downloaded


## To Develop

### Requirements

1. [Java 17](https://jdk.java.net/17/)
2. [Gradle](https://gradle.org)
3. [CLion 2024.1](https://www.jetbrains.com/clion/)

### To Run
   
    git clone https://github.com/snefru/io.vypa.llvm.git
    cd io.vypa.llvm
    gradle runIde
    Configure the Project SDK to point to the root of the local LLVM installation

## References
1. [LLVM Language Reference Manual](http://llvm.org/docs/LangRef.html)
2. [LLVM Logos and Usage Rights](http://llvm.org/Logo.html)
3. [Go Language Plugin](https://github.com/go-lang-plugin-org/go-lang-idea-plugin)
