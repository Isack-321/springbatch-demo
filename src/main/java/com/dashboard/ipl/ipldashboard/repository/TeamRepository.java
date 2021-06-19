package com.dashboard.ipl.ipldashboard.repository;

import org.springframework.data.repository.CrudRepository;

import com.dashboard.ipl.ipldashboard.Model.Team;

public interface TeamRepository extends CrudRepository<Team, Long> {

   Team findByTeamName(String teamName);

}