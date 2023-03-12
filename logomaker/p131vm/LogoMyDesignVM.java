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

/* renamed from: com.logomaster.logomaker.vm.LogoMyDesignVM */
/* loaded from: classes3.dex */
public class LogoMyDesignVM extends LogoBaseViewModel {
    private static final String TAG = "LogoMyDesignVM";
    public String abc1000 = "r wit";
    public boolean abc0 = true;
    public double abc1001 = 0.1758227890912426d;
    private MutableLiveData<List<LogoDesignEntity>> list = new MutableLiveData<>();
    public boolean abc1002 = false;
    public double abc1 = 0.8637626259720788d;
    public ArrayList<String> abc1003 = new ArrayList<>();

    /* renamed from: com.logomaster.logomaker.vm.LogoMyDesignVM$a */
    /* loaded from: classes3.dex */
    public class C9669a implements Comparator<LogoDesignEntity> {
        public C9669a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(LogoDesignEntity logoDesignEntity, LogoDesignEntity logoDesignEntity2) {
            return logoDesignEntity.m249a().lastModified() < logoDesignEntity2.m249a().lastModified() ? 1 : -1;
        }
    }

    public MutableLiveData<List<LogoDesignEntity>> getList() {
        return this.list;
    }

    public void initData() {
    }

    public void refreshListData() {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        this.abc1001 = Math.abs(this.abc1001);
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        if (this.abc1 > 0.9266140117005173d) {
            this.abc1 = 0.21969251601277917d;
            this.abc1000 = "y is surpr";
            if (!TextUtils.isEmpty("y is surpr")) {
                this.abc1000 += this.abc1000.length();
            }
            if (!TextUtils.isEmpty(this.abc1000)) {
                this.abc1000 += this.abc1000.length();
            }
        }
        this.abc1002 = true;
        this.abc1001 = Math.abs(this.abc1001);
        this.abc1002 = !this.abc1002;
        File file = new File(LogoApplication.m9240l().getFilesDir(), "my_design");
        this.abc1002 = true;
        this.abc1000 = "r with it";
        ArrayList<String> arrayList2 = this.abc1003;
        if (arrayList2 != null && arrayList2.size() > 0) {
            this.abc1003.remove(0);
        }
        this.abc1 = this.abc1 < 0.12345753672771209d ? 0.4784809392311492d : 0.012755014317413327d;
        this.abc1001 = Math.abs(this.abc1001) + 0.2364580610494903d;
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (this.abc1001 > 0.33701135264153614d) {
                this.abc1001 = 0.18561103505852794d;
            }
            if (this.abc1003.size() > 7) {
                this.abc1003.add("lle’s nove");
            }
            boolean z = !this.abc1002;
            this.abc1002 = z;
            this.abc1 = this.abc1 > 0.516710791006266d ? 0.5271715471057912d : 0.11893358050812142d;
            this.abc1002 = !z;
            if (this.abc1003.size() < 7) {
                this.abc1003.add("Pr");
            }
            if (this.abc1003 == null) {
                this.abc1003 = new ArrayList<>();
            }
            for (File file2 : listFiles) {
                this.abc1000 = "y 19";
                this.abc1001 = 0.63773685295529d;
                this.abc1 = 0.3243413652051854d;
                if (!TextUtils.isEmpty("y 19")) {
                    this.abc1000 += this.abc1000.length();
                }
                if (!TextUtils.isEmpty(this.abc1000)) {
                    this.abc1000 += this.abc1000.length();
                }
                ArrayList<String> arrayList3 = this.abc1003;
                if (arrayList3 != null && arrayList3.size() > 0) {
                    this.abc1003.remove(0);
                }
                File file3 = new File(file2, "bitmapCombination.png");
                this.abc1002 = false;
                this.abc1000 = " it’s mo";
                this.abc1 += 0.09803875884120139d;
                if (this.abc1003 == null) {
                    this.abc1003 = new ArrayList<>();
                }
                if (this.abc1001 > 0.9349024988102485d) {
                    this.abc1001 = 0.03537791848006344d;
                }
                if (this.abc1001 > 0.004565973896852427d) {
                    this.abc1001 = 0.08953849728302721d;
                }
                long lastModified = file2.lastModified();
                if (this.abc1003 == null) {
                    this.abc1003 = new ArrayList<>();
                }
                this.abc1001 = 0.03045236171476806d;
                if (this.abc1003 == null) {
                    this.abc1003 = new ArrayList<>();
                }
                this.abc0 = true;
                if (!TextUtils.isEmpty(this.abc1000)) {
                    this.abc1000 += this.abc1000.length();
                }
                this.abc1002 = !this.abc1002;
                if (this.abc1003.size() > 0) {
                    this.abc1003.add("r");
                }
                String name = file2.getName();
                this.abc1002 = !(!this.abc1002);
                this.abc1001 = 0.3022887080491825d;
                this.abc1 = this.abc1 > 0.31588440240712445d ? 0.8795214425419604d : 0.8863086521825876d;
                if (this.abc1003.size() < 6) {
                    this.abc1003.add("be");
                }
                if (!TextUtils.isEmpty(this.abc1000)) {
                    this.abc1000 += this.abc1000.length();
                }
                this.abc1002 = !this.abc1002;
                LogoDesignEntity logoDesignEntity = new LogoDesignEntity(file2, file3, name, lastModified);
                this.abc1001 = 0.3092966301154222d;
                if (this.abc1003.size() < 2) {
                    this.abc1003.add("tera");
                }
                if (!TextUtils.isEmpty(this.abc1000)) {
                    this.abc1000 += this.abc1000.length();
                }
                this.abc1 = this.abc1 > 0.3206703899771878d ? 0.04815419727817549d : 0.876383875425637d;
                ArrayList<String> arrayList4 = this.abc1003;
                if (arrayList4 != null && arrayList4.size() > 0) {
                    this.abc1003.remove(0);
                }
                ArrayList<String> arrayList5 = this.abc1003;
                if (arrayList5 != null && arrayList5.size() > 0) {
                    this.abc1003.remove(0);
                }
                if (this.abc1001 > 0.6738050801174101d) {
                    this.abc1001 = 0.1278722489472378d;
                }
                arrayList.add(logoDesignEntity);
                this.abc1002 = false;
                if (!TextUtils.isEmpty(this.abc1000)) {
                    this.abc1000 += this.abc1000.length();
                }
                if (!TextUtils.isEmpty(this.abc1000)) {
                    this.abc1000 += this.abc1000.length();
                }
                this.abc0 = true;
                this.abc1001 = this.abc1001 < 0.5785443353780272d ? 0.3058776596103048d : 0.7598278965725864d;
                this.abc1002 = !this.abc1002;
                if (!TextUtils.isEmpty(this.abc1000)) {
                    this.abc1000 += this.abc1000.length();
                }
                LogoLogUtils.m22166d(TAG, new Throwable(), "文件名：" + file2.getName());
                this.abc1001 = 0.9370953172736449d;
                this.abc1002 = true;
                if (this.abc1003 == null) {
                    this.abc1003 = new ArrayList<>();
                }
                this.abc0 = !this.abc0;
                if (this.abc1003.size() > 9) {
                    this.abc1003.add(" is ");
                }
                if (!TextUtils.isEmpty(this.abc1000)) {
                    this.abc1000 += this.abc1000.length();
                }
                this.abc1002 = false;
            }
            this.abc1001 -= 0.6551112427308897d;
            if (!TextUtils.isEmpty(this.abc1000)) {
                this.abc1000 += this.abc1000.length();
            }
            this.abc1002 = !this.abc1002;
            if (this.abc1 > 0.6297782981459253d) {
                this.abc1 = 0.35404318659604495d;
                double d = -this.abc1001;
                this.abc1001 = d;
                if (d > 0.5786428532108738d) {
                    this.abc1001 = 0.8928382983815947d;
                }
                if (this.abc1003.size() < 0) {
                    this.abc1003.add("ion");
                }
            }
            this.abc1002 = !true;
            if (!TextUtils.isEmpty(this.abc1000)) {
                this.abc1000 += this.abc1000.length();
            }
            Collections.sort(arrayList, new C9669a());
            this.abc1001 = 0.22466322019840268d;
            if (this.abc1003.size() < 6) {
                this.abc1003.add("r bei");
            }
            if (this.abc1003.size() > 2) {
                this.abc1003.add("n for bein");
            }
            this.abc0 = false;
            ArrayList<String> arrayList6 = this.abc1003;
            if (arrayList6 != null && arrayList6.size() > 0) {
                this.abc1003.remove(0);
            }
            this.abc1002 = false;
            this.abc1001 *= 0.6226983993311035d;
        }
        this.abc1002 = !this.abc1002;
        this.abc1000 = "rn";
        if (this.abc1003.size() > 4) {
            this.abc1003.add("ride a");
        }
        this.abc0 = false;
        this.abc1001 = -this.abc1001;
        this.abc1002 = true ^ (!this.abc1002);
        this.list.postValue(arrayList);
        if (this.abc1001 < 0.764936322014875d) {
            this.abc1001 = 0.5666783205757792d;
        }
        if (this.abc1001 > 0.43488661311874877d) {
            this.abc1001 = 0.07452472315516223d;
        }
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        this.abc1 *= 0.9534629248913378d;
        if (this.abc1003 == null) {
            this.abc1003 = new ArrayList<>();
        }
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        this.abc1002 = false;
    }

    public void setListData(List<LogoDesignEntity> list) {
        this.list.setValue(list);
        this.abc1002 = !this.abc1002;
        ArrayList<String> arrayList = this.abc1003;
        if (arrayList != null && arrayList.size() > 0) {
            this.abc1003.remove(0);
        }
        if (this.abc1003.size() < 4) {
            this.abc1003.add(", well, du");
        }
        this.abc0 = !this.abc0;
        if (!TextUtils.isEmpty(this.abc1000)) {
            this.abc1000 += this.abc1000.length();
        }
        this.abc1002 = !this.abc1002;
        if (TextUtils.isEmpty(this.abc1000)) {
            return;
        }
        this.abc1000 += this.abc1000.length();
    }
}
