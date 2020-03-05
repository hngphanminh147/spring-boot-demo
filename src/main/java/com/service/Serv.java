package com.service;

import com.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class Serv {
    //    @Autowired
    private Repo repo;

    @PostConstruct
    public void postCons() {

    }

    @PreDestroy
    public void preDes() {

    }

    public Serv() {
        repo.getRepoFromSource();
    }

    @Autowired
    public Serv(Repo repo) {
        repo.getRepoFromSource();
        this.repo = repo;
    }

    public Repo getRepo() {
        return repo;
    }

    //    @Autowired
    public void setRepo(Repo repo) {
        this.repo = repo;
    }
}
