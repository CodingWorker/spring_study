//在外部定义的xml元数据的基础上，内部实现spring ioc,这里忽略import包
//get the context
Application context=new ClassPathXmlApplicationContext(new String[]{"bean1.xml","bean2.xml","dao.xml"});//spring 团队推荐像这样将读个xml文件路径作为地址数组传入以便于实例化ioc并管理这些定义的java bean

//由于Application是对BeanFactory的扩展，因此有下面的表达式
BeanFactory factory=context;
