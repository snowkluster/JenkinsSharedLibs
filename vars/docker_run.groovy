def call(int port,String containerName,String imageName) {
    sh "docker run -p ${port}:${port} --name ${containerName} ${imageName}"
}