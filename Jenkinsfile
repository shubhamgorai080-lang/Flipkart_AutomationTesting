pipeline {
 
    agent any
 
    tools {
        // 1. Updated to match your exact tool configuration name (JDK17)
        jdk 'JDK17'
        maven 'Maven3'
        git 'Default' 
    }
 
    stages {
 
        stage('Git Checkout') {
            steps {
                // 2. Pointing to your actual GitHub repository URL and main branch
                git branch: 'main', url: 'https://github.com/shubhamgorai080-lang/Flipkart_AutomationTesting.git'
            }
        }
 
        stage('Clean Project') {
            steps {
                bat 'mvn clean'
            }
        }
 
        stage('Run Tests') {
            steps {
                // 3. CRITICAL: Added the failure ignore flag. Without this, if a test fails, 
                // Jenkins will skip the "Generate Reports" stage entirely.
                bat 'mvn test -Dmaven.test.failure.ignore=true'
            }
        }
 
        stage('Generate Reports') {
            steps {
                // 4. Fixed paths: Changed 'reports' directory to 'target' and pointed 
                // to your TestNG/Cucumber HTML output file.
                publishHTML([
                    allowMissing: true,
                    alwaysLinkToLastBuild: true,
                    keepAll: true,
                    reportDir: 'target',
                    reportFiles: 'cucumber-reports.html',
                    reportName: 'Extent Report'
                ])
            }
        }
    }
 
    post {
 
        always {
            // Updated to archive files from the 'target' directory safely
            archiveArtifacts artifacts: 'target/*.html', allowEmptyArchive: true
        }
 
        success {
            echo 'Pipeline Executed Successfully'
        }
 
        failure {
            echo 'Pipeline Failed'
        }
    }
}