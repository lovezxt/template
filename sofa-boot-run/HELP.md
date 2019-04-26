# 项目介绍

## 一、基础框架使用SofaBoot3.1.3
### 1.健康检查
* [查看应用的运行时健康状态](http://localhost/actuator)
* [查看当前 SOFABoot 中使用 Maven 插件生成的版本信息汇总](http://localhost/actuator/versions)
* [查看应用 Readiness Check 的状况](http://localhost/actuator/readiness)
* [查看应用 健康状况](http://localhost/actuator/health)
### 2.模块隔离
模块隔离后，每个模块使用独立的 Spring 上下文，模块与模块间的 Bean 无法直接注入，需要通过 SOFA 服务进行通信,不同模块间调用参考：
* [模块配置](https://www.sofastack.tech/sofa-boot/docs/SOFABoot-Module)(如何将模块配置为SOFABoot认可的模块)
* [JVM 服务发布和引用](https://www.sofastack.tech/sofa-boot/docs/Module-Service)(一个 SOFABoot 应用内部各个 SOFABoot 模块之间的调用问题)
* [RPC 服务发布和引用](https://www.sofastack.tech/sofa-rpc/docs/Home)(多个 SOFABoot 应用之间的远程调用问题)
### 3.模块并行化加载
加速应用启动，也可以关闭并按照模块间互相依赖关系启动应用
* [设置模块之间的依赖关系并关闭并行化启动](https://www.sofastack.tech/sofa-boot/docs/parallel-start)(配置方法)
### 4.Spring Bean 异步初始化
SOFABoot 通过配置可选项，将 Bean 的初始化方法(init-method) 使用单独线程异步执行，加快 Spring 上下文加载过程，提高应用启动速度
* [Spring Bean 异步初始化](https://www.sofastack.tech/sofa-boot/docs/SpeedUpStartup)(异步初始化Bean配置方法)
### 5.日志空间隔离
中间件框架自动发现应用的日志实现依赖并独立打印日志，避免中间件和应用日志实现绑定
* [配置方法](https://github.com/alipay/sofa-common-tools)(配置sofa-common-tools)
### 6.类隔离(未引入)
当应用必须使用两个互相冲突的Jar包时可以引入类隔离模块,将其中一个Jar包和使用此Jar包的代码打包成一个 Ark 插件，然后让应用工程引入该插件依赖即可
### 7.测试
**(如果未引入类隔离，则只需使用SpringRunner、JUnit4即可)**
SOFABoot 推荐使用 SofaBootRunner、SofaJUnit4Runner 替代 SpringRunner、JUnit4 编写集成测试用例
SofaBootRunner、SofaJUnit4Runner 会检测应用是否引入sofa-ark-springboot-starter依赖，
如果检测到 sofa-ark-springboot-starter 依赖，
SofaBootRunner、SofaJUnit4Runner 会使用 SOFABoot 类隔离能力，否则和原生的 SpringRunner、JUnit4 无异；
### 8.分布式系统服务的发布和引用SOFA-RPC(未引入)
* [SofaBoot配置SOFA-RPC](https://www.sofastack.tech/sofa-rpc/docs/Getting-Started-with-SOFA-Boot)(如何在 SOFABoot 环境下应用 SOFA-RPC 进行服务的发布和引用)
