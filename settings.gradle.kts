import java.util.Locale

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://repo.papermc.io/repository/maven-public/")
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.9.0"
}

if (!file(".git").exists()) {
    val errorText = """
        
        =====================[ ERROR ]=====================
         The Chlorophyll project directory is not a properly cloned Git repository.
         
         In order to build Chlorophyll from source you must clone
         the Chlorophyll repository using Git, not download a code
         zip from GitHub.
         
         Built Chlorophyll jars are available for download at
         https://github.com/Biquaternions/Chlorophyll
         
         See https://github.com/Biquaternions/Chlorophyll/blob/HEAD/CONTRIBUTING.md
         for further information on building and modifying Chlorophyll.
        ===================================================
    """.trimIndent()
    error(errorText)
}

rootProject.name = "chlorophyll"
for (name in listOf("chlorophyll-api", "chlorophyll-server")) {
    val projName = name.lowercase(Locale.ENGLISH)
    include(projName)
    findProject(":$projName")!!.projectDir = file(name)
}
