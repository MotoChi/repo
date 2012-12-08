#!/bin/bash

#JENKINS CREDS
JENKINS_USER=ccaper
JENKINS_PASS=scIIby2!
JENKINS_TOKEN=6f6c970f11523e7f0ed71dbae90ba381
JENKINS_URL=54.245.83.189
JENKINS_PORT=8080

#Projects to trigger Jenkins builds
GIT_TEST=GitTest

#List of project to trigger Jenkins builds
JOBS=($GIT_TEST)

#Last git commit hash
LAST_COMMIT_HASH=`git log -1 HEAD --pretty=format:'%H'`

#Loop over all projects
for JOB in ${JOBS[@]}
do
  #Get last commit hash for project
  JOB_COMMIT_HASH=`git log -1 HEAD --pretty=format:'%H' -- $JOB`
  #Check if this project's last commit hash matches last overall repo commit hash
  if [ $LAST_COMMIT_HASH = $JOB_COMMIT_HASH ]
    then
      #Trigger remote Jenkins build for project
      wget --quiet --auth-no-challenge --http-user=$JENKINS_USER --http-password=$JENKINS_PASS http://$JENKINS_URL:$JENKINS_PORT/job/$JOB/build\?token=$JENKINS_TOKEN > /dev/null 2>&1
  fi
done