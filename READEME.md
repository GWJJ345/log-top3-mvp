# Log Top 3 MVP

这是一个用来练手的 Java 极小化可行产品（MVP）。
不依赖任何框架，纯 Java 实现。

## 功能
读取 `behavior.log` 文件，统计每个商品的点击次数，并输出点击量最高的前 3 名。

## 怎么运行
1. 确保电脑安装了 JDK。
2. 将项目拉取到本地，在 IDEA 中打开。
3. 直接运行 `BehaviorLogTopN.java` 中的 `main` 方法。
4. 或者在终端执行：
   javac BehaviorLogTopN.java
   java BehaviorLogTopN

## 预期输出
itemA -> 5 次
itemB -> 3 次
itemC -> 2 次

## 为什么做这个
为了实践“极小化 MVP”的学习路径，先跑通一个自己能完全解释清楚的基础版本，后续再逐步加入异常处理、线程池等功能。