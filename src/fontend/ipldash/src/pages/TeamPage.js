
import React ,{useEffect, useState} from 'react';
import MatchDetailsCard from '../components/MatchDetailsCard';
import MatchSmallCard from '../components/MatchSmallCard';
import {useParams} from 'react-router-dom';

 const Teampage = (props)=>{

     const [team, setTeam] = useState({matches:[]});
     const {teamName}= useParams();
        useEffect(
            ()=>{
                const fetchMatches = async()=>{
                    const response = await fetch(`http://localhost:8089/api/team/${teamName}`);
                    const data= await response.json();

                    setTeam(data);
                };

                fetchMatches();
            }
            ,[teamName]
        );

        if (!team || !team.teamName)
        {
           return <h1>team not found!</h1>
        }
        return (

            <div className="Teampage">
                      <h1>{team.teamName}</h1>
    
                      <MatchDetailsCard match={team.matches[0]}/>
                      {team.matches.slice(1).map( match => <MatchSmallCard teamName={team.teamName} match={match}/> ) }
            </div> 
        );
    


   

}

export default Teampage;


