# spring-cloud-model
Reference project for micro-services architecture with spring cloud.

# Spring Cloud
* Microservices
* Naturally scalable		
## Benefits of monolithic VS microservices when in a cloud environment		
##### What about applications ?
> Are threated as service themselves
> Should be build for individual use and purpose
> Rely on other services for processing and data access
##### What is ?
* Single purpose services
* Single Domain
* Similar to SOA model
* Rest Protocol

### Domain Driven Architecture
What about Spring ?
	> Spring has two main purposes: microservices is one of them
	> Spring Cloud adds the 12 factor plumbing to a java based microservice application written for cloud native

## Types of services
### Data Services
- Microservices that serve data for a single domain
- Can be cloud native database - Cassandra
### Process business application
Aggregate one or more data services and apply business processing
### Configuration server
* Why External Configuration ?
Based um 12 factor methodologies
Increase portability and scallability
Remove necessity of environment variables
* Why use config Server ?
version control on configuration
Early
Can update the microservices
### Service Discovery 
Allows microservices to discover the routes to the services it needes to use .
Netflix Eureka
Consul
### Routing Messaging
Communication is critical
Communication Via HTTP request or via message
### Routing and load Balance
Netflix Ribbon
### Messaging
Kafka
### API Gateway
Allow to route API requests (internal or external) to the correct service
	Netflix Zuul
	Spring cloud gateway
### Circuit Breaker
Failure is inevitable but user dont need to know
Con help application function in the face of failure
Netflix Hystrix
### Tracing
Is difficult to debug cloud applications
Spring Cloud Sleuth and Zipkin
