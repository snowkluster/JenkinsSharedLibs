def call(){
    echo "Running docker build"
    sh "docker build -t build-app:latest ."
    echo "build successful"
}
