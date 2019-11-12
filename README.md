# Start with Camunda

# Install Camunda

- Get Camunda Platform: https://docs.camunda.org/enterprise/download/
- Get the Camunda Modeler: https://camunda.com/download/modeler/ 
- Install Java (If needed)
- Create a model with the modeler
- Deploy the model to the Camunda platform

# Usage in Eclipse IDE

- Add acrchetype catalog (Preferences --> Maven --> Archetypes --> Add remote)
- In Catalog, insert: https://app.camunda.com/nexus/content/repositories/camunda-bpm/
- Create Maven Project from Archetype: File --> New --> Project --> Maven --> Maven Project
- Go to preferences --> Maven --> Archetypes --> Add remote catalog
- Enter the following URL and description, click on Verify… to test the connection and if that worked click on OK to save the catalog: 
https://app.camunda.com/nexus/content/repositories/camunda-bpm/
- Go to File --> New --> Project --> Maven --> Maven Project
- Select a location for the project or just keep the default settings
- Select the archetype from the catalog you created before
- Specify Maven cooridnates and Camunda Version and finish the project creation

# Test the code

- In Camunda Modeler, run Camunda.bat
- Go to windows preferences --> Set up JDK
- Run the project as maven install
- You should receive a SUCCESS message
- Go to PROJECT_NAME --> target --> You should see the SimpleDemo.war created
- Go to http://localhost:8080/camunda-welcome/index.html
- Go to cockpit
- Sign in : demo -  pass : demo  - Sign in : demo -  pass : demo
- Copy the war file to camunda-bpm\server\wildfly-10.1.0.Final\standalone\deployments
- Refresh and the project will appear -The project is deployed to Camunda
- Right click home  task list  start process  SimpleDemo  start
