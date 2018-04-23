# Introduction

The Dropwizard example application was developed to, as its name implies, provide examples of some of the features
present in Dropwizard.

# Running The Application

To test the example application run the following commands.

* To package the example run the following from the root dropwizard directory.

        mvn package

* To run the server run.

        java -jar target/dropwizard-example-$DW_VERSION.jar server example.yml

* To hit the Hello World example (hit refresh a few times).

	http://localhost:8080/hello-world

* To pass a custom header to Hello World example
 
        curl -H 'Date: 2018-04-23' http://localhost:8080/filtered/hello
        