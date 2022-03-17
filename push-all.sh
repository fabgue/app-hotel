#!/bin/bash

if [[ -z "$1" ]]; then
 echo "message is required" 1>&2
 exit 1
fi

git config --get user.email
git config --get user.name 

git status
git add -A
git commit -m "$1"
git push -u origin develop
