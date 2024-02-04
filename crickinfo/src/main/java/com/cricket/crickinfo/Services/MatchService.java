package com.cricket.crickinfo.Services;

import java.util.List;


import com.cricket.crickinfo.Entities.Match;

public interface MatchService {
    //get all matches
    List<Match> getAllMatches();

    //get live matches

    List<Match> getLiveMatches();
    //get cricket wordcup 2023 pointsTable

    List<List<String>> getPointTable()    ;



    
}
