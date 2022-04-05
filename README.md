# Spring Boot 多模块脚手架

## 如何使用
(1) 在项目根目录执行 `mvn clean install` 命令
```shell
mvn clean install
```
(2) 执行命令 `mvn archetype:crawl`。这一步的目的是让maven能够找到该项目并且知道它是个骨架项目，因为仅安装到本地仓库中，maven还是没有更新所有骨架的列表，所以该命令，能够让maven对本地仓库中所有项目进行一次遍历，并且找到其中可以作为 archetype的的项目，将这些信息保存到仓库下的 archetype-catalog.xml文件中。
```shell
mvn archetype:crawl
```
