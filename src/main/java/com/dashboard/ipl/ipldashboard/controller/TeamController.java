package com.dashboard.ipl.ipldashboard.controller;

import java.time.LocalDate;
import java.util.List;

import com.dashboard.ipl.ipldashboard.Model.Match;
import com.dashboard.ipl.ipldashboard.Model.Team;
import com.dashboard.ipl.ipldashboard.repository.TeamRepository;
import com.dashboard.ipl.ipldashboard.repository.MatchRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/api")
@CrossOrigin
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
        team.setMatches(matchRepo.findLatestMatchesbyTeam(teamName, 4));
        return team;
    }

    @GetMapping("/team/{teamName}/matches")
    public List<Match> getMatchesForTeam(@PathVariable String teamName, @RequestParam int year) {
        LocalDate startDate = LocalDate.of(year, 1, 1);
        LocalDate endDate = LocalDate.of(year + 1, 1, 1);

        return this.matchRepo.getMatchesByTeamBetweenDates(teamName, startDate, endDate);

    }
}