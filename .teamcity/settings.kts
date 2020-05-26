import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.MavenBuildStep
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script

/*
The settings script is an entry point for defining a TeamCity
project hierarchy. The script should contain a single call to the
project() function with a Project instance or an init function as
an argument.

VcsRoots, BuildTypes, Templates, and subprojects can be
registered inside the project using the vcsRoot(), buildType(),
template(), and subProject() methods respectively.

To debug settings scripts in command-line, run the

    mvnDebug org.jetbrains.teamcity:teamcity-configs-maven-plugin:generate

command and attach your debugger to the port 8000.

To debug in IntelliJ Idea, open the 'Maven Projects' tool window (View
-> Tool Windows -> Maven Projects), find the generate task node
(Plugins -> teamcity-configs -> teamcity-configs:generate), the
'Debug' option is available in the context menu for the task.
*/

version = "2020.1"

project {

    buildType(RunTests)

    features {
        feature {
            id = "PROJECT_EXT_69"
            type = "OAuthProvider"
            param("clientId", "2280447103.1138299994726")
            param("secure:clientSecret", "credentialsJSON:6e14cfcf-ad9a-42d7-bc27-6cc0dbdade59")
            param("displayName", "Slack Test")
            param("secure:token", "credentialsJSON:0f24ef40-f107-4c0b-8bcf-0ddec3c92b25")
            param("providerType", "slackConnection")
        }
    }
}

object RunTests : BuildType({
    name = "run tests"
    paused = true

    vcs {
        root(DslContext.settingsRoot)
    }

    steps {
        script {
            name = "hello world"
            enabled = false
            scriptContent = "echo hello world"
            param("teamcity.runAs.windowsIntegrityLlevel", "auto")
            param("teamcity.runAs.loggingLevel", "off")
        }
        maven {
            goals = "clean test"
            runnerArgs = "-Dmaven.test.failure.ignore=true"
            localRepoScope = MavenBuildStep.RepositoryScope.MAVEN_DEFAULT
            param("teamcity.runAs.windowsIntegrityLlevel", "auto")
            param("teamcity.runAs.loggingLevel", "off")
        }
    }
})
