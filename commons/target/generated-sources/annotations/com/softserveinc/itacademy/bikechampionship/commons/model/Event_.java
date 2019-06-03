package com.softserveinc.itacademy.bikechampionship.commons.model;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Event.class)
public abstract class Event_ {

	public static volatile SingularAttribute<Event, LocalDateTime> dateTime;
	public static volatile SingularAttribute<Event, User> manager;
	public static volatile SingularAttribute<Event, Championship> championship;
	public static volatile SingularAttribute<Event, String> name;
	public static volatile SingularAttribute<Event, String> description;
	public static volatile SingularAttribute<Event, Long> id;
	public static volatile ListAttribute<Event, Category> categories;
	public static volatile ListAttribute<Event, Participant> participants;

}

