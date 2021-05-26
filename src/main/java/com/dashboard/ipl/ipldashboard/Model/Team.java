package com.dashboard.ipl.ipldashboard.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Team {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
   private long id; 
   private String teamName;
   private Long totalMatches;
   private Long totalWins;


    public Team(String teamName, Long totalMatches) {
    this.teamName = teamName;
    this.totalMatches = totalMatches;
}

    /**
     * @return long return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return String return the teamName
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * @param teamName the teamName to set
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     * @return Long return the totalMatches
     */
    public Long getTotalMatches() {
        return totalMatches;
    }

    /**
     * @param totalMatches the totalMatches to set
     */
    public void setTotalMatches(Long totalMatches) {
        this.totalMatches = totalMatches;
    }

    /**
     * @return Long return the totalWins
     */
    public Long getTotalWins() {
        return totalWins;
    }

    /**
     * @param totalWins the totalWins to set
     */
    public void setTotalWins(Long totalWins) {
        this.totalWins = totalWins;
    }

    @Override
    public String toString() {
        return "Team [teamName=" + teamName + ", totalMatches=" + totalMatches + ", totalWins=" + totalWins + "]";
    }
    
}