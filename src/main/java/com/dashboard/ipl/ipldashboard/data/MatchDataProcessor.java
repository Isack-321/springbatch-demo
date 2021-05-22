package com.dashboard.ipl.ipldashboard.data;

import java.time.LocalDate;

import com.dashboard.ipl.ipldashboard.Model.Match;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

public class MatchDataProcessor implements ItemProcessor<MatchInput, Match> {

    private static final Logger log = LoggerFactory.getLogger(MatchDataProcessor.class);

    @Override
    public Match process(final MatchInput matchinput) throws Exception {

        final Match match = new Match();

        match.setId(Long.parseLong(matchinput.getId()));
        match.setCity(matchinput.getCity());

        match.setDate(LocalDate.parse(matchinput.getDate()));
        match.setPlayer_of_match(matchinput.getPlayer_of_match());
        match.setVenue(matchinput.getVenue());

        String firstinningsteam, secondinningsteam;

        if ("bat".equals(matchinput.getToss_decision())) {
            firstinningsteam = matchinput.getToss_winner();
            secondinningsteam = matchinput.getToss_winner().equals(matchinput.getTeam1()) ? matchinput.getTeam2()
                    : matchinput.getTeam1();
        } else {
            secondinningsteam = matchinput.getToss_winner();
            firstinningsteam = matchinput.getToss_winner().equals(matchinput.getTeam1()) ? matchinput.getTeam2()
                    : matchinput.getTeam1();
            secondinningsteam = matchinput.getToss_winner();
        }
        match.setTeam1(firstinningsteam);
        match.setTeam2(secondinningsteam);
        return match;
    }

}
