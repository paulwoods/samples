This project contains several directories, each containing the example code from my "Spring for XML Haters" talk at a different stage in the talk. They are intended to be viewed in the following order:

* **xml-wired**                  :  Basic XML wiring (the starting point)
* **autowired**                  :  Using @Autowired, eliminating some of the XML
* **componentscanned**           :  Auto-discovery of beans with @Component
* **atvalue**                    :  Wiring of values using @Value and SpEL
* **primary**                    :  Autowiring ambiguity resolution with @Primary
* **qualifiers**                 :  Autowiring ambiguity resolution with @Qualifier
* **customqualifiers**           :  Ambiguity resolution with a custom qualifier
* **atinject**                   :  Standards-based DI with @Inject (JSR-330)
* **atnamed**                    :  Ambiguity resolution with JSR-330's @Named
* **atinject-customqualifiers**  :  Custom JSR-330 qualifiers
* **javaconfig**                 :  Java-based configuration with Spring JavaConfig
* **javaconfig-zeroxml**         :  JavaConfig with no XML whatsoever
* **zeroconfig**                 :  Zero-config (XML or Java-based)
* **atresource**                 :  DI with JSR-250's @Resource
* **groovy-beanbuilder**         :  Bean wiring using the Groovy and the Grails BeanBuilder


Note that when I present this, I start at the xml-wired project and work through each technique in a live coding session during the presentation. I may (probably don't) cover everything every time I present this.

Also note that I've not bothered to update the projects to the newest version of Spring yet. So as long as this paragraph remains in this README, be aware that there may be further XML cleanliness to be gained by using Spring 3.1.
