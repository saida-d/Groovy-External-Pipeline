
// block could be your git repo
def stageCheckout(){
  echo "Repository checkout stage - Completed"
}

// block for build stage 
def stageBuild(){
  echo "Build stage - Completed"
}

// block for testing stage
def stageTest(){
  echo "Test stage - Completed"

}

// block for production deploy /k8s/docker swarm deploy
def stageProdDeploy(){
  echo "Production deploy - Completed & version is ${params.VERSION}"

}


