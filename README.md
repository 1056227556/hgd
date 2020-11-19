# 幻の国

----
## 项目路径

    ├─doc //项目文档
    └─src
       ├─main
       │  ├─java
       │  │  └─com
       │  │      └─lxjn
       │  │          └─hgd
       │  │              ├─config //配置类
       │  │              ├─module //业务模块
       │  │              │  └─model //model业务
       │  │              │      ├─controller
       │  │              │      ├─entity
       │  │              │      ├─mapper
       │  │              │      └─service
       │  │              │          └─impl
       │  │              ├─schedule //定时任务
       │  │              │  └─model // model业务相关的定时任务
       │  │              └─util //通用工具类
       │  └─resources //资源文件
       │      ├─data //初始化的sql文件
       │      ├─mapper //mybatis映射xml
       │      │  └─model //按业务模块分文件夹
       │      └─static //静态资源文件
       └─test
           └─java
               └─main

----
## 项目开发规范
1. 前端页面发出的请求以 `/m/***` 开头
2. 图片、文件等非前端的静态资源请求以 `/uploads/***` 开头
3. 对外的http接口请求以 `/api/***` 开头
4. 数据库表名称和字段名称统一使用小写字母命名，单词间使用 `_` 分割
5. 所有表都要有 `id` 、 `创建人` 、 `创建时间` 、 `最后修改人` 、 `修改时间` 、 `排序` 字段

----
