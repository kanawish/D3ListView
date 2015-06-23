package com.district3.d3listview;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by kanawish on 15-06-22.
 */
public interface GitHubService {
    @GET("/users/{user}/repos")
    List<Repo> listRepos(@Path("user") String user);

    @GET("/users/{user}/repos")
    void listRepos(@Path("user") String user, Callback<List<Repo>> cb);
}
