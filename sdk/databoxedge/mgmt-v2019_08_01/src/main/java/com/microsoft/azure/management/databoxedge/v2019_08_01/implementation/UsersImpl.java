/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.databoxedge.v2019_08_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.databoxedge.v2019_08_01.Users;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.databoxedge.v2019_08_01.User;

class UsersImpl extends WrapperImpl<UsersInner> implements Users {
    private final DataBoxEdgeManager manager;

    UsersImpl(DataBoxEdgeManager manager) {
        super(manager.inner().users());
        this.manager = manager;
    }

    public DataBoxEdgeManager manager() {
        return this.manager;
    }

    @Override
    public UserImpl define(String name) {
        return wrapModel(name);
    }

    private UserImpl wrapModel(UserInner inner) {
        return  new UserImpl(inner, manager());
    }

    private UserImpl wrapModel(String name) {
        return new UserImpl(name, this.manager());
    }

    @Override
    public Observable<User> listByDataBoxEdgeDeviceAsync(final String deviceName, final String resourceGroupName) {
        UsersInner client = this.inner();
        return client.listByDataBoxEdgeDeviceAsync(deviceName, resourceGroupName)
        .flatMapIterable(new Func1<Page<UserInner>, Iterable<UserInner>>() {
            @Override
            public Iterable<UserInner> call(Page<UserInner> page) {
                return page.items();
            }
        })
        .map(new Func1<UserInner, User>() {
            @Override
            public User call(UserInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<User> getAsync(String deviceName, String name, String resourceGroupName) {
        UsersInner client = this.inner();
        return client.getAsync(deviceName, name, resourceGroupName)
        .flatMap(new Func1<UserInner, Observable<User>>() {
            @Override
            public Observable<User> call(UserInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((User)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String deviceName, String name, String resourceGroupName) {
        UsersInner client = this.inner();
        return client.deleteAsync(deviceName, name, resourceGroupName).toCompletable();
    }

}
