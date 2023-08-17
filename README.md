# config-server
Cloud Config
a powerful component in Spring Cloud ecosystem focuses on managing configuration properties for distributed applications=>externalize configuration settings from their application code=>improved flexibility, maintainability, and easier deployment and scaling.

Externalizing and Centralized Configuration Properties:
In a traditional monolithic application, configuration properties are often hard-coded directly into the application's source code or stored within the application's configuration files=> mỗi cục service nhỏ config trong chính nó thì khi cần đổi sẽ phải đi đến từng chỗ để đổi/reload lại=> challenging.
Centralized configuration server where you can store configuration properties for different applications and environments (Git repository, a Subversion repository, a file system, or other supported backends) => manage and update configuration settings for multiple services from a single place.
Spring Cloud Config seamlessly integrates with Spring Boot applications. By adding the appropriate dependencies and configuration, your Spring Boot applications can retrieve their configuration properties from the centralized configuration server at startup.
