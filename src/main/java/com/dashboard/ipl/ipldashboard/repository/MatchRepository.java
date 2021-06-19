package com.dashboard.ipl.ipldashboard.repository;

import java.util.List;

import com.dashboard.ipl.ipldashboard.Model.Match;

import org.springframework.data.repository.CrudRepository;

public interface MatchRepository extends CrudRepository<Match, Long> {

    List<Match> getByTeam1OrTeam2OrderByDateDesc(String teamName1, String teamName2);

}
