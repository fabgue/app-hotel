#!/bin/bash

if [[ -z "$1" ]]; then
 echo "message is required" 1>&2
 exit 1
fi

git status
git add -A
git commit -m "$1"
git push -u origin develop
