asuna
============================================
[![codecov](https://codecov.io/gh/scalax/asuna/branch/master/graph/badge.svg)](https://codecov.io/gh/scalax/asuna)
[![Build Status](https://travis-ci.org/scalax/asuna.svg?branch=master)](https://travis-ci.org/scalax/asuna)

An abstraction of data transformation  
一个数据转换的抽象

-----------------

This document will be written in English for a period of Chinese
 since my poor English. Welcome to create any typo pull request
 to asuna.  
因为我的英语十分差，这份文档会以一段英文一段中文的形式撰写。欢迎大家提交任何文档更改到
asuna。

### What's asuna?

Asuna is an abstraction of data transformation. Now it's a subset
of [shapeless](https://github.com/milessabin/shapeless "shapeless"). Which
only handle case class generic and sealed trait generic problems.  
Asuna 是一个数据转换的抽象。目前而言它是
[shapeless](https://github.com/milessabin/shapeless "shapeless")
的子集，只针对 case class 和 sealed trait 的 generic 问题作出一个解决方案。

### Why type projection?

Asuna is a project that deeply dependent on Type Projection.
Type Projection will be removed in Scala3, but why we still used Type Projection?  
Ausna 是一个深度依赖于 Type Projection 的项目. Type Projection
将会在 Scala3 被移除，但我们为什么仍然使用了 Type Projectoin？

- Compile very fast. A natural number structure based on iterations is
discarded, and a finite tuple structure is used instead. Then the
compilation speed is improved qualitatively. In my test case,
compiling two mutually dependent 100-field case classes into a
circe encoder takes only 2 seconds. Which circe use 20s.  
编译速度十分快。抛弃了基于逐个迭代的自然数结构，转而使用基于有限的元组结构，
编译速度得到了质的提升。在一个测试用例中，把两个互相有依赖的 100 字段 case class
编译成 circe encoder 仅需 2 秒，而 circe 则需要 20 秒。

- Code writing is simpler. Most of the code can be generated by
IntelliJ IDEA and then populated based on type hints.  
代码编写更简单。大部分代码可以通过 IntelliJ IDEA 生成，然后根据类型提示进行填充。

- No dependent type(Just a bit in when generic boot).  
没有 Dependent Type（只有一点 Dependent Type 存在于 Generic 引导的时候）。

- No similar type style found in [dotty](https://github.com/lampepfl/dotty "dotty").  
在 dotty 中找不到类似的类型风格。

### Tutorial

#### 1.Type Projection Model

Look at such a Trait.  
观察这样一个 Trait。

```scala
trait TypeParameter {
  type H
  type T <: TypeParameter
}
```

We give it an end type.  
我们给它一个结束类型。

```scala
class NoData

class EndParameter extends TypeParameter {
  override type H = NoData
  override type T = EndParameter
}
```

理论上它可以存储无限个类型参数。
```scala
aa
```