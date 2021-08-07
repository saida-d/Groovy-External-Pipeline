// global variable 
def gv

pipeline{
  // agent refers jenkins master or slave/node
  agent any
  
  parameters{
    // these are sample params i define here for you to show how to call inside stages
    choice(name:'VERSION',choices:['1.0','2.0','3.0'],description:'App version choice')
    booleanParam(name:'testStage',defaultValue:true,description:'yes or no for respective stage control')
  }
  
  stages{
    stage('init'){
      // to load external groovy file here
      steps{
        script{
          gv= load "script.groovy"
        }
      }
    }
    stage('checkout'){
      steps{
        script{
          gv.stageCheckout()
        }
      }
    }
    stage('build'){
      steps{
        script{
          gv.stageBuild()
        }
      }
    }
    stage('Testing'){
      steps{
        script{
         gv.stageTest()
        }
      }
    }
    
     stage('Prod.Deploy'){
      steps{
        script{
         gv.stageProdDeploy()
        }
      }
    }
    
    
  }
}
