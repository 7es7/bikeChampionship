package com.softserveinc.itacademy.bikechampionship.commons.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Participant.class)
public abstract class Participant_ {

	public static volatile SingularAttribute<Participant, Integer> competitionNumber;
	public static volatile SingularAttribute<Participant, String> firstName;
	public static volatile SingularAttribute<Participant, String> lastName;
	public static volatile ListAttribute<Participant, Lap> lap;
	public static volatile SingularAttribute<Participant, Long> id;
	public static volatile SingularAttribute<Participant, Team> team;
	public static volatile SingularAttribute<Participant, Event> event;
	public static volatile SingularAttribute<Participant, Category> category;
	public static volatile SingularAttribute<Participant, User> user;

}

