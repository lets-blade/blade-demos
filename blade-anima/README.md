# blade-anima

1. 导入数据库结构和数据 `resources/schema.sql`
2. 启动 `DBApplication.java`

## 测试

获取所有用户

```shell
curl -i http://127.0.0.1:9000/users

HTTP/1.1 200 OK
Content-Length: 391
Date: Tue, 27 Nov 2018 16:30:29 GMT
X-Powered-By: blade-2.0.12.BETA
Set-Cookie: SESSION=thiim3pjq4hvgpmf64ilj4hiei; Path=/; HTTPOnly
Content-Type: application/json; charset=UTF-8
Connection: keep-alive

{"payload":[{"id":1,"username":"jack","password":"aaa","realName":"杰克","age":32},{"id":2,"username":"rose","password":"999","realName":"螺丝","age":29},{"id":3,"username":"biezhi","password":"123556","realName":"魔王不造反","age":19},{"id":4,"username":"codesofun","password":"123556","realName":"代码真香","age":20}],"success":true,"msg":null,"code":0,"timestamp":1543307430}
```

添加一个用户

```shell
curl -X POST http://127.0.0.1:9000/users \
  -H 'Content-Type: application/json' \
  -d '{"username":"test","password":"123456","realName":"测试数据","age": 10}'

{"payload":5,"success":true,"msg":null,"code":0,"timestamp":1543307570}
```

删除一个用户

```shell
curl -X DELETE http://127.0.0.1:9000/user/5

{"payload":1,"success":true,"msg":null,"code":0,"timestamp":1543307647}
```