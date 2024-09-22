## 本项目实现的最终作用是基于SSH图书管理系统
## 分为2个角色
### 第1个角色为管理员角色，实现了如下功能：
 - 图书借阅
 - 图书借阅查询
 - 图书分类管理
 - 图书归还
 - 图书管理
 - 管理员登录
 - 管理员管理
 - 系统角色设置
 - 读者管理
 - 逾期处理
### 第2个角色为用户角色，实现了如下功能：
 - 个人资料修改
 - 查看逾期信息
 - 查询我的借阅信息
 - 用户登录
 - 用户首页
## 数据库设计如下：
# 数据库设计文档

**数据库名：** ssh_library_ystem

**文档版本：** 


| 表名                  | 说明       |
| :---: | :---: |
| [admin](#admin) | 管理员表 |
| [authorization](#authorization) |  |
| [backinfo](#backinfo) |  |
| [book](#book) | 图书信息表 |
| [booktype](#booktype) | 图书类型表 |
| [borrowinfo](#borrowinfo) |  |
| [forfeitinfo](#forfeitinfo) |  |
| [reader](#reader) |  |
| [readertype](#readertype) |  |
| [test](#test) |  |

**表名：** <a id="admin">admin</a>

**说明：** 管理员表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | aid |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | username |   varchar   | 255 |   0    |    N     |  N   |       | 用户名  |
|  3   | name |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 名字  |
|  4   | pwd |   varchar   | 64 |   0    |    Y     |  N   |   NULL    | 密码  |
|  5   | phone |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 手机号码  |
|  6   | state |   int   | 10 |   0    |    Y     |  N   |   1    |   |

**表名：** <a id="authorization">authorization</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | aid |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | bookSet |   int   | 10 |   0    |    Y     |  N   |   0    |   |
|  3   | readerSet |   int   | 10 |   0    |    Y     |  N   |   0    |   |
|  4   | borrowSet |   int   | 10 |   0    |    Y     |  N   |   0    |   |
|  5   | typeSet |   int   | 10 |   0    |    Y     |  N   |   0    |   |
|  6   | backSet |   int   | 10 |   0    |    Y     |  N   |   0    |   |
|  7   | forfeitSet |   int   | 10 |   0    |    Y     |  N   |   0    |   |
|  8   | sysSet |   int   | 10 |   0    |    Y     |  N   |   0    |   |
|  9   | superSet |   int   | 10 |   0    |    Y     |  N   |   0    |   |

**表名：** <a id="backinfo">backinfo</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | borrowId |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | backDate |   datetime   | 19 |   0    |    Y     |  N   |   NULL    |   |
|  3   | aid |   int   | 10 |   0    |    Y     |  N   |   NULL    |   |

**表名：** <a id="book">book</a>

**说明：** 图书信息表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | bookId |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | bookName |   varchar   | 255 |   0    |    N     |  N   |       | 图书名称  |
|  3   | ISBN |   varchar   | 255 |   0    |    N     |  N   |       |   |
|  4   | autho |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  5   | num |   int   | 10 |   0    |    N     |  N   |       | 数量  |
|  6   | currentNum |   int   | 10 |   0    |    N     |  N   |       |   |
|  7   | press |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  8   | description |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  9   | price |   double   | 23 |   0    |    N     |  N   |       | 价格  |
|  10   | putdate |   datetime   | 19 |   0    |    Y     |  N   |   NULL    |   |
|  11   | typeId |   int   | 10 |   0    |    Y     |  N   |   NULL    |   |
|  12   | aid |   int   | 10 |   0    |    Y     |  N   |   NULL    |   |

**表名：** <a id="booktype">booktype</a>

**说明：** 图书类型表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | typeId |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | typeName |   varchar   | 255 |   0    |    N     |  N   |       |   |

**表名：** <a id="borrowinfo">borrowinfo</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | borrowId |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | borrowDate |   datetime   | 19 |   0    |    Y     |  N   |   NULL    |   |
|  3   | endDate |   datetime   | 19 |   0    |    Y     |  N   |   NULL    |   |
|  4   | overday |   int   | 10 |   0    |    Y     |  N   |   0    |   |
|  5   | state |   int   | 10 |   0    |    Y     |  N   |   0    |   |
|  6   | readerId |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  7   | bookId |   int   | 10 |   0    |    Y     |  N   |   NULL    |   |
|  8   | penalty |   double   | 23 |   0    |    N     |  N   |       |   |
|  9   | aid |   int   | 10 |   0    |    Y     |  N   |   NULL    |   |

**表名：** <a id="forfeitinfo">forfeitinfo</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | borrowId |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | forfeit |   double   | 23 |   0    |    Y     |  N   |   NULL    |   |
|  3   | isPay |   int   | 10 |   0    |    Y     |  N   |   0    |   |
|  4   | aid |   int   | 10 |   0    |    Y     |  N   |   NULL    |   |

**表名：** <a id="reader">reader</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | readerId |   varchar   | 255 |   0    |    N     |  Y   |       |   |
|  2   | pwd |   varchar   | 64 |   0    |    N     |  N   |       | 密码  |
|  3   | name |   varchar   | 255 |   0    |    N     |  N   |       | 名字  |
|  4   | paperNO |   varchar   | 255 |   0    |    N     |  N   |       |   |
|  5   | phone |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 手机号码  |
|  6   | email |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 邮箱  |
|  7   | createTime |   datetime   | 19 |   0    |    Y     |  N   |   NULL    | 创建时间  |
|  8   | readerTypeId |   int   | 10 |   0    |    Y     |  N   |   NULL    |   |
|  9   | aid |   int   | 10 |   0    |    Y     |  N   |   NULL    |   |

**表名：** <a id="readertype">readertype</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | readerTypeId |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | readerTypeName |   varchar   | 255 |   0    |    N     |  N   |       |   |
|  3   | maxNum |   int   | 10 |   0    |    N     |  N   |       |   |
|  4   | bday |   int   | 10 |   0    |    N     |  N   |       |   |
|  5   | penalty |   double   | 23 |   0    |    N     |  N   |       |   |
|  6   | renewDays |   int   | 10 |   0    |    N     |  N   |       |   |

**表名：** <a id="test">test</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | a |   int   | 10 |   0    |    Y     |  N   |   NULL    |   |

