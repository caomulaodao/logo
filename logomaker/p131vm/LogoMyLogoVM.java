package com.logomaster.logomaker.p131vm;

import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.logomaster.logomaker.LogoApplication;
import com.logomaster.logomaker.base.LogoBaseViewModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.logomaster.logomaker.vm.LogoMyLogoVM */
/* loaded from: classes3.dex */
public class LogoMyLogoVM extends LogoBaseViewModel {
    private static final String TAG = "LogoMyDesignVM";
    public int abc1000 = 7;
    public boolean abc0 = false;
    public float abc1001 = 0.35593295f;
    private MutableLiveData<List<LogoMyLogoEntity>> list = new MutableLiveData<>();
    public String abc1002 = "t.";
    public int abc1 = 4;
    public String abc1003 = "'get";

    /* renamed from: com.logomaster.logomaker.vm.LogoMyLogoVM$a */
    /* loaded from: classes3.dex */
    public class C9670a implements Comparator<LogoMyLogoEntity> {
        public C9670a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(LogoMyLogoEntity logoMyLogoEntity, LogoMyLogoEntity logoMyLogoEntity2) {
            return logoMyLogoEntity.m2188a().lastModified() < logoMyLogoEntity2.m2188a().lastModified() ? 1 : -1;
        }
    }

    public MutableLiveData<List<LogoMyLogoEntity>> getList() {
        return this.list;
    }

    public void initData() {
        int i;
        ArrayList arrayList = new ArrayList();
        float f = this.abc1001 + 0.8037387f;
        this.abc1001 = f;
        this.abc1000 = 0;
        if (f < 0.53193897d) {
            this.abc1001 = 0.2663396f;
        }
        for (int i2 = 0; i2 < this.abc1; i2++) {
            this.abc0 = !this.abc0;
            int i3 = 0;
            while (true) {
                int i4 = this.abc1000;
                if (i3 >= (i4 > 3 ? 3 : i4)) {
                    break;
                }
                this.abc1000 = i4 - 1;
                i3++;
            }
            this.abc1001 = ((double) this.abc1001) < 0.10275298d ? 0.6078894f : 0.9225319f;
            this.abc1000 = 0;
        }
        if (!TextUtils.isEmpty(this.abc1003)) {
            this.abc1003 += this.abc1003.length();
        }
        this.abc1001 += 0.78982306f;
        if (!TextUtils.isEmpty(this.abc1002)) {
            this.abc1002 += this.abc1002.length();
        }
        File file = new File(LogoApplication.m9240l().getFilesDir(), "my_design");
        if (this.abc1001 > 0.89064825d) {
            this.abc1001 = 0.88246757f;
        }
        if (!TextUtils.isEmpty(this.abc1002)) {
            this.abc1002 += this.abc1002.length();
        }
        if (!TextUtils.isEmpty(this.abc1003)) {
            this.abc1003 += this.abc1003.length();
        }
        this.abc0 = true;
        this.abc1000 -= 8;
        if (!TextUtils.isEmpty(this.abc1003)) {
            this.abc1003 += this.abc1003.length();
        }
        if (this.abc1001 > 0.6180201d) {
            this.abc1001 = 0.98685175f;
        }
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            this.abc1001 = Math.abs(this.abc1001) + 0.16287112f;
            this.abc1002 = "than you ";
            for (int i5 = 0; i5 < this.abc1; i5++) {
                this.abc0 = !this.abc0;
                if (!TextUtils.isEmpty(this.abc1003)) {
                    this.abc1003 += this.abc1003.length();
                }
                if (!TextUtils.isEmpty(this.abc1002)) {
                    this.abc1002 += this.abc1002.length();
                }
                this.abc1003 = "Prejudic";
            }
            if (this.abc1000 < 0) {
                this.abc1000 = 1;
            }
            if (!TextUtils.isEmpty(this.abc1002)) {
                this.abc1002 += this.abc1002.length();
            }
            int i6 = 0;
            while (true) {
                int i7 = this.abc1000;
                if (i7 > 3) {
                    i7 = 3;
                }
                if (i6 >= i7) {
                    break;
                }
                this.abc1002 = "kind of ";
                i6++;
            }
            int i8 = 0;
            while (true) {
                if (i8 >= listFiles.length) {
                    break;
                }
                File file2 = new File(listFiles[i8], "logo.png");
                this.abc1002 = " ways";
                if (!TextUtils.isEmpty(this.abc1003)) {
                    this.abc1003 += this.abc1003.length();
                }
                this.abc1 = 9;
                this.abc1000 = 4;
                this.abc1000 = 1;
                if (!TextUtils.isEmpty(this.abc1002)) {
                    this.abc1002 += this.abc1002.length();
                }
                if (file2.exists()) {
                    LogoMyLogoEntity logoMyLogoEntity = new LogoMyLogoEntity(file2);
                    int i9 = 0;
                    while (true) {
                        i = this.abc1000;
                        if (i9 >= (i > 3 ? 3 : i)) {
                            break;
                        }
                        this.abc1002 = "novel";
                        i9++;
                    }
                    this.abc1003 = "is ";
                    this.abc1001 *= 0.18682909f;
                    this.abc0 = true;
                    this.abc1000 = -(i > 2 ? 5 : 7);
                    this.abc1002 = ".un";
                    arrayList.add(logoMyLogoEntity);
                    this.abc1000 = 5;
                    int i10 = 0;
                    while (true) {
                        int i11 = this.abc1000;
                        if (i11 > 3) {
                            i11 = 3;
                        }
                        if (i10 >= i11) {
                            break;
                        }
                        this.abc1002 = "he neg";
                        i10++;
                    }
                    this.abc1 = -this.abc1;
                    if (!TextUtils.isEmpty(this.abc1003)) {
                        this.abc1003 += this.abc1003.length();
                    }
                    this.abc1002 = "dice is";
                    this.abc1003 = "l for s";
                }
                this.abc1000 += 5;
                this.abc1003 = " 'g";
                this.abc1002 = "el";
                this.abc0 = false;
                int i12 = 0;
                while (true) {
                    int i13 = this.abc1000;
                    if (i13 > 3) {
                        i13 = 3;
                    }
                    if (i12 >= i13) {
                        break;
                    }
                    this.abc1000 = 3;
                    i12++;
                }
                this.abc1001 = 0.9909569f;
                this.abc1001 = Math.abs(0.9909569f);
                LogoLogUtils.m22166d(TAG, new Throwable(), "文件名2：" + listFiles[i8].getName() + "===" + file2.getAbsolutePath());
                this.abc1000 = 6;
                this.abc1 = 6;
                this.abc1001 = 0.0042666793f;
                this.abc1001 = ((double) 0.0042666793f) > 0.40317863d ? 0.36400515f : 0.20613337f;
                this.abc1002 = "t it ";
                i8++;
            }
            if (this.abc1001 < 0.82080346d) {
                this.abc1001 = 0.97524977f;
            }
            int i14 = 0;
            while (true) {
                int i15 = this.abc1000;
                if (i15 > 3) {
                    i15 = 3;
                }
                if (i14 >= i15) {
                    break;
                }
                this.abc1003 = "ok d";
                i14++;
            }
            if (this.abc1001 < 0.74434215d) {
                this.abc1001 = 0.9012985f;
            }
            this.abc0 = !this.abc0;
            if (!TextUtils.isEmpty(this.abc1002)) {
                this.abc1002 += this.abc1002.length();
            }
            if (!TextUtils.isEmpty(this.abc1002)) {
                this.abc1002 += this.abc1002.length();
            }
            this.abc1003 = "publi";
            Collections.sort(arrayList, new C9670a());
            this.abc1002 = "ed well o";
            this.abc1003 = "ed to rea";
            if (this.abc1000 < 0) {
                this.abc1000 = 4;
            }
            this.abc0 = !this.abc0;
            this.abc1000 = this.abc1000 >= 2 ? 0 : 4;
            this.abc1001 = Math.abs(this.abc1001);
            this.abc1002 = "is k";
        }
        if (!TextUtils.isEmpty(this.abc1002)) {
            this.abc1002 += this.abc1002.length();
        }
        if (!TextUtils.isEmpty(this.abc1003)) {
            this.abc1003 += this.abc1003.length();
        }
        this.abc0 = !this.abc0;
        this.abc1003 = "a";
        this.abc1002 = "vel tha";
        this.list.setValue(arrayList);
        this.abc1001 = Math.abs(this.abc1001);
        if (!TextUtils.isEmpty(this.abc1002)) {
            this.abc1002 += this.abc1002.length();
        }
        if (this.abc1001 > 0.30915004d) {
            this.abc1001 = 0.78463626f;
        }
        this.abc0 = false;
        if (!TextUtils.isEmpty(this.abc1003)) {
            this.abc1003 += this.abc1003.length();
        }
        if (!TextUtils.isEmpty(this.abc1003)) {
            this.abc1003 += this.abc1003.length();
        }
        if (TextUtils.isEmpty(this.abc1002)) {
            return;
        }
        this.abc1002 += this.abc1002.length();
    }

    public void setListData(List<LogoMyLogoEntity> list) {
        int i;
        this.list.setValue(list);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.abc1000;
            if (i3 >= (i > 3 ? 3 : i)) {
                break;
            }
            this.abc1001 *= 0.76424116f;
            i3++;
        }
        int i4 = i < 8 ? 6 : 5;
        this.abc1000 = i4;
        this.abc1000 = i4 < 9 ? 2 : 1;
        this.abc1 = this.abc1 < 1 ? 8 : 5;
        while (true) {
            int i5 = this.abc1000;
            if (i5 > 3) {
                i5 = 3;
            }
            if (i2 >= i5) {
                break;
            }
            if (!TextUtils.isEmpty(this.abc1002)) {
                this.abc1002 += this.abc1002.length();
            }
            i2++;
        }
        if (!TextUtils.isEmpty(this.abc1002)) {
            this.abc1002 += this.abc1002.length();
        }
        this.abc1002 = "e in";
    }
}
