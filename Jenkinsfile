pipeline {
    agent {
        docker {
            image 'katalonstudio/katalon'
            args "-u root"
        }
    }
    stages {
        stage('Test') {
            steps {
                sh 'katalonc.sh -retry=0 -testSuitePath="Test Suites/Basic Functionality/Procore Basic Functionality Tests" -executionProfile="default" -browserType="Chrome" -apiKey="8a97c49d-dba8-4bb7-8873-02a5e69177bd"'
            }
        }
    }
    post {
        always {
            archiveArtifacts artifacts: 'report/**/*.*', fingerprint: true
            junit 'report/**/JUnit_Report.xml'
        }
    }
}