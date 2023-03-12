package com.logomaster.logomaker.config;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;

/* loaded from: classes3.dex */
public class LoadConfigService extends JobService {
    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0159, code lost:
        if (r1 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01cb, code lost:
        if (r1 == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x023d, code lost:
        if (r1 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x02af, code lost:
        if (r0 == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0075, code lost:
        if (r1 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e7, code lost:
        if (r1 == null) goto L44;
     */
    @Override // android.app.Service, android.content.ComponentCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLowMemory() {
        /*
            Method dump skipped, instructions count: 696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.logomaster.logomaker.config.LoadConfigService.onLowMemory():void");
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        super.onRebind(intent);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x015c, code lost:
        if (r0 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01ce, code lost:
        if (r0 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0240, code lost:
        if (r0 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0078, code lost:
        if (r0 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ea, code lost:
        if (r0 == null) goto L43;
     */
    @Override // android.app.Service, android.content.ComponentCallbacks2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onTrimMemory(int r12) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.logomaster.logomaker.config.LoadConfigService.onTrimMemory(int):void");
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }
}
