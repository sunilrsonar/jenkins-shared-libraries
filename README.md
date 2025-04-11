IN PIPELINE

@Library("shared") _

stage("Hello"){
  steps{
    scripts{
      hello()
      }
    }
}
