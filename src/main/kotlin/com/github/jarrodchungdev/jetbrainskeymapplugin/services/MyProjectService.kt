package com.github.jarrodchungdev.jetbrainskeymapplugin.services

import com.intellij.openapi.project.Project
import com.github.jarrodchungdev.jetbrainskeymapplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
