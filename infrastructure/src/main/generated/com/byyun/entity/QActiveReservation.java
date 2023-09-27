package com.byyun.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QActiveReservation is a Querydsl query type for ActiveReservation
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QActiveReservation extends EntityPathBase<ActiveReservation> {

    private static final long serialVersionUID = 1207340795L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QActiveReservation activeReservation = new QActiveReservation("activeReservation");

    public final DateTimePath<java.util.Date> date = createDateTime("date", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QMember member;

    public final ListPath<Reservation, QReservation> reservations = this.<Reservation, QReservation>createList("reservations", Reservation.class, QReservation.class, PathInits.DIRECT2);

    public final QSeat seat;

    public final StringPath status = createString("status");

    public final QStore store;

    public final DateTimePath<java.time.LocalDateTime> time = createDateTime("time", java.time.LocalDateTime.class);

    public QActiveReservation(String variable) {
        this(ActiveReservation.class, forVariable(variable), INITS);
    }

    public QActiveReservation(Path<? extends ActiveReservation> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QActiveReservation(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QActiveReservation(PathMetadata metadata, PathInits inits) {
        this(ActiveReservation.class, metadata, inits);
    }

    public QActiveReservation(Class<? extends ActiveReservation> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member")) : null;
        this.seat = inits.isInitialized("seat") ? new QSeat(forProperty("seat"), inits.get("seat")) : null;
        this.store = inits.isInitialized("store") ? new QStore(forProperty("store"), inits.get("store")) : null;
    }

}

