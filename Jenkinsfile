pipeline {
    agent  any

    stages {
        stage('Prepare') {
            steps {
                checkout scm
            }
        }

        stage('Run tests') {
            steps {
                dir('cucumber_sexyHot'){
                  sh '${MAVEN_HOME}/bin/mvn test -Djenkins'
                }
            }
        }

        stage('Generate report') {
            steps {
                cucumber buildStatus: 'UNSTABLE',
                        fileIncludePattern: '**/CucumberReport.json',
                        trendsLimit: 10,
                        classifications: [
                                [
                                        'key': 'Browser',
                                        'value': 'Firefox'
                                ]
                        ]
            }
        }
    }
    post {
        always {
            echo 'Cleaning Workspace'

        }
        success {
            echo 'Successfully!'
        }
        failure {
            echo 'Failed!'
        }
        unstable {
            echo 'This will run only if the run was marked as unstable'
        }
        changed {
            echo 'This will run only if the state of the Pipeline has changed'
        }
    }
}
