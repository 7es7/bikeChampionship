package com.softserveinc.itacademy.bikechampionship.commons.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Championship.class)
public abstract class Championship_ {

	public static volatile SingularAttribute<Championship, String> name;
	public static volatile SingularAttribute<Championship, String> description;
	public static volatile SingularAttribute<Championship, Long> id;
	public static volatile ListAttribute<Championship, Event> events;

}

