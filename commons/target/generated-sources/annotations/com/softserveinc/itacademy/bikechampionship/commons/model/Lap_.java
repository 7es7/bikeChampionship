package com.softserveinc.itacademy.bikechampionship.commons.model;

import java.time.LocalTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Lap.class)
public abstract class Lap_ {

	public static volatile SingularAttribute<Lap, Integer> number;
	public static volatile SingularAttribute<Lap, LocalTime> finishTime;
	public static volatile SingularAttribute<Lap, Long> id;
	public static volatile SingularAttribute<Lap, Participant> participant;

}

