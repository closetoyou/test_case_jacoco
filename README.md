# test_case_jacoco
<h2>1.介绍</h2>
jacoco用于检测单元测试对应的代码覆盖率.本工程是样例工程，可查看pom.xml配置.</br>
</br>
<h2>2.如何运行</h2>
mvn install</br>
</br>
可以动态修改阀值：</br>
mvn install -Djacoco.method.percent=0.70 </br>
可调参数如下：</br>
jacoco.method.percent #方法覆盖率百分比</br>
jacoco.instruction.percent #指令覆盖率百分比</br>
jacoco.line.percent #代码行覆盖率百分比</br>
jacoco.class.missCount #允许未检测的类个数</br>
</br>
如果打包过程中单元测试覆盖率低于阀值，install会失败。 </br>

运行成功后运行 target\site\jacoco\index.html


jacoco官网： http://www.eclemma.org/jacoco/trunk/index.html</br>



