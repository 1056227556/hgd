package main;

import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 演示例子，执行 main 方法控制台输入模块表名回车自动生成对应项目目录中
public class CodeGenerator {
//    数据库驱动
    private static String driver = "com.mysql.jdbc.Driver";
//    数据库连接地址
//    private static String url="jdbc:mysql://122.51.200.216:3306/hgd?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&allowMultiQueries=true&serverTimezone=UTC";
    private static String url="jdbc:mysql://127.0.0.1:3306/hrs?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&allowMultiQueries=true&serverTimezone=UTC";


    //    数据库用户名
    private static String  username="root";
//    数据库密码
//    private static String  password="DtSHZnKFywFaAGia";
    private static String  password="123456";
//    作者
    private static String author = "lxjn";
//    包路径
    private static String parent = "com.lxjn.hgd.module";
//    模块名称
    private static String moduleName = "language";
//    要生成的表
    private static String[] tableNames = {"hrs_room"};
//    排除的表
    private static String[] exclude = {};
//    表前缀
//  private static String tablePrefix = "tb_";
    private static String tablePrefix = "hrs_";
//    实体类公共类
//private static String superEntity = "com.lxjn.hgd.module.EntityParent";
    private static String superEntity = "";
//    公共字段
//    private static String[] superColumns = {"id","creator","createtime","updater","updatetime","rank"};

    private static String[] superColumns = {};
//    文件输出路径
    private static String filePath = "C:\\Users\\longzhuang\\Desktop\\新建文件夹";
    /**
     * <p>
     * 读取控制台内容
     * </p>
     */
    public static String scanner(String tip) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入" + tip + "：");
        if (scanner.hasNext()) {
            String ipt = scanner.next();
            if (StringUtils.isNotBlank(ipt)) {
                return ipt;
            }
        }
        throw new MybatisPlusException("请输入正确的" + tip + "！");
    }

    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath;
        if (filePath==null||"".equals(filePath)){
            projectPath = System.getProperty("user.dir");
        }else {
            projectPath = filePath;
        }

        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor(author);
        gc.setOpen(false);
        // gc.setSwagger2(true); 实体属性 Swagger2 注解
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl(url);
        // dsc.setSchemaName("public");
        dsc.setDriverName(driver);
        dsc.setUsername(username);
        dsc.setPassword(password);
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();

//        pc.setModuleName(scanner("模块名"));
        if (!"".equals(moduleName)){
            pc.setModuleName(moduleName);
        }
        pc.setParent(parent);
        mpg.setPackageInfo(pc);

        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };

        // 如果模板引擎是 freemarker
        String templatePath = "/templates/mapper.xml.ftl";
        // 如果模板引擎是 velocity
        // String templatePath = "/templates/mapper.xml.vm";

        // 自定义输出配置
        List<FileOutConfig> focList = new ArrayList<>();
        // 自定义配置会被优先输出
        focList.add(new FileOutConfig(templatePath) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
                return projectPath + "/src/main/resources/mapper/" + pc.getModuleName() + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });
        /*
        cfg.setFileCreate(new IFileCreate() {
            @Override
            public boolean isCreate(ConfigBuilder configBuilder, FileType fileType, String filePath) {
                // 判断自定义文件夹是否需要创建
                checkDir("调用默认方法创建的目录，自定义目录用");
                if (fileType == FileType.MAPPER) {
                    // 已经生成 mapper 文件判断存在，不想重新生成返回 false
                    return !new File(filePath).exists();
                }
                // 允许生成模板文件
                return true;
            }
        });
        */
        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);

        // 配置模板
        TemplateConfig templateConfig = new TemplateConfig();

        // 配置自定义输出模板
        //指定自定义模板路径，注意不要带上.ftl/.vm, 会根据使用的模板引擎自动识别
        // templateConfig.setEntity("templates/entity2.java");
        // templateConfig.setService();
        // templateConfig.setController();

        templateConfig.setXml(null);
        mpg.setTemplate(templateConfig);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();

        // 数据库表映射到实体的命名策略:下划线转驼峰
        strategy.setNaming(NamingStrategy.underline_to_camel);

        // 数据库表字段映射到实体的命名策略, 未指定按照 naming 执行
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);

        // 实体继承类全称
        if (superEntity!=null&&!"".equals(superEntity)){
            strategy.setSuperEntityClass(superEntity);
        }

        // 写于父类中的公共字段
        strategy.setSuperEntityColumns(superColumns);

//        【实体】是否为lombok模型
        strategy.setEntityLombokModel(true);

//        生成 @RestController 控制器
        strategy.setRestControllerStyle(true);

        // 公共父类
//        strategy.setSuperControllerClass("你自己的父类控制器,没有就不用设置!");

//        strategy.setInclude(scanner("表名，多个英文逗号分割").split(","));
        if (tableNames.length>0){
            strategy.setInclude(tableNames);
        }

        // 需要排除的表名，允许正则表达式
        if (exclude.length>0) {
            strategy.setExclude(exclude);
        }

        // 驼峰转连字符
        strategy.setControllerMappingHyphenStyle(true);

        // 是否生成实体时，生成字段注解 默认false;
        strategy.setEntityTableFieldAnnotationEnable(true);

        // 表前缀
        strategy.setTablePrefix(tablePrefix);

//        把策略配置添加到代码生成器主类
        mpg.setStrategy(strategy);


        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();
    }

}