#!/bin/bash
export JAVA_HOME=/usr/lib/jvm/java-7-openjdk-amd64/jre
export EC2_HOME=/opt/aws/current
export EC2_PRIVATE_KEY=/home/root/private/keys/xxx.pem
export EC2_CERT=/home/root/private/keys/xxx.pem
export AWS_ACCESS_KEY_ID="xxx"
export AWS_SECRET_ACCESS_KEY="xxx"
DATE=`/bin/date +"%Y-%m-%d_%T"`
$EC2_HOME/bin/ec2-create-snapshot vol-0a28142c --description "GitData_Snapshot_$DATE" --region us-west-2
