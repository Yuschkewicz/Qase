package API;

import dto.Project;

public class ProjectApiClient extends BaseApiClient {


    public void createNewProject(Project project){
post(gson.toJson(project),"project");
    }
    public Project getProjectByCOde(String code){

       gson.fromJson( get("project/"+code).path("result").toString(),Project.class);
        return null;

    }

}
