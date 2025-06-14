# Showcase for bug

# Scenario 1 - run CloudFunctionJsonApplication without JsonMapper bean declaration


### Error
``` 
2025-06-13T21:06:26.946-05:00  INFO 69218 --- [cloud-function-json] [           main] g.c.CloudFunctionJsonApplication         : Starting CloudFunctionJsonApplication using Java 21.0.1 with PID 69218 (/Users/ganesh.tiwari/IdeaProjects/serverless-java-container/samples/spark/cloud-function-json/build/classes/java/main started by ganesh.tiwari in /Users/ganesh.tiwari/IdeaProjects/serverless-java-container/samples/spark/cloud-function-json)
2025-06-13T21:06:26.948-05:00  INFO 69218 --- [cloud-function-json] [           main] g.c.CloudFunctionJsonApplication         : No active profile set, falling back to 1 default profile: "default"
2025-06-13T21:06:27.219-05:00  WARN 69218 --- [cloud-function-json] [           main] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: java.lang.IllegalStateException: Error processing condition on org.springframework.cloud.function.observability.ObservationAutoConfiguration
2025-06-13T21:06:27.222-05:00  INFO 69218 --- [cloud-function-json] [           main] .s.b.a.l.ConditionEvaluationReportLogger : 

Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
2025-06-13T21:06:27.230-05:00 ERROR 69218 --- [cloud-function-json] [           main] o.s.boot.SpringApplication               : Application run failed

java.lang.IllegalStateException: Error processing condition on org.springframework.cloud.function.observability.ObservationAutoConfiguration
	at org.springframework.boot.autoconfigure.condition.SpringBootCondition.matches(SpringBootCondition.java:60) ~[spring-boot-autoconfigure-3.5.0.jar:3.5.0]
	at org.springframework.context.annotation.ConditionEvaluator.shouldSkip(ConditionEvaluator.java:99) ~[spring-context-6.2.7.jar:6.2.7]
	at org.springframework.context.annotation.ConfigurationClassBeanDefinitionReader$TrackedConditionEvaluator.shouldSkip(ConfigurationClassBeanDefinitionReader.java:491) ~[spring-context-6.2.7.jar:6.2.7]
	at org.springframework.context.annotation.ConfigurationClassBeanDefinitionReader.loadBeanDefinitionsForConfigurationClass(ConfigurationClassBeanDefinitionReader.java:132) ~[spring-context-6.2.7.jar:6.2.7]
	at org.springframework.context.annotation.ConfigurationClassBeanDefinitionReader.loadBeanDefinitions(ConfigurationClassBeanDefinitionReader.java:121) ~[spring-context-6.2.7.jar:6.2.7]
	at org.springframework.context.annotation.ConfigurationClassPostProcessor.processConfigBeanDefinitions(ConfigurationClassPostProcessor.java:430) ~[spring-context-6.2.7.jar:6.2.7]
	at org.springframework.context.annotation.ConfigurationClassPostProcessor.postProcessBeanDefinitionRegistry(ConfigurationClassPostProcessor.java:290) ~[spring-context-6.2.7.jar:6.2.7]
	at org.springframework.context.support.PostProcessorRegistrationDelegate.invokeBeanDefinitionRegistryPostProcessors(PostProcessorRegistrationDelegate.java:349) ~[spring-context-6.2.7.jar:6.2.7]
	at org.springframework.context.support.PostProcessorRegistrationDelegate.invokeBeanFactoryPostProcessors(PostProcessorRegistrationDelegate.java:118) ~[spring-context-6.2.7.jar:6.2.7]
	at org.springframework.context.support.AbstractApplicationContext.invokeBeanFactoryPostProcessors(AbstractApplicationContext.java:791) ~[spring-context-6.2.7.jar:6.2.7]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:609) ~[spring-context-6.2.7.jar:6.2.7]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.5.0.jar:3.5.0]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:753) ~[spring-boot-3.5.0.jar:3.5.0]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:439) ~[spring-boot-3.5.0.jar:3.5.0]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:318) ~[spring-boot-3.5.0.jar:3.5.0]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1362) ~[spring-boot-3.5.0.jar:3.5.0]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1351) ~[spring-boot-3.5.0.jar:3.5.0]
	at gt.cloudfunctionjson.CloudFunctionJsonApplication.main(CloudFunctionJsonApplication.java:15) ~[main/:na]
Caused by: java.lang.IllegalStateException: Failed to introspect Class [org.springframework.cloud.function.context.config.ContextFunctionCatalogAutoConfiguration$JsonMapperConfiguration] from ClassLoader [jdk.internal.loader.ClassLoaders$AppClassLoader@4e0e2f2a]
	at org.springframework.util.ReflectionUtils.getDeclaredMethods(ReflectionUtils.java:483) ~[spring-core-6.2.7.jar:6.2.7]
	at org.springframework.util.ReflectionUtils.doWithMethods(ReflectionUtils.java:360) ~[spring-core-6.2.7.jar:6.2.7]
	at org.springframework.util.ReflectionUtils.getUniqueDeclaredMethods(ReflectionUtils.java:417) ~[spring-core-6.2.7.jar:6.2.7]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.lambda$getTypeForFactoryMethod$1(AbstractAutowireCapableBeanFactory.java:757) ~[spring-beans-6.2.7.jar:6.2.7]
	at java.base/java.util.concurrent.ConcurrentHashMap.computeIfAbsent(ConcurrentHashMap.java:1740) ~[na:na]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.getTypeForFactoryMethod(AbstractAutowireCapableBeanFactory.java:756) ~[spring-beans-6.2.7.jar:6.2.7]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.determineTargetType(AbstractAutowireCapableBeanFactory.java:689) ~[spring-beans-6.2.7.jar:6.2.7]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.predictBeanType(AbstractAutowireCapableBeanFactory.java:660) ~[spring-beans-6.2.7.jar:6.2.7]
	at org.springframework.beans.factory.support.AbstractBeanFactory.isFactoryBean(AbstractBeanFactory.java:1716) ~[spring-beans-6.2.7.jar:6.2.7]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doGetBeanNamesForType(DefaultListableBeanFactory.java:639) ~[spring-beans-6.2.7.jar:6.2.7]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBeanNamesForType(DefaultListableBeanFactory.java:599) ~[spring-beans-6.2.7.jar:6.2.7]
	at org.springframework.boot.autoconfigure.condition.OnBeanCondition.collectBeanDefinitionsForType(OnBeanCondition.java:322) ~[spring-boot-autoconfigure-3.5.0.jar:3.5.0]
	at org.springframework.boot.autoconfigure.condition.OnBeanCondition.getBeanDefinitionsForType(OnBeanCondition.java:314) ~[spring-boot-autoconfigure-3.5.0.jar:3.5.0]
	at org.springframework.boot.autoconfigure.condition.OnBeanCondition.getMatchingBeans(OnBeanCondition.java:214) ~[spring-boot-autoconfigure-3.5.0.jar:3.5.0]
	at org.springframework.boot.autoconfigure.condition.OnBeanCondition.evaluateConditionalOnBean(OnBeanCondition.java:153) ~[spring-boot-autoconfigure-3.5.0.jar:3.5.0]
	at org.springframework.boot.autoconfigure.condition.OnBeanCondition.getMatchOutcome(OnBeanCondition.java:128) ~[spring-boot-autoconfigure-3.5.0.jar:3.5.0]
	at org.springframework.boot.autoconfigure.condition.SpringBootCondition.matches(SpringBootCondition.java:47) ~[spring-boot-autoconfigure-3.5.0.jar:3.5.0]
	... 17 common frames omitted
Caused by: java.lang.NoClassDefFoundError: com/fasterxml/jackson/databind/Module
	at java.base/java.lang.Class.getDeclaredMethods0(Native Method) ~[na:na]
	at java.base/java.lang.Class.privateGetDeclaredMethods(Class.java:3578) ~[na:na]
	at java.base/java.lang.Class.getDeclaredMethods(Class.java:2676) ~[na:na]
	at org.springframework.util.ReflectionUtils.getDeclaredMethods(ReflectionUtils.java:465) ~[spring-core-6.2.7.jar:6.2.7]
	... 33 common frames omitted
Caused by: java.lang.ClassNotFoundException: com.fasterxml.jackson.databind.Module
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641) ~[na:na]
	at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188) ~[na:na]
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:526) ~[na:na]
	... 37 common frames omitted


Process finished with exit code 1

```


# Scenario 2 Added JsonMapper bean to bypass org.springframework.cloud.function.context.config.ContextFunctionCatalogAutoConfiguration.JsonMapperConfiguration.jsonMapper 


```
    @Bean
    JsonMapper gsonMapper(Gson gson) {
        return new GsonMapper(gson);
    }
```

### Error
``` 
2025-06-13T21:10:14.484-05:00  INFO 69319 --- [cloud-function-json] [           main] g.c.CloudFunctionJsonApplication         : Starting CloudFunctionJsonApplication using Java 21.0.1 with PID 69319 (/Users/ganesh.tiwari/IdeaProjects/serverless-java-container/samples/spark/cloud-function-json/build/classes/java/main started by ganesh.tiwari in /Users/ganesh.tiwari/IdeaProjects/serverless-java-container/samples/spark/cloud-function-json)
2025-06-13T21:10:14.485-05:00  INFO 69319 --- [cloud-function-json] [           main] g.c.CloudFunctionJsonApplication         : No active profile set, falling back to 1 default profile: "default"
2025-06-13T21:10:14.943-05:00  INFO 69319 --- [cloud-function-json] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2025-06-13T21:10:14.951-05:00  INFO 69319 --- [cloud-function-json] [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2025-06-13T21:10:14.951-05:00  INFO 69319 --- [cloud-function-json] [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.41]
2025-06-13T21:10:14.967-05:00  INFO 69319 --- [cloud-function-json] [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2025-06-13T21:10:14.967-05:00  INFO 69319 --- [cloud-function-json] [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 466 ms
2025-06-13T21:10:14.993-05:00  WARN 69319 --- [cloud-function-json] [           main] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'gsonMapper' defined in gt.cloudfunctionjson.CloudFunctionJsonApplication: Failed to instantiate [org.springframework.cloud.function.json.JsonMapper]: Factory method 'gsonMapper' threw exception with message: com/fasterxml/jackson/core/JsonProcessingException
2025-06-13T21:10:14.994-05:00  INFO 69319 --- [cloud-function-json] [           main] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]
2025-06-13T21:10:14.999-05:00  INFO 69319 --- [cloud-function-json] [           main] .s.b.a.l.ConditionEvaluationReportLogger : 

Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
2025-06-13T21:10:15.007-05:00 ERROR 69319 --- [cloud-function-json] [           main] o.s.boot.SpringApplication               : Application run failed

org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'gsonMapper' defined in gt.cloudfunctionjson.CloudFunctionJsonApplication: Failed to instantiate [org.springframework.cloud.function.json.JsonMapper]: Factory method 'gsonMapper' threw exception with message: com/fasterxml/jackson/core/JsonProcessingException
	at org.springframework.beans.factory.support.ConstructorResolver.instantiate(ConstructorResolver.java:657) ~[spring-beans-6.2.7.jar:6.2.7]
	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:645) ~[spring-beans-6.2.7.jar:6.2.7]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1375) ~[spring-beans-6.2.7.jar:6.2.7]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1205) ~[spring-beans-6.2.7.jar:6.2.7]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:569) ~[spring-beans-6.2.7.jar:6.2.7]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:529) ~[spring-beans-6.2.7.jar:6.2.7]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:339) ~[spring-beans-6.2.7.jar:6.2.7]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:373) ~[spring-beans-6.2.7.jar:6.2.7]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:337) ~[spring-beans-6.2.7.jar:6.2.7]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:202) ~[spring-beans-6.2.7.jar:6.2.7]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.instantiateSingleton(DefaultListableBeanFactory.java:1222) ~[spring-beans-6.2.7.jar:6.2.7]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingleton(DefaultListableBeanFactory.java:1188) ~[spring-beans-6.2.7.jar:6.2.7]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:1123) ~[spring-beans-6.2.7.jar:6.2.7]
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:987) ~[spring-context-6.2.7.jar:6.2.7]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:627) ~[spring-context-6.2.7.jar:6.2.7]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.5.0.jar:3.5.0]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:753) ~[spring-boot-3.5.0.jar:3.5.0]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:439) ~[spring-boot-3.5.0.jar:3.5.0]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:318) ~[spring-boot-3.5.0.jar:3.5.0]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1362) ~[spring-boot-3.5.0.jar:3.5.0]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1351) ~[spring-boot-3.5.0.jar:3.5.0]
	at gt.cloudfunctionjson.CloudFunctionJsonApplication.main(CloudFunctionJsonApplication.java:14) ~[main/:na]
Caused by: org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.cloud.function.json.JsonMapper]: Factory method 'gsonMapper' threw exception with message: com/fasterxml/jackson/core/JsonProcessingException
	at org.springframework.beans.factory.support.SimpleInstantiationStrategy.lambda$instantiate$0(SimpleInstantiationStrategy.java:199) ~[spring-beans-6.2.7.jar:6.2.7]
	at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiateWithFactoryMethod(SimpleInstantiationStrategy.java:88) ~[spring-beans-6.2.7.jar:6.2.7]
	at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:168) ~[spring-beans-6.2.7.jar:6.2.7]
	at org.springframework.beans.factory.support.ConstructorResolver.instantiate(ConstructorResolver.java:653) ~[spring-beans-6.2.7.jar:6.2.7]
	... 21 common frames omitted
Caused by: java.lang.NoClassDefFoundError: com/fasterxml/jackson/core/JsonProcessingException
	at gt.cloudfunctionjson.CloudFunctionJsonApplication.gsonMapper(CloudFunctionJsonApplication.java:20) ~[main/:na]
	at gt.cloudfunctionjson.CloudFunctionJsonApplication$$SpringCGLIB$$0.CGLIB$gsonMapper$0(<generated>) ~[main/:na]
	at gt.cloudfunctionjson.CloudFunctionJsonApplication$$SpringCGLIB$$FastClass$$1.invoke(<generated>) ~[main/:na]
	at org.springframework.cglib.proxy.MethodProxy.invokeSuper(MethodProxy.java:258) ~[spring-core-6.2.7.jar:6.2.7]
	at org.springframework.context.annotation.ConfigurationClassEnhancer$BeanMethodInterceptor.intercept(ConfigurationClassEnhancer.java:393) ~[spring-context-6.2.7.jar:6.2.7]
	at gt.cloudfunctionjson.CloudFunctionJsonApplication$$SpringCGLIB$$0.gsonMapper(<generated>) ~[main/:na]
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103) ~[na:na]
	at java.base/java.lang.reflect.Method.invoke(Method.java:580) ~[na:na]
	at org.springframework.beans.factory.support.SimpleInstantiationStrategy.lambda$instantiate$0(SimpleInstantiationStrategy.java:171) ~[spring-beans-6.2.7.jar:6.2.7]
	... 24 common frames omitted
Caused by: java.lang.ClassNotFoundException: com.fasterxml.jackson.core.JsonProcessingException
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641) ~[na:na]
	at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188) ~[na:na]
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:526) ~[na:na]
	... 33 common frames omitted


Process finished with exit code 1

```