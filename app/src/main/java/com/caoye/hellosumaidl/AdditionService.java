package com.caoye.hellosumaidl;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;

/**
 * Created by admin on 9/26/16.
 */
public class AdditionService extends Service {

    private Binder mBinder = new IAdditionService.Stub() {
        @Override
        public int add(int value1, int value2) throws RemoteException {
            return value1 + value2;
        }
    };

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }
}
