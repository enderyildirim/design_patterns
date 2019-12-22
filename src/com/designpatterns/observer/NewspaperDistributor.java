package com.designpatterns.observer;

public interface NewspaperDistributor {

    void subscribe(Member member);

    void unsubscribe(Member member);

    void distributeNewspapers();

}
