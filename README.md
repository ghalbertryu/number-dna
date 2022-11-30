# number-dna
數字易經工具，可以將字串或數字轉換成數字易經的屬性組合
把數字易經的規則邏輯化讓程式分析字串順便練習使用 TDD 方式開發
- 使用 TDD 的方式開發

Rule ref:
http://c91339.pixnet.net/blog/post/18447816-%E6%95%B8%E5%AD%97%E6%98%93%E7%B6%93-%E7%94%9F%E5%91%BD%E9%9D%88%E6%95%B8-dna-%E6%95%B8%E5%AD%97%E8%A7%A3%E6%9E%90%E6%B3%95

## Run
org.albertryu.numberdna.NumberDNARunner.main

Result Example
```
/Users/albertryu/Library/Java/JavaVirtualMachines/azul-1.8.0_322/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=59246:/Applications/IntelliJ IDEA CE.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Users/albertryu/Library/Java/JavaVirtualMachines/azul-1.8.0_322/Contents/Home/jre/lib/charsets.jar:/Users/albertryu/Library/Java/JavaVirtualMachines/azul-1.8.0_322/Contents/Home/jre/lib/ext/cldrdata.jar:/Users/albertryu/Library/Java/JavaVirtualMachines/azul-1.8.0_322/Contents/Home/jre/lib/ext/dnsns.jar:/Users/albertryu/Library/Java/JavaVirtualMachines/azul-1.8.0_322/Contents/Home/jre/lib/ext/jaccess.jar:/Users/albertryu/Library/Java/JavaVirtualMachines/azul-1.8.0_322/Contents/Home/jre/lib/ext/legacy8ujsse.jar:/Users/albertryu/Library/Java/JavaVirtualMachines/azul-1.8.0_322/Contents/Home/jre/lib/ext/localedata.jar:/Users/albertryu/Library/Java/JavaVirtualMachines/azul-1.8.0_322/Contents/Home/jre/lib/ext/nashorn.jar:/Users/albertryu/Library/Java/JavaVirtualMachines/azul-1.8.0_322/Contents/Home/jre/lib/ext/openjsse.jar:/Users/albertryu/Library/Java/JavaVirtualMachines/azul-1.8.0_322/Contents/Home/jre/lib/ext/sunec.jar:/Users/albertryu/Library/Java/JavaVirtualMachines/azul-1.8.0_322/Contents/Home/jre/lib/ext/sunjce_provider.jar:/Users/albertryu/Library/Java/JavaVirtualMachines/azul-1.8.0_322/Contents/Home/jre/lib/ext/sunpkcs11.jar:/Users/albertryu/Library/Java/JavaVirtualMachines/azul-1.8.0_322/Contents/Home/jre/lib/ext/zipfs.jar:/Users/albertryu/Library/Java/JavaVirtualMachines/azul-1.8.0_322/Contents/Home/jre/lib/jce.jar:/Users/albertryu/Library/Java/JavaVirtualMachines/azul-1.8.0_322/Contents/Home/jre/lib/jfr.jar:/Users/albertryu/Library/Java/JavaVirtualMachines/azul-1.8.0_322/Contents/Home/jre/lib/jsse.jar:/Users/albertryu/Library/Java/JavaVirtualMachines/azul-1.8.0_322/Contents/Home/jre/lib/management-agent.jar:/Users/albertryu/Library/Java/JavaVirtualMachines/azul-1.8.0_322/Contents/Home/jre/lib/resources.jar:/Users/albertryu/Library/Java/JavaVirtualMachines/azul-1.8.0_322/Contents/Home/jre/lib/rt.jar:/Users/albertryu/Library/Java/JavaVirtualMachines/azul-1.8.0_322/Contents/Home/lib/dt.jar:/Users/albertryu/Library/Java/JavaVirtualMachines/azul-1.8.0_322/Contents/Home/lib/jconsole.jar:/Users/albertryu/Library/Java/JavaVirtualMachines/azul-1.8.0_322/Contents/Home/lib/tools.jar:/Users/albertryu/coding/number-dna/out/production/number-dna:/Users/albertryu/.m2/repository/junit/junit/4.13.1/junit-4.13.1.jar:/Users/albertryu/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar org.albertryu.numberdna.NumberDNARunner
[11, 12, 22, 22, 22, 11, 18, 82, 22, 11, 18, 82, 22, 21]
[伏位, 絕命, 伏位, 伏位, 伏位, 伏位, 五鬼, 生氣, 伏位, 伏位, 五鬼, 生氣, 伏位, 絕命]
最多屬性：[伏位]x[8]
次多屬性：[五鬼]x[2]
```

## UnitTest
org.albertryu.numberdna.NumberDNATest

## Changelog
### 2022-11-30
- 根據現在對程式的理解重構修改 package 分類
