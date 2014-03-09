#!/bin/bash
AWS_ACCESS_KEY_ID="xxx"
AWS_SECRET_ACCESS_KEY="xxx"

/home/root/bin/ec2-prune-snapshots --aws-access-key-id $AWS_ACCESS_KEY_ID --aws-secret-access-key $AWS_SECRET_ACCESS_KEY --region xxx-region --months 1 --weeks 1 --days 2 vol-xxx
