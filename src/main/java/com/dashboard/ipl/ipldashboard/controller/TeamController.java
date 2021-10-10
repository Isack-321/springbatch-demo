package com.dashboard.ipl.ipldashboard.controller;

import com.dashboard.ipl.ipldashboard.Model.Team;
import com.dashboard.ipl.ipldashboard.repository.TeamRepository;
import com.dashboard.ipl.ipldashboard.repository.MatchRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TeamController {

    @Autowired
    private TeamRepository teamRepo;
    @Autowired
    private MatchRepository matchRepo;

    @Autowired
    public TeamController(TeamRepository teamRepo, MatchRepository matchRepo) {
        this.teamRepo = teamRepo;
        this.matchRepo = matchRepo;
    }

    @GetMapping("/team")
    public Iterable<Team> getAllTeam() {
        return this.teamRepo.findAll();
    }

    @GetMapping("/team/{teamName}")
    public Team getTeam(@PathVariable String teamName) {

        Team team = this.teamRepo.findByTeamName(teamName);
        team.setMatches(matchRepo.findLatestMatchesByTeamName(teamName, 4));
        return team;
    }
}