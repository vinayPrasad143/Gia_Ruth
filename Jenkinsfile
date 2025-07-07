pipeline {
    agent any

    environment {
        // Replace this with your real email address
        EMAIL_RECIPIENTS = 'vinayprasad.testy@gmail.com'
    }

    stages {
        stage('Dummy Stage') {
            steps {
                echo 'Running a dummy stage for email test...'
            }
        }
    }

    post {
        always {
            emailext (

                subject: "Jenkins Email Test: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                body: """<p>Hi,</p>
                    <p>This is a test email from Jenkins pipeline.</p>
                    <p><b>Job:</b> ${env.JOB_NAME}</p>
                    <p><b>Build:</b> <a href="${env.BUILD_URL}">${env.BUILD_URL}</a></p>
                """,
                recipientProviders: [[$class: 'DevelopersRecipientProvider']]
                to: "${EMAIL_RECIPIENTS}",
                mimeType: 'text/html'

            )
        }
    }
}