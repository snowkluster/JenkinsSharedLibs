def call(String name){
    echo "Running docker build"
    sh "docker build -t ${name}:latest ."
    echo "build successful"
}
