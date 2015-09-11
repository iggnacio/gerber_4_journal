#!/bin/bash

echo "commint:"
read commint
do git add *;
do git commit -m "$commit" ;
do git push origin master;
done

