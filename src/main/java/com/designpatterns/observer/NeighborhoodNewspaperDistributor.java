package com.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class NeighborhoodNewspaperDistributor implements NewspaperDistributor {
    private List<Member> members = new ArrayList<>();

    @Override
    public void subscribe(Member member) {
        members.add(member);
    }

    @Override
    public void unsubscribe(Member member) {
        members.remove(member);
    }

    @Override
    public void distributeNewspapers() {
        for (Member member : members) {
            member.takeNewspaper();
        }
    }
}
