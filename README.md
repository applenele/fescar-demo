# fescar-demo
fescar  spring boot 示例

## 步骤
1. 启动 fescar中的server 
下载：https://github.com/alibaba/fescar/releases
```bash
sh fester-server.sh  /User/min.ji/Downloads/data
```
2. 执行sql语句创建数据库
- 依次执行fescar-xx.sql
- 每个数据库都执行fescar.sql

3. 启动server-xx服务
- 依次启动每个服务
- 访问 localhost:8073/user/addUser?userName=demo