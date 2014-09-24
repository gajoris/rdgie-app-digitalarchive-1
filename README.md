rdgie-app-digitalarchive
========================

Description
----------

A digital archive for RDGIE documents.

How to Install
-------------

1.Fork this repository to your remote repository
2.Clone your remote repository to create a local repository on your pc
3.Import the project in you IDE
4.Make the following changes in servlet-context.xml (...The file is located in /src/main/webapp/spring/appServlet/)
 
  -Create a database on your local database server.
  -In the "dataSource" bean, Change the database name and password. The database name used in this main project is "ProjectDB".
  -Under the "org.rdgie.digitalarchive.localfs.LocalFsVolume" bean, change the path to be used as the root directory for your project 
  

