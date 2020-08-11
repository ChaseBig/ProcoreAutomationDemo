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
                sh 'katalonc.sh-runMode=console -retry=0 -testSuitePath="Test Suites/Basic Functionality/Procore Basic Functionality Tests" -executionProfile="default" -browserType="Chrome" -apiKey="3b42cdba-82ad-4048-bcaf-e0a4839285c0" --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true"'
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