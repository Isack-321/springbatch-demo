package com.dashboard.ipl.ipldashboard.data;

import java.time.LocalDate;

import com.dashboard.ipl.ipldashboard.Model.Match;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

public class MatchDataProcessor implements ItemProcessor<MatchInput, Match> {

    private static final Logger log = LoggerFactory.getLogger(MatchDataProcessor.class);

    @Override
    public Match process(final MatchInput matchInput) throws Exception {

        Match match = new Match();

        match.setId(Long.parseLong(matchInput.getId()));
        match.setCity(matchInput.getCity());

        match.setDate(LocalDate.parse(matchInput.getDate()));
        match.setplayerOfMatch(matchInput.getPlayer_of_match());
        match.setVenue(matchInput.getVenue());

        String firstinningsteam, secondinningsteam;

        if ("bat".equals(matchInput.getToss_decision())) {
            firstinningsteam = matchInput.getToss_winner();
            secondinningsteam = matchInput.getToss_winner().equals(matchInput.getTeam1()) ? matchInput.getTeam2()
                    : matchInput.getTeam1();
        } else {
            secondinningsteam = matchInput.getToss_winner();
            firstinningsteam = matchInput.getToss_winner().equals(matchInput.getTeam1()) ? matchInput.getTeam2()
                    : matchInput.getTeam1();
            secondinningsteam = matchInput.getToss_winner();
        }
        match.setTeam1(firstinningsteam);
        match.setTeam2(secondinningsteam);
        match.setTossWinner(matchInput.getToss_winner());
        match.setMatchWinner(matchInput.getWinner());
        match.setTossDecision(matchInput.getToss_decision());
        match.setResult(matchInput.getResult());
        match.setResultMargin(matchInput.getResult_margin());
        match.setUmpire1(matchInput.getUmpire1());
        match.setUmpire2(matchInput.getUmpire2());

        return match;
    }

}
