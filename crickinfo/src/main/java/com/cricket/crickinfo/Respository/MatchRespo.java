package com.cricket.crickinfo.Respository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricket.crickinfo.Entities.Match;



public interface MatchRespo  extends JpaRepository<Match,Integer>{

    //fetch the match provided by teamHeading 

    Optional<Match> findByTeamHeading(String teamHeading);

}
