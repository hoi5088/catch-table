package com.byyun.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBusinessHour is a Querydsl query type for BusinessHour
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBusinessHour extends EntityPathBase<BusinessHour> {

    private static final long serialVersionUID = 1356656271L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBusinessHour businessHour = new QBusinessHour("businessHour");

    public final NumberPath<Integer> businessEndDate = createNumber("businessEndDate", Integer.class);

    public final NumberPath<Integer> businessStartDate = createNumber("businessStartDate", Integer.class);

    public final StringPath businessType = createString("businessType");

    public final StringPath dayType = createString("dayType");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QStore store;

    public QBusinessHour(String variable) {
        this(BusinessHour.class, forVariable(variable), INITS);
    }

    public QBusinessHour(Path<? extends BusinessHour> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBusinessHour(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBusinessHour(PathMetadata metadata, PathInits inits) {
        this(BusinessHour.class, metadata, inits);
    }

    public QBusinessHour(Class<? extends BusinessHour> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.store = inits.isInitialized("store") ? new QStore(forProperty("store"), inits.get("store")) : null;
    }

}

