#!/usr/bin/env bash
v=`pwd`/..;
st=$v/src/main/resources/static;
ap=$v/blogapp;

rm -rf $st 2>/dev/null;
mkdir -p $st;
cd $ap;
npm install;
ionic cordova build browser --optimizejs --minifycss --minifyjs --prod --release
cp -R www/* $st/
cd $v;