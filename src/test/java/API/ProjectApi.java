package API;

import dto.Project;

public class ProjectApi extends  BaseApi{
    public void createNewProject(Project project){
post(gson.toJson(project),"project");
    }
    public Project getProjectByCOde(String code){
        return null;//TODO

    }

}
