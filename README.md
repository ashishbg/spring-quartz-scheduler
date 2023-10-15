# Email Scheduler
Spring Boot + Quartz

### Project Setup
1. Create Quartz tables using the `script extras/quartz_tables_postgres.sql`.  Similar scripts are available for other database vendors on the [Quartz Github repo](https://github.com/quartz-scheduler/quartz/tree/main/quartz/src/main/resources/org/quartz/impl/jdbcjobstore). 
2. Update the Spring Datasource and Mail properties in application.properties
3. Run application from `EmailSchedulerApplication` class.

### Extras
- Postman collection of REST endpoints is give at `extras/EmailScheduler.postman_collection.json`
- Created by following this [tutorial](https://www.youtube.com/watch?v=bZ-aGMWAVhk&list=PLS1QulWo1RIZL1UicW3PV905pirgXjfQV&index=1) by [ProgrammingKnowledge](https://www.youtube.com/@ProgrammingKnowledge)

