# Arquetipo Serenity BDD POM

## Consideraciones
    - Para ejecutar la funcionalidad de prueba que implementa la utilidad de Base de Datos es importante 
    que se instacie una Base de datos y se configure en el archivo de configuración la url de conexion, usuario
    y contraseña, ubicado en:
        
        ./src/main/resources/configs/congig.properties

        En las dependencias del proyecto esta agregada la dependencia del driver de MySQL, si no 
        desea realizar mayores ajustes respecto al motor de BD use MySQL. Si desea usar otro motor, 
        adiciones la dependencia del driver al build.gradle y configure este driver como observa 
        se realizo para MySQL en: 
        
            ./src/main/java/utils/data/ConnectionManagerDB.java

        Si no desea realizar mayores ajustes al ejemplo puesto en el .feature nombre a la base de 
        datos "arquetipo_serenity" y dentro de ella cree una tabla con el nombre "search_values". 
        Dicha tabla debe tener dos columnas, la primera debe llamarse "id" y la segundo "value"

        

    - La funcionalidad de prueba que implementa la utilidad de manejo de documentos de Google Sheet hace uso
    de un documento de Google Sheet ubicado en el drive de Pragma, por ende las credenciasles que se encuentran
    en: 
        ./src/main/resources/credenciales.json
    fueron generadas por un API de google creado bajo una cuenta de Pragma.

    Dadas las consideraciones anteriores, la implementacion de las utilidades solo se encuentran expuestas a modo 
    de ejemplo y unicamente funcionaran si se hacen las configuraciones pertinentes.

## Name
Proyecto base de Serenity BDD con Page Object Model (POM)

## Description
This project aims to establish a standard base for test automation with Srenity BDD and POM


## ✅ Technologies
### This project required:
- [JDK java] version 1.8
- [Maven] version
- [Serenity] version
- [Cucumbre] version
- [JUnit] version

## Project status
<h4 align="center"> 🚧 Proyecto en construcción 🚧 </h4> 

## Usage
Use examples liberally, and show the expected output if you can. It's helpful to have inline the smallest example of usage that you can demonstrate, while providing links to more sophisticated examples if they are too long to reasonably include in the README.

## 📁 Access to project

- [ ] [Create](https://docs.gitlab.com/ee/user/project/repository/web_editor.html#create-a-file) or [upload](https://docs.gitlab.com/ee/user/project/repository/web_editor.html#upload-a-file) files
- [ ] [Add files using the command line](https://docs.gitlab.com/ee/gitlab-basics/add-file.html#add-a-file-using-the-command-line) or push an existing Git repository with the following command:

```
cd existing_repo
git remote add origin https://gitlab.com/calidad_de_software/.../.git
git branch -M develop
git push -uf origin develop
```

## ** 🛠️ Run after tests to generate report**
```
mvn serenity:aggregate
```

## Collaborate with your team

- [ ] [Invite team members and collaborators](https://docs.gitlab.com/ee/user/project/members/)
- [ ] [Create a new merge request](https://docs.gitlab.com/ee/user/project/merge_requests/creating_merge_requests.html)
- [ ] [Automatically close issues from merge requests](https://docs.gitlab.com/ee/user/project/issues/managing_issues.html#closing-issues-automatically)
- [ ] [Enable merge request approvals](https://docs.gitlab.com/ee/user/project/merge_requests/approvals/)
- [ ] [Automatically merge when pipeline succeeds](https://docs.gitlab.com/ee/user/project/merge_requests/merge_when_pipeline_succeeds.html)

## Test and Deploy

Use the built-in continuous integration in GitLab.

- [ ] [Get started with GitLab CI/CD](https://docs.gitlab.com/ee/ci/quick_start/index.html)
- [ ] [Analyze your code for known vulnerabilities with Static Application Security Testing(SAST)](https://docs.gitlab.com/ee/user/application_security/sast/)
- [ ] [Deploy to Kubernetes, Amazon EC2, or Amazon ECS using Auto Deploy](https://docs.gitlab.com/ee/topics/autodevops/requirements.html)
- [ ] [Use pull-based deployments for improved Kubernetes management](https://docs.gitlab.com/ee/user/clusters/agent/)
- [ ] [Set up protected environments](https://docs.gitlab.com/ee/ci/environments/protected_environments.html)

***

## Support
Tell people where they can go to for help. It can be any combination of an issue tracker, a chat room, an email address, etc.

## Roadmap
If you have ideas for releases in the future, it is a good idea to list them in the README.

## Authors and acknowledgment

| [<img src="https://gitlab.com/uploads/-/system/user/avatar/13437423/avatar.png?width=400" width=115><br><sub>Mauro L. Ibarra P.</sub>](https://gitlab.com/mauro.ibarrap) <br/> | 
|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|

## License
Open source project.

