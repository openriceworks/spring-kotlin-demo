# Spring Boot + Kotlin

- Java 21
- Kotlin 1.9.23

## DB 準備

```sh
cd db
docker-compose up -d
```

## 再起動機能について

`spring-devtools`を入れているので起動中に再ビルドされると、実行中のSpring Bootアプリケーションが再起動される。
ただし、コード変更時にはビルドしていないので、[workspace](./spring-kotlin-demo.code-workspace)に記載した`build`タスクを実行しビルドさせる必要がある。