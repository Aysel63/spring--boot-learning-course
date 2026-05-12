package com.aysel.aopdemo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MemebershipDAOImpl implements MembershipDAO{

    @Override
    public void addAccount() {

        System.out.println(getClass() + "DOING MY DB WORK: ADDING A MEMBERSHIP ACCOUNT");

    }
}
