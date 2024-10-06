def call(int port,String containerName,String imageName) {
    sh "docker run -d -p ${port}:${port} --name ${containerName} ${imageName}"
}