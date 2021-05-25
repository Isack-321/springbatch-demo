package com.dashboard.ipl.ipldashboard.Model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Match {
    @Id
    private Long id;
    private String city;
    private LocalDate date;
    private String playerOfMatch;
    private String venue;
    private String team1;
    private String team2;
    private String tossWinner;
    private String tossDecision;
    private String matchWinner;
    private String result;
    private String resultMargin;
    private String umpire1;
    private String umpire2;

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return LocalDate return the date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * @return String return the player_of_match
     */
    public String getPlayerOfMatch() {
        return playerOfMatch;
    }

    /**
     * @param player_of_match the player_of_match to set
     */
    public void setplayerOfMatch(String playerOfMatch) {
        this.playerOfMatch = playerOfMatch;
    }

    /**
     * @return String return the venue
     */
    public String getVenue() {
        return venue;
    }

    /**
     * @param venue the venue to set
     */
    public void setVenue(String venue) {
        this.venue = venue;
    }

    /**
     * @return String return the neutral_venue
     */

    /**
     * @return String return the team1
     */
    public String getTeam1() {
        return team1;
    }

    /**
     * @param team1 the team1 to set
     */
    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    /**
     * @return String return the team2
     */
    public String getTeam2() {
        return team2;
    }

    /**
     * @param team2 the team2 to set
     */
    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    /**
     * @return String return the toss_winner
     */
    public String getTossWinner() {
        return tossWinner;
    }

    /**
     * @param toss_winner the toss_winner to set
     */
    public void setTossWinner(String tossWinner) {
        this.tossWinner = tossWinner;
    }

    /**
     * @return String return the toss_decision
     */
    public String getTossDecision() {
        return tossDecision;
    }

    /**
     * @param toss_decision the toss_decision to set
     */
    public void setTossDecision(String tossDecision) {
        this.tossDecision = tossDecision;
    }

    /**
     * @return String return the Matchwinner
     */
    public String getMatchWinner() {
        return matchWinner;
    }

    /**
     * @param Matchwinner the Matchwinner to set
     */
    public void setMatchWinner(String matchWinner) {
        this.matchWinner = matchWinner;
    }

    /**
     * @return String return the result
     */
    public String getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * @return String return the resultMargin
     */
    public String getResultMargin() {
        return resultMargin;
    }

    /**
     * @param resultMargin the resultMargin to set
     */
    public void setResultMargin(String resultMargin) {
        this.resultMargin = resultMargin;
    }

    /**
     * @return String return the umpire1
     */
    public String getUmpire1() {
        return umpire1;
    }

    /**
     * @param umpire1 the umpire1 to set
     */
    public void setUmpire1(String umpire1) {
        this.umpire1 = umpire1;
    }

    /**
     * @return String return the umpire2
     */
    public String getUmpire2() {
        return umpire2;
    }

    /**
     * @param umpire2 the umpire2 to set
     */
    public void setUmpire2(String umpire2) {
        this.umpire2 = umpire2;
    }

}
