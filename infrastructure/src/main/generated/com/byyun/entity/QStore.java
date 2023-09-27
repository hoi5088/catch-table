package com.byyun.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStore is a Querydsl query type for Store
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QStore extends EntityPathBase<Store> {

    private static final long serialVersionUID = -208121226L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStore store = new QStore("store");

    public final ListPath<ActiveReservation, QActiveReservation> activeReservations = this.<ActiveReservation, QActiveReservation>createList("activeReservations", ActiveReservation.class, QActiveReservation.class, PathInits.DIRECT2);

    public final ListPath<BusinessHour, QBusinessHour> businessHours = this.<BusinessHour, QBusinessHour>createList("businessHours", BusinessHour.class, QBusinessHour.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final ListPath<Seat, QSeat> seats = this.<Seat, QSeat>createList("seats", Seat.class, QSeat.class, PathInits.DIRECT2);

    public final QStoreBusinessInfo storeBusinessInfo;

    public QStore(String variable) {
        this(Store.class, forVariable(variable), INITS);
    }

    public QStore(Path<? extends Store> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStore(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStore(PathMetadata metadata, PathInits inits) {
        this(Store.class, metadata, inits);
    }

    public QStore(Class<? extends Store> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.storeBusinessInfo = inits.isInitialized("storeBusinessInfo") ? new QStoreBusinessInfo(forProperty("storeBusinessInfo"), inits.get("storeBusinessInfo")) : null;
    }

}

