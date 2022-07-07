# 一个基于 SpringBoot + Spring Cloud Alibaba 的项目


本地创建分支并推送到远程
## 本地创建分支
$ git checkout -b v0.1
## 推送到远程
$ git push origin v0.1:v0.1
##  查看远程分支
$ git branch -a

删除远程分支
## 推送一个空分支到远程
$ git push origin :v0.1
## 直接删除远程分支
$ git push origin --delete v0.1

## 暂存及暂存释放
$ git stash pop