package me.mcl.simulator.data;

import java.util.List;

import me.mcl.simulator.domain.Match;
import retrofit2.Call;
import retrofit2.http.GET;

public interface MatchesApi {
    @GET("matches.json")
    Call<List<Match>> getMatches();

}
