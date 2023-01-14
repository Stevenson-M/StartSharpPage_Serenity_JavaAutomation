#!groovy
import java.text.SimpleDateFormat

def formato = new SimpleDateFormat("yyyyMMddHHmm")
def fecha = new Date()
def tiempo = formato.format(fecha).toString()

pipeline {
    agent any
    stages {
        stage('Conexion Git') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: '0000001', url: 'https://github.com/Stevenson-M/choucairTechnicalAutomationTest.git']]])
            }
        }

        stage('Test') {
            steps {
                script {
                    try {
                        bat("gradle clean test aggregate")
                        echo 'Ejecucion de pruebas exitosa'

                    } catch (e) {
                        echo 'Ejecucion de pruebas fallida'

                    }
                }
            }
        }

        stage('Generar Evidencias') {
            steps {
                script {
                    try {
                        bat " rename \"${WORKSPACE}\\target\" serenity_${tiempo}"

                        publishHTML([allowMissing         : false,
                                     alwaysLinkToLastBuild: true,
                                     keepAll              : true,
                                     reportDir            : "${WORKSPACE}//serenity_${tiempo}/site/serenity",
                                     reportFiles          : 'index.html',
                                     reportName           : 'Test Demo serenity evidencias ',
                                     reportTitles         : 'Serenity demo Proyecto'])
                        echo 'Reporte generado exitosamente'
                    } catch (e) {
                        publishHTML([allowMissing         : false,
                                     alwaysLinkToLastBuild: true,
                                     keepAll              : true,
                                     reportDir            : "${WORKSPACE}//target/serenity_${tiempo}",
                                     reportFiles          : 'index.html',
                                     reportName           : 'Test Demo serenity evidencias ',
                                     reportTitles         : 'Serenity demo Proyecto'])
                        echo 'Reporte generado exitosamente'
                    }
                }
            }
        }


        stage('Analisis del sonar') {
            steps {
                script {
                    scannerHome = tool 'SonarQubeScanner'
                }
                withSonarQubeEnv('sonarQube')
                        {
                            bat 'sonar-scanner'
                        }
            }
        }
    }
}