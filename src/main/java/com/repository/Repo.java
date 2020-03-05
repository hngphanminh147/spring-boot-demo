package com.repository;

import com.model.Attr;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Scope(scopeName = "prototype")
public class Repo {
    private List<Attr> profileList;

    public void getRepoFromSource() {
        List<Attr> list = new ArrayList<>();
        list.add(new Attr("name1", "addr1", "1"));
        list.add(new Attr("name2", "addr2", "2"));
        list.add(new Attr("name3", "addr3", "3"));

        this.profileList = list;
    }

    public List<Attr> getProfileList() {
        return profileList;
    }
}
