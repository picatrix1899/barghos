
# About Project Barghos
Project Barghos is a set of multiple smaller libraries providing utilities and structures covering diverse general-use aswell as scientific applications.
Its goal is to heavily reduce boilerplate code, provide a common api that is used across all barghos subprojects and is easily extendable and also provide
easier and more intuitive ways to work with familiar structures like mathematical vectors to write cleaner code and still maintain a good performance.

The project originally started as "utilslib" and is till today maintained along the development of the CodeRed Game Engine.
Therefore the biggest part of the libraries are focused on common problems you could run into while developing a game engine.
But there are plans to extend the libraries with physics, financial calculations and AI and deep learning.

# Project Barghos Core Library
This part of Project Barghos contains a lot of basic structures and the entire basic api used across all barghos subprojects.
It is therefore required by every barghos subproject.

---

# Warning

As the deployment scenario for the barghos libraries is currently under development and a lot is still undecided it is very likely that the repository gets
restructured, the versioning style gets changed and CI pipelines get modified. Therefore special care should be taken while using any of the libraries.

# Usage & Installation

## Maven

To use the packages in Maven you first need to add the repository to either your global maven settings or to the pom.xml of your project.
After that you should use the following dependency in your pom.xml. With this you receive smaller enhancements and added features. If you don't want this,
you can also use fixed versions.

```xml
<project>
  ...
  <dependencies>
    ...
    <dependency>
      <groupId>org.barghos</groupId>
      <artifactId>barghos-core</artifactId>
      <version>[x.x.0.0,x.x.0.0)</version>
    </dependency>
    ...
  </dependencies>
  ...
</project>
```

Example:

```xml
<dependency>
  <groupId>org.barghos</groupId>
  <artifactId>barghos-core</artifactId>
  <version>[1.0.0.0,1.1.0.0)</version>
</dependency>
```

### For Project POM.xml

If you want the pacakges to be only referenced by single projects, add the repository directly to the pom.xml.

```xml
<project>
  ...
  <repositories>
    ...
    <repository>
      <id>github-barghos-core</id>
      <name>GitHub picatrix1899 barghos-core Apache Maven Packages</name>
      <url>https://maven.pkg.github.com/picatrix1899/barghos-core</url>
    </repository>
    ...
  </repositories>
  ...
</project>
```

### settings.xml

If you want the packages to be available to all yout local projects, you have use a profile and add the repository to it.
You have to make the used profile active to be able to access the package repository.

```xml
<settings>
  ...
  <profiles>
    ...
    <profile>
      ...
      <repositories>
        ...
        <repository>
          <id>github-barghos-core</id>
          <name>GitHub picatrix1899 barghos-core Apache Maven Packages</name>
          <url>https://maven.pkg.github.com/picatrix1899/barghos-core</url>
        </repository>
        ...
      </repositories>
      ...
    </profile>
      ...
  </profiles>
      ...
</settings>
```

