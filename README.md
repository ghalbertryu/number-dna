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
