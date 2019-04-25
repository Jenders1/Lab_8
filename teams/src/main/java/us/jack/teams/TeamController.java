package us.jack.teams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeamController {

    @Autowired
    private TeamService teamService;

    @RequestMapping("/teams")
    public List<Team> getThanks() {
        return teamService.getAllTeams();
    }

    @RequestMapping("/team/{id}")
    public Team getTeam(@PathVariable String id) {
        return teamService.getTeam(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/teams/add")
    public void addTeam(@RequestBody Team team) {
        teamService.addTeam(team);
    }

}
