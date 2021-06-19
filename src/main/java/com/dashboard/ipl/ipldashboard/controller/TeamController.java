package com.dashboard.ipl.ipldashboard.controller;

import com.dashboard.ipl.ipldashboard.Model.Team;
import com.dashboard.ipl.ipldashboard.repository.TeamRepository;
import com.dashboard.ipl.ipldashboard.repository.MatchRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {

    private TeamRepository teamRepo;
    private MatchRepository matchRepo;

    public TeamController(TeamRepository teamRepo, MatchRepository matchRepo) {
        this.teamRepo = teamRepo;
    }

    @GetMapping("/team/{teamName}")
    public Team getTeam(@PathVariable String teamName) {

        Team team = this.teamRepo.findByTeamName(teamName);
        team.setMatches(this.matchRepo.getByTeam1OrTeam2OrderByDateDesc(teamName, teamName));
        return team;
    }
}