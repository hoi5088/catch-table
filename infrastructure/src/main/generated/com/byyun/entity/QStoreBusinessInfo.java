package com.byyun.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStoreBusinessInfo is a Querydsl query type for StoreBusinessInfo
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QStoreBusinessInfo extends EntityPathBase<StoreBusinessInfo> {

    private static final long serialVersionUID = 431971876L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStoreBusinessInfo storeBusinessInfo = new QStoreBusinessInfo("storeBusinessInfo");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> intervalDate = createNumber("intervalDate", Integer.class);

    public final NumberPath<Integer> intervalTime = createNumber("intervalTime", Integer.class);

    public final QStore store;

    public final NumberPath<Integer> timeSlot = createNumber("timeSlot", Integer.class);

    public QStoreBusinessInfo(String variable) {
        this(StoreBusinessInfo.class, forVariable(variable), INITS);
    }

    public QStoreBusinessInfo(Path<? extends StoreBusinessInfo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStoreBusinessInfo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStoreBusinessInfo(PathMetadata metadata, PathInits inits) {
        this(StoreBusinessInfo.class, metadata, inits);
    }

    public QStoreBusinessInfo(Class<? extends StoreBusinessInfo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.store = inits.isInitialized("store") ? new QStore(forProperty("store"), inits.get("store")) : null;
    }

}

