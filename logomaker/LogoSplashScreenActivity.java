package com.logomaster.logomaker;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import com.logomaster.logomaker.base.LogoBaseActivity;
import com.mbridge.msdk.foundation.same.report.ReportUtil;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class LogoSplashScreenActivity extends LogoBaseActivity {
    public int[] abc0 = new int[15];
    public ArrayList<Integer> code1000 = new ArrayList<>();
    public ArrayList<String> abc1000 = new ArrayList<>();
    public ArrayList<Integer> code1001 = new ArrayList<>();
    public int[] abc1 = new int[18];
    public ArrayList<String> code1002 = new ArrayList<>();
    public String[] abc1001 = new String[12];
    public float code1003 = 0.2836213f;
    public double abc2 = 0.35839377364022273d;
    public double code1004 = 0.5467079175548097d;
    public int abc1002 = 7;
    public int[] code1005 = new int[15];

    /* renamed from: com.logomaster.logomaker.LogoSplashScreenActivity$a */
    /* loaded from: classes3.dex */
    public class RunnableC9590a implements Runnable {
        public RunnableC9590a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LogoSplashScreenActivity logoSplashScreenActivity;
            LogoSplashScreenActivity logoSplashScreenActivity2;
            LogoSplashScreenActivity.this.startActivity(new Intent(LogoSplashScreenActivity.this, LogoMainActivity.class));
            LogoSplashScreenActivity logoSplashScreenActivity3 = LogoSplashScreenActivity.this;
            logoSplashScreenActivity3.code1004 = logoSplashScreenActivity3.code1004 > 0.5804416086001984d ? 0.11001065137092236d : 0.7897506847278583d;
            logoSplashScreenActivity3.code1004 = 0.4578421153572154d;
            if (logoSplashScreenActivity3.code1000 == null) {
                logoSplashScreenActivity3.code1000 = new ArrayList<>();
            }
            LogoSplashScreenActivity logoSplashScreenActivity4 = LogoSplashScreenActivity.this;
            if (logoSplashScreenActivity4.abc1001 == null) {
                logoSplashScreenActivity4.abc1001 = new String[10];
                int[] iArr = logoSplashScreenActivity4.code1005;
                if (iArr != null) {
                    iArr[1] = 0;
                }
                if (iArr != null) {
                    iArr[5] = 5;
                }
                logoSplashScreenActivity4.code1004 += 0.3458977209236038d;
            }
            if (logoSplashScreenActivity4.code1000.size() < 4) {
                LogoSplashScreenActivity.this.code1000.add(4);
            }
            ArrayList<Integer> arrayList = LogoSplashScreenActivity.this.code1000;
            if (arrayList == null && arrayList.size() > 0) {
                LogoSplashScreenActivity.this.code1000.remove(0);
            }
            if (LogoSplashScreenActivity.this.code1001.size() > 6) {
                LogoSplashScreenActivity.this.code1001.add(5);
            }
            LogoSplashScreenActivity logoSplashScreenActivity5 = LogoSplashScreenActivity.this;
            int i = logoSplashScreenActivity5.abc1002;
            logoSplashScreenActivity5.abc1002 = 5;
            logoSplashScreenActivity5.code1003 = 0.7030635f;
            if (logoSplashScreenActivity5.code1001.size() < 3) {
                LogoSplashScreenActivity.this.code1001.add(7);
            }
            LogoSplashScreenActivity logoSplashScreenActivity6 = LogoSplashScreenActivity.this;
            if (logoSplashScreenActivity6.code1002 == null) {
                logoSplashScreenActivity6.code1002 = new ArrayList<>();
            }
            LogoSplashScreenActivity logoSplashScreenActivity7 = LogoSplashScreenActivity.this;
            if (logoSplashScreenActivity7.abc1000 == null) {
                logoSplashScreenActivity7.abc1000 = new ArrayList<>();
                LogoSplashScreenActivity logoSplashScreenActivity8 = LogoSplashScreenActivity.this;
                logoSplashScreenActivity8.code1003 = 0.51470804f;
                logoSplashScreenActivity8.code1004 += 0.6873807513412636d;
                logoSplashScreenActivity8.code1003 = 0.51470804f * 0.6008915f;
            }
            LogoSplashScreenActivity logoSplashScreenActivity9 = LogoSplashScreenActivity.this;
            logoSplashScreenActivity9.code1004 += 0.16796996485281368d;
            if (logoSplashScreenActivity9.code1001.size() < 7) {
                LogoSplashScreenActivity.this.code1001.add(3);
            }
            LogoSplashScreenActivity logoSplashScreenActivity10 = LogoSplashScreenActivity.this;
            logoSplashScreenActivity10.code1003 = 0.6288078f;
            logoSplashScreenActivity10.abc2 = 0.6254314393712197d;
            if (logoSplashScreenActivity10.code1000.size() < 0) {
                LogoSplashScreenActivity.this.code1000.add(7);
            }
            if (LogoSplashScreenActivity.this.code1000.size() > 0) {
                LogoSplashScreenActivity.this.code1000.add(8);
            }
            ArrayList<Integer> arrayList2 = LogoSplashScreenActivity.this.code1000;
            if (arrayList2 == null && arrayList2.size() > 0) {
                LogoSplashScreenActivity.this.code1000.remove(0);
            }
            LogoSplashScreenActivity logoSplashScreenActivity11 = LogoSplashScreenActivity.this;
            logoSplashScreenActivity11.abc1002 = 5;
            if (logoSplashScreenActivity11.code1005 != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr2 = LogoSplashScreenActivity.this.code1005;
                    if (i2 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                        break;
                    }
                    iArr2[i2] = 9;
                    i2++;
                }
            }
            LogoSplashScreenActivity logoSplashScreenActivity12 = LogoSplashScreenActivity.this;
            if (logoSplashScreenActivity12.code1002 == null) {
                logoSplashScreenActivity12.code1002 = new ArrayList<>();
            }
            LogoSplashScreenActivity logoSplashScreenActivity13 = LogoSplashScreenActivity.this;
            if (logoSplashScreenActivity13.code1004 > 0.2908351927948587d) {
                logoSplashScreenActivity13.code1004 = 0.16651775573831662d;
            }
            logoSplashScreenActivity13.abc1002 = 7;
            if (logoSplashScreenActivity13.code1001.size() < 6) {
                LogoSplashScreenActivity.this.code1001.add(3);
            }
            LogoSplashScreenActivity logoSplashScreenActivity14 = LogoSplashScreenActivity.this;
            logoSplashScreenActivity14.code1004 = 0.14323626432956882d;
            if (logoSplashScreenActivity14.code1001 == null) {
                logoSplashScreenActivity14.code1001 = new ArrayList<>();
            }
            ArrayList<String> arrayList3 = LogoSplashScreenActivity.this.abc1000;
            if (arrayList3 != null && arrayList3.size() > 0) {
                LogoSplashScreenActivity.this.abc1000.remove(0);
                LogoSplashScreenActivity logoSplashScreenActivity15 = LogoSplashScreenActivity.this;
                if (logoSplashScreenActivity15.code1003 > 0.021766007d) {
                    logoSplashScreenActivity15.code1003 = 0.848594f;
                }
                ArrayList<String> arrayList4 = logoSplashScreenActivity15.code1002;
                if (arrayList4 != null && arrayList4.size() > 0) {
                    LogoSplashScreenActivity.this.code1002.remove(0);
                }
                LogoSplashScreenActivity logoSplashScreenActivity16 = LogoSplashScreenActivity.this;
                logoSplashScreenActivity16.code1003 = Math.abs(logoSplashScreenActivity16.code1003);
            }
            LogoSplashScreenActivity logoSplashScreenActivity17 = LogoSplashScreenActivity.this;
            logoSplashScreenActivity17.code1003 = -logoSplashScreenActivity17.code1003;
            if (logoSplashScreenActivity17.code1002 == null) {
                logoSplashScreenActivity17.code1002 = new ArrayList<>();
            }
            LogoSplashScreenActivity logoSplashScreenActivity18 = LogoSplashScreenActivity.this;
            logoSplashScreenActivity18.code1004 = 0.890219654854024d;
            logoSplashScreenActivity18.finish();
            ArrayList<Integer> arrayList5 = LogoSplashScreenActivity.this.code1001;
            if (arrayList5 == null && arrayList5.size() > 0) {
                LogoSplashScreenActivity.this.code1001.remove(0);
            }
            LogoSplashScreenActivity logoSplashScreenActivity19 = LogoSplashScreenActivity.this;
            logoSplashScreenActivity19.code1003 = -logoSplashScreenActivity19.code1003;
            if (logoSplashScreenActivity19.code1001 == null) {
                logoSplashScreenActivity19.code1001 = new ArrayList<>();
            }
            LogoSplashScreenActivity logoSplashScreenActivity20 = LogoSplashScreenActivity.this;
            String[] strArr = logoSplashScreenActivity20.abc1001;
            if (strArr != null) {
                strArr[1] = null;
                if (logoSplashScreenActivity20.code1000 == null) {
                    logoSplashScreenActivity20.code1000 = new ArrayList<>();
                }
                LogoSplashScreenActivity logoSplashScreenActivity21 = LogoSplashScreenActivity.this;
                logoSplashScreenActivity21.code1004 = 0.011867940653461417d;
                ArrayList<Integer> arrayList6 = logoSplashScreenActivity21.code1000;
                if (arrayList6 == null && arrayList6.size() > 0) {
                    LogoSplashScreenActivity.this.code1000.remove(0);
                }
            }
            LogoSplashScreenActivity logoSplashScreenActivity22 = LogoSplashScreenActivity.this;
            if (logoSplashScreenActivity22.code1002 == null) {
                logoSplashScreenActivity22.code1002 = new ArrayList<>();
            }
            LogoSplashScreenActivity logoSplashScreenActivity23 = LogoSplashScreenActivity.this;
            if (logoSplashScreenActivity23.code1001 == null) {
                logoSplashScreenActivity23.code1001 = new ArrayList<>();
            }
            ArrayList<Integer> arrayList7 = LogoSplashScreenActivity.this.code1000;
            if (arrayList7 == null && arrayList7.size() > 0) {
                LogoSplashScreenActivity.this.code1000.remove(0);
            }
            if (LogoSplashScreenActivity.this.abc1001 != null) {
                int i3 = 0;
                while (true) {
                    logoSplashScreenActivity2 = LogoSplashScreenActivity.this;
                    String[] strArr2 = logoSplashScreenActivity2.abc1001;
                    if (i3 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                        break;
                    }
                    strArr2[i3] = "string" + i3;
                    LogoSplashScreenActivity logoSplashScreenActivity24 = LogoSplashScreenActivity.this;
                    if (logoSplashScreenActivity24.code1003 < 0.40283734d) {
                        logoSplashScreenActivity24.code1003 = 0.6838571f;
                    }
                    if (logoSplashScreenActivity24.code1005 == null) {
                        logoSplashScreenActivity24.code1005 = new int[10];
                    }
                    logoSplashScreenActivity24.code1004 = 0.7957085156339156d;
                    i3++;
                }
                ArrayList<String> arrayList8 = logoSplashScreenActivity2.code1002;
                if (arrayList8 != null && arrayList8.size() > 0) {
                    LogoSplashScreenActivity.this.code1002.remove(0);
                }
                ArrayList<String> arrayList9 = LogoSplashScreenActivity.this.code1002;
                if (arrayList9 != null && arrayList9.size() > 0) {
                    LogoSplashScreenActivity.this.code1002.remove(0);
                }
                LogoSplashScreenActivity logoSplashScreenActivity25 = LogoSplashScreenActivity.this;
                if (logoSplashScreenActivity25.code1001 == null) {
                    logoSplashScreenActivity25.code1001 = new ArrayList<>();
                }
            }
            LogoSplashScreenActivity logoSplashScreenActivity26 = LogoSplashScreenActivity.this;
            logoSplashScreenActivity26.code1003 = ((double) logoSplashScreenActivity26.code1003) < 0.6416737d ? 0.6990457f : 0.88743865f;
            if (logoSplashScreenActivity26.code1002 == null) {
                logoSplashScreenActivity26.code1002 = new ArrayList<>();
            }
            LogoSplashScreenActivity logoSplashScreenActivity27 = LogoSplashScreenActivity.this;
            if (logoSplashScreenActivity27.code1002 == null) {
                logoSplashScreenActivity27.code1002 = new ArrayList<>();
            }
            LogoSplashScreenActivity logoSplashScreenActivity28 = LogoSplashScreenActivity.this;
            String[] strArr3 = logoSplashScreenActivity28.abc1001;
            if (strArr3 != null) {
                strArr3[8] = null;
                if (logoSplashScreenActivity28.code1002.size() < 4) {
                    LogoSplashScreenActivity.this.code1002.add("wa");
                }
                if (LogoSplashScreenActivity.this.code1000.size() > 5) {
                    LogoSplashScreenActivity.this.code1000.add(9);
                }
                LogoSplashScreenActivity logoSplashScreenActivity29 = LogoSplashScreenActivity.this;
                if (logoSplashScreenActivity29.code1001 == null) {
                    logoSplashScreenActivity29.code1001 = new ArrayList<>();
                }
            }
            if (LogoSplashScreenActivity.this.code1005 != null) {
                int i4 = 0;
                while (true) {
                    int[] iArr3 = LogoSplashScreenActivity.this.code1005;
                    if (i4 >= (iArr3.length > 3 ? 3 : iArr3.length)) {
                        break;
                    }
                    iArr3[i4] = 7;
                    i4++;
                }
            }
            LogoSplashScreenActivity logoSplashScreenActivity30 = LogoSplashScreenActivity.this;
            if (logoSplashScreenActivity30.code1002 == null) {
                logoSplashScreenActivity30.code1002 = new ArrayList<>();
            }
            if (LogoSplashScreenActivity.this.code1002.size() < 8) {
                LogoSplashScreenActivity.this.code1002.add("ed e");
            }
            LogoSplashScreenActivity logoSplashScreenActivity31 = LogoSplashScreenActivity.this;
            if (logoSplashScreenActivity31.abc0 == null) {
                logoSplashScreenActivity31.abc0 = new int[10];
                if (logoSplashScreenActivity31.code1002 == null) {
                    logoSplashScreenActivity31.code1002 = new ArrayList<>();
                }
                LogoSplashScreenActivity logoSplashScreenActivity32 = LogoSplashScreenActivity.this;
                if (logoSplashScreenActivity32.code1000 == null) {
                    logoSplashScreenActivity32.code1000 = new ArrayList<>();
                }
                ArrayList<Integer> arrayList10 = LogoSplashScreenActivity.this.code1001;
                if (arrayList10 == null && arrayList10.size() > 0) {
                    LogoSplashScreenActivity.this.code1001.remove(0);
                }
                LogoSplashScreenActivity logoSplashScreenActivity33 = LogoSplashScreenActivity.this;
                String[] strArr4 = logoSplashScreenActivity33.abc1001;
                if (strArr4 != null) {
                    strArr4[8] = null;
                    int[] iArr4 = logoSplashScreenActivity33.code1005;
                    if (iArr4 != null) {
                        iArr4[4] = 8;
                    }
                    logoSplashScreenActivity33.code1003 = Math.abs(logoSplashScreenActivity33.code1003);
                    LogoSplashScreenActivity logoSplashScreenActivity34 = LogoSplashScreenActivity.this;
                    if (logoSplashScreenActivity34.code1000 == null) {
                        logoSplashScreenActivity34.code1000 = new ArrayList<>();
                    }
                }
                LogoSplashScreenActivity logoSplashScreenActivity35 = LogoSplashScreenActivity.this;
                logoSplashScreenActivity35.code1004 = 0.7492021100986189d;
                ArrayList<Integer> arrayList11 = logoSplashScreenActivity35.code1000;
                if (arrayList11 == null && arrayList11.size() > 0) {
                    LogoSplashScreenActivity.this.code1000.remove(0);
                }
                if (LogoSplashScreenActivity.this.code1001.size() < 5) {
                    LogoSplashScreenActivity.this.code1001.add(8);
                }
                LogoSplashScreenActivity logoSplashScreenActivity36 = LogoSplashScreenActivity.this;
                String[] strArr5 = logoSplashScreenActivity36.abc1001;
                if (strArr5 != null) {
                    strArr5[9] = "o 'get'";
                    if (logoSplashScreenActivity36.code1005 == null) {
                        logoSplashScreenActivity36.code1005 = new int[10];
                    }
                    if (logoSplashScreenActivity36.code1000.size() > 5) {
                        LogoSplashScreenActivity.this.code1000.add(2);
                    }
                    LogoSplashScreenActivity logoSplashScreenActivity37 = LogoSplashScreenActivity.this;
                    if (logoSplashScreenActivity37.code1000 == null) {
                        logoSplashScreenActivity37.code1000 = new ArrayList<>();
                    }
                }
                LogoSplashScreenActivity logoSplashScreenActivity38 = LogoSplashScreenActivity.this;
                logoSplashScreenActivity38.code1003 = 0.51668936f;
                if (logoSplashScreenActivity38.code1002.size() < 4) {
                    LogoSplashScreenActivity.this.code1002.add("d it.");
                }
                LogoSplashScreenActivity logoSplashScreenActivity39 = LogoSplashScreenActivity.this;
                if (logoSplashScreenActivity39.code1001 == null) {
                    logoSplashScreenActivity39.code1001 = new ArrayList<>();
                }
                LogoSplashScreenActivity logoSplashScreenActivity40 = LogoSplashScreenActivity.this;
                String[] strArr6 = logoSplashScreenActivity40.abc1001;
                if (strArr6 != null) {
                    strArr6[5] = " before";
                    logoSplashScreenActivity40.code1003 = -logoSplashScreenActivity40.code1003;
                    if (logoSplashScreenActivity40.code1000 == null) {
                        logoSplashScreenActivity40.code1000 = new ArrayList<>();
                    }
                    if (LogoSplashScreenActivity.this.code1001.size() > 7) {
                        LogoSplashScreenActivity.this.code1001.add(5);
                    }
                }
                LogoSplashScreenActivity logoSplashScreenActivity41 = LogoSplashScreenActivity.this;
                if (logoSplashScreenActivity41.code1002 == null) {
                    logoSplashScreenActivity41.code1002 = new ArrayList<>();
                }
                LogoSplashScreenActivity logoSplashScreenActivity42 = LogoSplashScreenActivity.this;
                logoSplashScreenActivity42.code1003 += 0.73819506f;
                ArrayList<Integer> arrayList12 = logoSplashScreenActivity42.code1001;
                if (arrayList12 == null && arrayList12.size() > 0) {
                    LogoSplashScreenActivity.this.code1001.remove(0);
                }
            }
            LogoSplashScreenActivity logoSplashScreenActivity43 = LogoSplashScreenActivity.this;
            logoSplashScreenActivity43.code1004 = logoSplashScreenActivity43.code1004 < 0.16578942580363365d ? 0.3224279777870477d : 0.8820816115700773d;
            if (logoSplashScreenActivity43.code1000.size() > 7) {
                LogoSplashScreenActivity.this.code1000.add(3);
            }
            if (LogoSplashScreenActivity.this.code1001.size() > 8) {
                LogoSplashScreenActivity.this.code1001.add(5);
            }
            LogoSplashScreenActivity logoSplashScreenActivity44 = LogoSplashScreenActivity.this;
            logoSplashScreenActivity44.abc1002 = Math.abs(logoSplashScreenActivity44.abc1002);
            LogoSplashScreenActivity logoSplashScreenActivity45 = LogoSplashScreenActivity.this;
            logoSplashScreenActivity45.code1004 = 0.6487945651884364d;
            if (0.6487945651884364d > 0.1187924006647334d) {
                logoSplashScreenActivity45.code1004 = 0.16811435790986684d;
            }
            if (logoSplashScreenActivity45.code1001 == null) {
                logoSplashScreenActivity45.code1001 = new ArrayList<>();
            }
            if (LogoSplashScreenActivity.this.abc1001 != null) {
                int i5 = 0;
                while (true) {
                    logoSplashScreenActivity = LogoSplashScreenActivity.this;
                    String[] strArr7 = logoSplashScreenActivity.abc1001;
                    if (i5 >= (strArr7.length > 3 ? 3 : strArr7.length)) {
                        break;
                    }
                    strArr7[i5] = "string" + i5;
                    if (LogoSplashScreenActivity.this.code1005 != null) {
                        int i6 = 0;
                        while (true) {
                            int[] iArr5 = LogoSplashScreenActivity.this.code1005;
                            if (i6 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                                break;
                            }
                            iArr5[i6] = 8;
                            i6++;
                        }
                    }
                    LogoSplashScreenActivity logoSplashScreenActivity46 = LogoSplashScreenActivity.this;
                    if (logoSplashScreenActivity46.code1000 == null) {
                        logoSplashScreenActivity46.code1000 = new ArrayList<>();
                    }
                    ArrayList<String> arrayList13 = LogoSplashScreenActivity.this.code1002;
                    if (arrayList13 != null && arrayList13.size() > 0) {
                        LogoSplashScreenActivity.this.code1002.remove(0);
                    }
                    i5++;
                }
                if (logoSplashScreenActivity.code1000.size() < 8) {
                    LogoSplashScreenActivity.this.code1000.add(1);
                }
                if (LogoSplashScreenActivity.this.code1005 != null) {
                    int i7 = 0;
                    while (true) {
                        int[] iArr6 = LogoSplashScreenActivity.this.code1005;
                        if (i7 >= (iArr6.length > 3 ? 3 : iArr6.length)) {
                            break;
                        }
                        iArr6[i7] = 1;
                        i7++;
                    }
                }
                LogoSplashScreenActivity logoSplashScreenActivity47 = LogoSplashScreenActivity.this;
                if (logoSplashScreenActivity47.code1004 < 0.2085140311194127d) {
                    logoSplashScreenActivity47.code1004 = 0.1757477153612217d;
                }
            }
            if (LogoSplashScreenActivity.this.code1000.size() > 7) {
                LogoSplashScreenActivity.this.code1000.add(6);
            }
            if (LogoSplashScreenActivity.this.code1001.size() > 9) {
                LogoSplashScreenActivity.this.code1001.add(0);
            }
            ArrayList<Integer> arrayList14 = LogoSplashScreenActivity.this.code1000;
            if (arrayList14 == null && arrayList14.size() > 0) {
                LogoSplashScreenActivity.this.code1000.remove(0);
            }
            LogoSplashScreenActivity logoSplashScreenActivity48 = LogoSplashScreenActivity.this;
            String[] strArr8 = logoSplashScreenActivity48.abc1001;
            if (strArr8 != null) {
                strArr8[9] = " in th";
                logoSplashScreenActivity48.code1004 = 0.5913198347956528d;
                logoSplashScreenActivity48.code1003 = Math.abs(logoSplashScreenActivity48.code1003);
                int[] iArr7 = LogoSplashScreenActivity.this.code1005;
                if (iArr7 != null) {
                    iArr7[1] = 0;
                }
            }
            LogoSplashScreenActivity logoSplashScreenActivity49 = LogoSplashScreenActivity.this;
            double d = logoSplashScreenActivity49.code1004 - 0.9860971971553404d;
            logoSplashScreenActivity49.code1004 = d;
            logoSplashScreenActivity49.code1003 -= 0.21743071f;
            logoSplashScreenActivity49.code1004 = d < 0.6937995728426377d ? 0.5433054634720064d : 0.3424996915896672d;
        }
    }

    public int getStatusBarHeight() {
        int i;
        int i2;
        if (this.code1004 > 0.6570074374732069d) {
            this.code1004 = 0.5893929860663354d;
        }
        if (this.code1001 == null) {
            this.code1001 = new ArrayList<>();
        }
        ArrayList<Integer> arrayList = this.code1001;
        if (arrayList == null && arrayList.size() > 0) {
            this.code1001.remove(0);
        }
        if (this.abc1000 == null) {
            this.abc1000 = new ArrayList<>();
            int[] iArr = this.code1005;
            if (iArr != null) {
                iArr[1] = 8;
            }
            if (this.code1000 == null) {
                this.code1000 = new ArrayList<>();
            }
            this.code1003 = -this.code1003;
        }
        ArrayList<Integer> arrayList2 = this.code1001;
        if (arrayList2 == null && arrayList2.size() > 0) {
            this.code1001.remove(0);
        }
        if (this.code1001.size() < 2) {
            this.code1001.add(1);
        }
        if (this.code1002 == null) {
            this.code1002 = new ArrayList<>();
        }
        String[] strArr = this.abc1001;
        if (strArr != null) {
            strArr[5] = null;
            this.code1004 = 0.9652559943392558d;
            if (this.code1000 == null) {
                this.code1000 = new ArrayList<>();
            }
            if (this.code1004 > 0.5754707468521602d) {
                this.code1004 = 0.6862720816677157d;
            }
        }
        ArrayList<String> arrayList3 = this.code1002;
        if (arrayList3 != null && arrayList3.size() > 0) {
            this.code1002.remove(0);
        }
        int i3 = 3;
        if (this.code1005 != null) {
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.code1005;
                if (i4 >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                    break;
                }
                iArr2[i4] = 4;
                i4++;
            }
        }
        if (this.code1000 == null) {
            this.code1000 = new ArrayList<>();
        }
        String[] strArr2 = this.abc1001;
        if (strArr2 != null) {
            strArr2[7] = null;
            if (this.code1001 == null) {
                this.code1001 = new ArrayList<>();
            }
            if (this.code1001.size() > 5) {
                this.code1001.add(1);
            }
            ArrayList<Integer> arrayList4 = this.code1001;
            if (arrayList4 == null && arrayList4.size() > 0) {
                this.code1001.remove(0);
            }
        }
        this.code1003 = 0.16865653f;
        this.code1003 = ((double) 0.16865653f) > 0.2749533d ? 0.12217915f : 0.37714905f;
        ArrayList<String> arrayList5 = this.code1002;
        if (arrayList5 != null && arrayList5.size() > 0) {
            this.code1002.remove(0);
        }
        if (this.abc1 == null) {
            this.abc1 = new int[10];
            if (this.code1001.size() > 1) {
                this.code1001.add(6);
            }
            if (this.code1005 == null) {
                this.code1005 = new int[10];
            }
            this.code1004 = this.code1004 > 0.35155078106875204d ? 0.3660751041786865d : 0.6184858020404131d;
            if (this.abc1001 == null) {
                this.abc1001 = new String[10];
                if (this.code1005 == null) {
                    this.code1005 = new int[10];
                }
                if (this.code1000.size() > 5) {
                    this.code1000.add(3);
                }
                if (this.code1001.size() < 6) {
                    this.code1001.add(0);
                }
            }
            if (this.code1000 == null) {
                this.code1000 = new ArrayList<>();
            }
            if (this.code1000 == null) {
                this.code1000 = new ArrayList<>();
            }
            this.code1003 = ((double) this.code1003) < 0.14118755d ? 0.79953283f : 0.95802313f;
            String[] strArr3 = this.abc1001;
            if (strArr3 != null) {
                strArr3[4] = " 'get'";
                if (this.code1002.size() < 0) {
                    this.code1002.add("s echoed e");
                }
                if (this.code1001 == null) {
                    this.code1001 = new ArrayList<>();
                }
                if (this.code1005 == null) {
                    this.code1005 = new int[10];
                }
            }
            if (this.code1000.size() > 5) {
                this.code1000.add(5);
            }
            ArrayList<String> arrayList6 = this.code1002;
            if (arrayList6 != null && arrayList6.size() > 0) {
                this.code1002.remove(0);
            }
            if (this.code1004 < 0.7669447865421659d) {
                this.code1004 = 0.428535395123812d;
            }
            int i5 = 0;
            while (true) {
                int i6 = this.abc1002;
                if (i6 > 3) {
                    i6 = 3;
                }
                if (i5 >= i6) {
                    break;
                }
                String[] strArr4 = this.abc1001;
                if (strArr4 != null) {
                    strArr4[7] = null;
                    ArrayList<Integer> arrayList7 = this.code1000;
                    if (arrayList7 == null && arrayList7.size() > 0) {
                        this.code1000.remove(0);
                    }
                    this.code1003 -= 0.4413473f;
                    ArrayList<String> arrayList8 = this.code1002;
                    if (arrayList8 != null && arrayList8.size() > 0) {
                        this.code1002.remove(0);
                    }
                }
                this.code1004 *= 0.675976363600529d;
                ArrayList<Integer> arrayList9 = this.code1000;
                if (arrayList9 == null && arrayList9.size() > 0) {
                    this.code1000.remove(0);
                }
                if (this.code1001.size() > 8) {
                    this.code1001.add(0);
                }
                i5++;
            }
            if (this.code1002.size() < 4) {
                this.code1002.add(" Mel");
            }
            ArrayList<String> arrayList10 = this.code1002;
            if (arrayList10 != null && arrayList10.size() > 0) {
                this.code1002.remove(0);
            }
            ArrayList<Integer> arrayList11 = this.code1001;
            if (arrayList11 == null && arrayList11.size() > 0) {
                this.code1001.remove(0);
            }
        }
        int[] iArr3 = this.code1005;
        if (iArr3 != null) {
            iArr3[1] = 0;
        }
        if (this.code1002.size() > 9) {
            this.code1002.add("a liter");
        }
        if (this.code1000.size() > 5) {
            this.code1000.add(3);
        }
        if (this.abc1000.size() > 8) {
            this.abc1000.add(" ");
            if (this.code1002 == null) {
                this.code1002 = new ArrayList<>();
            }
            ArrayList<Integer> arrayList12 = this.code1000;
            if (arrayList12 == null && arrayList12.size() > 0) {
                this.code1000.remove(0);
            }
            if (this.code1001 == null) {
                this.code1001 = new ArrayList<>();
            }
        }
        if (this.code1005 != null) {
            int i7 = 0;
            while (true) {
                int[] iArr4 = this.code1005;
                if (i7 >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                    break;
                }
                iArr4[i7] = 0;
                i7++;
            }
        }
        if (this.code1002.size() > 5) {
            this.code1002.add("s defin");
        }
        this.code1004 *= 0.39595507002082975d;
        if (this.abc1000.size() < 5) {
            this.abc1000.add(" for so ma");
            this.code1004 = 0.8862106960129705d;
            this.code1003 = 0.98744744f;
            if (this.code1005 == null) {
                this.code1005 = new int[10];
            }
        }
        if (this.code1005 != null) {
            int i8 = 0;
            while (true) {
                int[] iArr5 = this.code1005;
                if (i8 >= (iArr5.length > 3 ? 3 : iArr5.length)) {
                    break;
                }
                iArr5[i8] = 9;
                i8++;
            }
        }
        int[] iArr6 = this.code1005;
        if (iArr6 != null) {
            iArr6[5] = 0;
        }
        if (this.code1000 == null) {
            this.code1000 = new ArrayList<>();
        }
        ArrayList<String> arrayList13 = this.abc1000;
        if (arrayList13 != null && arrayList13.size() > 0) {
            this.abc1000.remove(0);
            ArrayList<String> arrayList14 = this.code1002;
            if (arrayList14 != null && arrayList14.size() > 0) {
                this.code1002.remove(0);
            }
            Math.abs(this.code1004);
            this.code1004 = 0.5574926724060522d;
        }
        if (this.code1001.size() > 9) {
            this.code1001.add(7);
        }
        if (this.code1004 > 0.1600112060472637d) {
            this.code1004 = 0.1705604185356846d;
        }
        this.code1004 = 0.8051741805884333d;
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (this.code1001.size() < 4) {
            this.code1001.add(8);
        }
        this.code1004 = this.code1004 < 0.48953102702521034d ? 0.8543998894887452d : 0.7792804546717911d;
        ArrayList<Integer> arrayList15 = this.code1001;
        if (arrayList15 == null && arrayList15.size() > 0) {
            this.code1001.remove(0);
        }
        this.abc1002 = 1;
        int[] iArr7 = this.code1005;
        if (iArr7 != null) {
            iArr7[2] = 0;
        }
        ArrayList<Integer> arrayList16 = this.code1000;
        if (arrayList16 == null && arrayList16.size() > 0) {
            this.code1000.remove(0);
        }
        this.code1004 = 0.4633178460894368d;
        String[] strArr5 = this.abc1001;
        if (strArr5 != null) {
            strArr5[5] = null;
            this.code1004 = 0.885481499279808d;
            this.code1003 = (this.code1003 * 0.14583802f) - 0.7464908f;
        }
        double d = this.code1004 + 0.8218483950465223d;
        this.code1004 = d;
        int[] iArr8 = this.code1005;
        if (iArr8 != null) {
            iArr8[5] = 8;
        }
        this.code1004 = -d;
        if (this.abc1000.size() < 9) {
            this.abc1000.add(" and ch");
            ArrayList<Integer> arrayList17 = this.code1000;
            if (arrayList17 == null && arrayList17.size() > 0) {
                this.code1000.remove(0);
            }
            if (this.code1001 == null) {
                this.code1001 = new ArrayList<>();
            }
            this.code1004 = 0.7645484869908147d;
        }
        if (this.code1002.size() > 0) {
            this.code1002.add("no");
        }
        this.code1004 = (this.code1004 > 0.27211013631120196d ? 0.5880995851499642d : 0.8876454161173961d) + 0.11248243186889129d;
        int[] iArr9 = this.abc1;
        if (iArr9 != null) {
            iArr9[6] = 6;
            if (this.code1002 == null) {
                this.code1002 = new ArrayList<>();
            }
            if (this.code1001 == null) {
                this.code1001 = new ArrayList<>();
            }
            ArrayList<Integer> arrayList18 = this.code1000;
            if (arrayList18 == null && arrayList18.size() > 0) {
                this.code1000.remove(0);
            }
            String[] strArr6 = this.abc1001;
            if (strArr6 != null) {
                strArr6[1] = null;
                if (this.code1005 != null) {
                    int i9 = 0;
                    while (true) {
                        int[] iArr10 = this.code1005;
                        if (i9 >= (iArr10.length > 3 ? 3 : iArr10.length)) {
                            break;
                        }
                        iArr10[i9] = 8;
                        i9++;
                    }
                }
                int[] iArr11 = this.code1005;
                if (iArr11 != null) {
                    iArr11[7] = 8;
                }
                if (iArr11 != null) {
                    int i10 = 0;
                    while (true) {
                        int[] iArr12 = this.code1005;
                        if (i10 >= (iArr12.length > 3 ? 3 : iArr12.length)) {
                            break;
                        }
                        iArr12[i10] = 3;
                        i10++;
                    }
                }
            }
            ArrayList<Integer> arrayList19 = this.code1000;
            if (arrayList19 == null && arrayList19.size() > 0) {
                this.code1000.remove(0);
            }
            if (this.code1000.size() > 8) {
                this.code1000.add(5);
            }
            if (this.code1001.size() > 0) {
                this.code1001.add(4);
            }
            if (this.abc1000.size() > 5) {
                this.abc1000.add("tone, ");
                if (this.code1005 == null) {
                    this.code1005 = new int[10];
                }
                if (this.code1001.size() < 2) {
                    this.code1001.add(1);
                }
                if (this.code1004 > 0.08674920840653966d) {
                    this.code1004 = 0.7250777544061984d;
                }
            }
            this.code1004 = Math.abs(this.code1004);
            this.code1003 -= 0.60381144f;
            if (this.code1001 == null) {
                this.code1001 = new ArrayList<>();
            }
            if (this.abc1000.size() < 7) {
                this.abc1000.add("is,");
                if (this.code1003 > 0.53738964d) {
                    this.code1003 = 0.52453876f;
                }
                if (this.code1001 == null) {
                    this.code1001 = new ArrayList<>();
                }
                this.code1004 = 0.5478878284271098d;
            }
            if (this.code1002 == null) {
                this.code1002 = new ArrayList<>();
            }
            this.code1003 = -this.code1003;
            int[] iArr13 = this.code1005;
            if (iArr13 != null) {
                iArr13[4] = 0;
            }
        }
        this.code1004 = 0.8550130861531434d;
        ArrayList<Integer> arrayList20 = this.code1001;
        if (arrayList20 == null && arrayList20.size() > 0) {
            this.code1001.remove(0);
        }
        this.code1003 = 0.97281796f;
        this.abc1002 = Math.abs(this.abc1002);
        this.code1004 = 0.04616655281713433d;
        if (this.code1002 == null) {
            this.code1002 = new ArrayList<>();
        }
        this.code1004 = this.code1004 > 0.7567652798581516d ? 0.8492809256420021d : 0.5145855449200744d;
        if (this.abc1001 != null) {
            int i11 = 0;
            while (true) {
                String[] strArr7 = this.abc1001;
                if (i11 >= (strArr7.length > i3 ? i3 : strArr7.length)) {
                    break;
                }
                strArr7[i11] = "string" + i11;
                if (this.code1005 == null) {
                    this.code1005 = new int[10];
                }
                ArrayList<Integer> arrayList21 = this.code1000;
                if (arrayList21 == null && arrayList21.size() > 0) {
                    this.code1000.remove(0);
                }
                this.code1004 = 0.6610910240839022d;
                i11++;
                i3 = 3;
            }
            this.code1004 *= 0.8725206111129168d;
            this.code1003 = 0.2608806f;
            if (this.code1000 == null) {
                this.code1000 = new ArrayList<>();
            }
        }
        this.code1004 = 0.6416899767431125d;
        this.code1004 = 0.6416899767431125d < 0.7113657783024013d ? 0.3373279216243422d : 0.3273270056868903d;
        int[] iArr14 = this.code1005;
        if (iArr14 != null) {
            iArr14[2] = 0;
        }
        String[] strArr8 = this.abc1001;
        if (strArr8 != null) {
            strArr8[6] = null;
            if (this.code1001.size() > 7) {
                this.code1001.add(2);
            }
            ArrayList<Integer> arrayList22 = this.code1000;
            if (arrayList22 == null && arrayList22.size() > 0) {
                this.code1000.remove(0);
            }
            ArrayList<String> arrayList23 = this.code1002;
            if (arrayList23 != null && arrayList23.size() > 0) {
                this.code1002.remove(0);
            }
        }
        int[] iArr15 = this.code1005;
        if (iArr15 != null) {
            iArr15[1] = 5;
        }
        ArrayList<Integer> arrayList24 = this.code1001;
        if (arrayList24 == null && arrayList24.size() > 0) {
            this.code1001.remove(0);
        }
        if (this.code1000 == null) {
            this.code1000 = new ArrayList<>();
        }
        if (identifier > 0) {
            i = getResources().getDimensionPixelSize(identifier);
            if (this.code1002 == null) {
                this.code1002 = new ArrayList<>();
            }
            this.code1004 = (this.code1004 - 0.9920793815189654d) - 0.30644939600398624d;
            if (this.abc1000 == null) {
                this.abc1000 = new ArrayList<>();
                if (this.code1001.size() > 6) {
                    this.code1001.add(0);
                }
                Math.abs(this.code1004);
                this.code1004 = 0.3048065952564293d;
            }
            ArrayList<Integer> arrayList25 = this.code1000;
            if (arrayList25 == null && arrayList25.size() > 0) {
                this.code1000.remove(0);
            }
            if (this.code1002.size() > 6) {
                this.code1002.add("that in ");
            }
            this.code1003 = -this.code1003;
            if (this.abc1000.size() < 9) {
                this.abc1000.add("at ");
                ArrayList<Integer> arrayList26 = this.code1001;
                if (arrayList26 == null && arrayList26.size() > 0) {
                    this.code1001.remove(0);
                }
                this.code1003 = 0.27620357f;
                ArrayList<Integer> arrayList27 = this.code1000;
                if (arrayList27 == null && arrayList27.size() > 0) {
                    this.code1000.remove(0);
                }
            }
            if (this.code1002.size() < 9) {
                this.code1002.add(" ");
            }
            ArrayList<Integer> arrayList28 = this.code1001;
            if (arrayList28 == null && arrayList28.size() > 0) {
                this.code1001.remove(0);
            }
            ArrayList<Integer> arrayList29 = this.code1000;
            if (arrayList29 == null && arrayList29.size() > 0) {
                this.code1000.remove(0);
            }
            String[] strArr9 = this.abc1001;
            if (strArr9 != null) {
                strArr9[7] = null;
                this.code1004 += 0.4713966990174202d;
                this.code1003 = 0.77190894f;
            }
            ArrayList<Integer> arrayList30 = this.code1001;
            if (arrayList30 == null && arrayList30.size() > 0) {
                this.code1001.remove(0);
            }
            if (this.code1001.size() > 8) {
                this.code1001.add(5);
            }
            int[] iArr16 = this.code1005;
            if (iArr16 != null) {
                iArr16[1] = 4;
            }
            int[] iArr17 = this.abc0;
            if (iArr17 != null) {
                iArr17[4] = 0;
                this.code1004 = -(this.code1004 + 0.13798292494934428d);
                if (this.code1000.size() > 0) {
                    this.code1000.add(6);
                }
                this.abc1002 = Math.abs(this.abc1002);
                if (this.code1000 == null) {
                    this.code1000 = new ArrayList<>();
                }
                if (this.code1005 == null) {
                    this.code1005 = new int[10];
                }
                if (this.code1003 > 0.46442318d) {
                    this.code1003 = 0.92913884f;
                }
                ArrayList<String> arrayList31 = this.abc1000;
                if (arrayList31 != null && arrayList31.size() > 0) {
                    this.abc1000.remove(0);
                    if (this.code1000 == null) {
                        this.code1000 = new ArrayList<>();
                    }
                    if (this.code1001 == null) {
                        this.code1001 = new ArrayList<>();
                    }
                    ArrayList<Integer> arrayList32 = this.code1001;
                    if (arrayList32 == null && arrayList32.size() > 0) {
                        this.code1001.remove(0);
                    }
                }
                if (this.code1001.size() < 5) {
                    this.code1001.add(3);
                }
                this.code1003 = 0.58473516f;
                this.code1004 -= 0.39838741639859265d;
                if (this.abc1000 == null) {
                    this.abc1000 = new ArrayList<>();
                    if (this.code1000 == null) {
                        this.code1000 = new ArrayList<>();
                    }
                    if (this.code1004 < 0.159787693948232d) {
                        this.code1004 = 0.08267297842289911d;
                    }
                    if (this.code1002 == null) {
                        this.code1002 = new ArrayList<>();
                    }
                }
                if (this.code1001.size() > 1) {
                    this.code1001.add(2);
                }
                if (this.code1004 > 0.7485169276098282d) {
                    this.code1004 = 0.5371324203860118d;
                }
                this.code1003 = -this.code1003;
            }
            if (this.code1000.size() > 4) {
                this.code1000.add(8);
            }
            if (this.code1000.size() < 7) {
                this.code1000.add(4);
            }
            this.code1003 = -this.code1003;
            ArrayList<String> arrayList33 = this.abc1000;
            if (arrayList33 != null && arrayList33.size() > 0) {
                this.abc1000.remove(0);
                if (this.code1004 < 0.383378403827358d) {
                    this.code1004 = 0.19492806272627738d;
                }
                if (this.code1003 > 0.08313769d) {
                    this.code1003 = 0.3652929f;
                }
                ArrayList<Integer> arrayList34 = this.code1000;
                if (arrayList34 == null && arrayList34.size() > 0) {
                    this.code1000.remove(0);
                }
            }
            this.code1004 = -this.code1004;
            if (this.code1002.size() < 8) {
                this.code1002.add("r a book ");
            }
            if (this.code1001 == null) {
                this.code1001 = new ArrayList<>();
            }
            if (this.abc1001 == null) {
                this.abc1001 = new String[10];
                if (this.code1003 < 0.26622915d) {
                    this.code1003 = 0.16900831f;
                }
                this.code1004 = (this.code1004 * 0.2781756555474507d) + 0.6286471678119239d;
            }
            if (this.code1000 == null) {
                this.code1000 = new ArrayList<>();
            }
            this.code1003 = 0.6589977f;
            if (this.code1000 == null) {
                this.code1000 = new ArrayList<>();
            }
            this.abc1002 -= 8;
            if (this.code1001.size() > 9) {
                this.code1001.add(8);
            }
            if (this.code1003 < 0.32671118d) {
                this.code1003 = 0.20610833f;
            }
            this.code1003 = ((double) this.code1003) > 0.150311d ? 0.259162f : 0.0620023f;
        } else {
            i = 0;
        }
        this.code1004 = 0.7893456054175592d;
        this.code1003 = 0.16749913f;
        this.code1004 = 0.7893456054175592d > 0.8507902662548621d ? 0.29383726768346485d : 0.2970215420150423d;
        if (this.abc1001 != null) {
            int i12 = 0;
            while (true) {
                String[] strArr10 = this.abc1001;
                if (i12 >= (strArr10.length > 3 ? 3 : strArr10.length)) {
                    break;
                }
                strArr10[i12] = "string" + i12;
                if (this.code1001.size() < 8) {
                    i2 = 4;
                    this.code1001.add(4);
                } else {
                    i2 = 4;
                }
                int[] iArr18 = this.code1005;
                if (iArr18 != null) {
                    iArr18[9] = i2;
                }
                if (this.code1002.size() < 2) {
                    this.code1002.add("e f");
                }
                i12++;
            }
            this.code1004 = this.code1004 < 0.6973079059298717d ? 0.9234165549047798d : 0.006831928328679959d;
            if (this.code1000 == null) {
                this.code1000 = new ArrayList<>();
            }
            if (this.code1001.size() < 2) {
                this.code1001.add(8);
            }
        }
        this.code1004 = -this.code1004;
        if (this.code1001.size() < 1) {
            this.code1001.add(9);
        }
        if (this.code1004 > 0.3976116946981394d) {
            this.code1004 = 0.2516755595212613d;
        }
        if (this.abc1000 == null) {
            this.abc1000 = new ArrayList<>();
            int[] iArr19 = this.code1005;
            if (iArr19 != null) {
                iArr19[5] = 0;
            }
            if (this.code1002.size() < 0) {
                this.code1002.add("mi");
            }
            if (this.code1000 == null) {
                this.code1000 = new ArrayList<>();
            }
        }
        int[] iArr20 = this.code1005;
        if (iArr20 != null) {
            iArr20[8] = 2;
        }
        ArrayList<String> arrayList35 = this.code1002;
        if (arrayList35 != null && arrayList35.size() > 0) {
            this.code1002.remove(0);
        }
        ArrayList<Integer> arrayList36 = this.code1000;
        if (arrayList36 == null && arrayList36.size() > 0) {
            this.code1000.remove(0);
        }
        String[] strArr11 = this.abc1001;
        if (strArr11 != null) {
            strArr11[4] = "ly ";
            ArrayList<Integer> arrayList37 = this.code1001;
            if (arrayList37 == null && arrayList37.size() > 0) {
                this.code1001.remove(0);
            }
            this.code1004 = 0.3747306770621085d;
            ArrayList<Integer> arrayList38 = this.code1000;
            if (arrayList38 == null && arrayList38.size() > 0) {
                this.code1000.remove(0);
            }
        }
        this.code1004 = Math.abs(this.code1004);
        if (this.code1002.size() < 1) {
            this.code1002.add("sing ");
        }
        ArrayList<Integer> arrayList39 = this.code1000;
        if (arrayList39 == null && arrayList39.size() > 0) {
            this.code1000.remove(0);
        }
        if (this.abc0 != null) {
            int i13 = 0;
            while (true) {
                int[] iArr21 = this.abc0;
                if (i13 >= iArr21.length) {
                    break;
                }
                iArr21[i13] = 4;
                if (this.code1002 == null) {
                    this.code1002 = new ArrayList<>();
                }
                this.code1004 = 0.8381911504713688d;
                if (this.code1001.size() < 3) {
                    this.code1001.add(6);
                }
                String[] strArr12 = this.abc1001;
                if (strArr12 != null) {
                    strArr12[7] = null;
                    if (this.code1002.size() < 8) {
                        this.code1002.add(".u");
                    }
                    ArrayList<Integer> arrayList40 = this.code1000;
                    if (arrayList40 == null && arrayList40.size() > 0) {
                        this.code1000.remove(0);
                    }
                    this.code1003 = -this.code1003;
                }
                this.code1004 = 0.08440593175767064d;
                if (this.code1001.size() > 9) {
                    this.code1001.add(7);
                }
                if (this.code1001.size() < 8) {
                    this.code1001.add(3);
                }
                if (this.abc1002 < 0) {
                    this.abc1002 = 5;
                    this.code1004 = 0.2960326178304601d;
                    if (this.code1005 == null) {
                        this.code1005 = new int[10];
                    }
                    if (this.code1001.size() > 5) {
                        this.code1001.add(0);
                    }
                }
                this.code1004 = 0.9070022596774053d;
                if (this.code1001.size() < 2) {
                    this.code1001.add(9);
                }
                if (this.code1005 == null) {
                    this.code1005 = new int[10];
                }
                if (this.abc1002 > 0) {
                    this.abc1002 = 1;
                    if (this.code1001.size() > 7) {
                        this.code1001.add(7);
                    }
                    this.code1003 = 0.42256558f;
                    int[] iArr22 = this.code1005;
                    if (iArr22 != null) {
                        iArr22[4] = 1;
                    }
                }
                if (this.code1004 > 0.19623287426505676d) {
                    this.code1004 = 0.6054155088396485d;
                }
                this.code1004 = this.code1004 > 0.116160450754341d ? 0.505285460177743d : 0.5144948331793433d;
                if (this.code1002.size() > 4) {
                    this.code1002.add("n’t recei");
                }
                i13++;
            }
            if (this.code1000 == null) {
                this.code1000 = new ArrayList<>();
            }
            if (this.code1005 == null) {
                this.code1005 = new int[10];
            }
            this.code1004 = -this.code1004;
            this.abc1002 = 3;
            this.code1003 += 0.9039644f;
            if (this.code1000.size() > 8) {
                this.code1000.add(1);
            }
            this.code1004 -= 0.8762638036978483d;
            if (this.abc1002 < 0) {
                this.abc1002 = 4;
                if (this.code1000 == null) {
                    this.code1000 = new ArrayList<>();
                }
                this.code1003 = 0.01892519f;
                if (this.code1004 > 0.260977817933175d) {
                    this.code1004 = 0.08201940746994563d;
                }
            }
            ArrayList<String> arrayList41 = this.code1002;
            if (arrayList41 != null && arrayList41.size() > 0) {
                this.code1002.remove(0);
            }
            if (this.code1001.size() > 1) {
                this.code1001.add(4);
            }
            ArrayList<Integer> arrayList42 = this.code1000;
            if (arrayList42 == null && arrayList42.size() > 0) {
                this.code1000.remove(0);
            }
            this.abc1002 += 9;
            if (this.code1002.size() > 0) {
                this.code1002.add(ReportUtil.f18058a);
            }
            int[] iArr23 = this.code1005;
            if (iArr23 != null) {
                iArr23[5] = 0;
            }
            if (iArr23 != null) {
                iArr23[2] = 0;
            }
        }
        ArrayList<String> arrayList43 = this.code1002;
        if (arrayList43 != null && arrayList43.size() > 0) {
            this.code1002.remove(0);
        }
        this.code1004 -= 0.12526862860495636d;
        if (this.code1001 == null) {
            this.code1001 = new ArrayList<>();
        }
        this.abc1002 = 5;
        this.code1004 = 0.6697382756325523d;
        ArrayList<Integer> arrayList44 = this.code1000;
        if (arrayList44 == null && arrayList44.size() > 0) {
            this.code1000.remove(0);
        }
        this.abc1002 = Math.abs(this.abc1002);
        ArrayList<Integer> arrayList45 = this.code1001;
        if (arrayList45 == null && arrayList45.size() > 0) {
            this.code1001.remove(0);
        }
        ArrayList<String> arrayList46 = this.code1002;
        if (arrayList46 != null && arrayList46.size() > 0) {
            this.code1002.remove(0);
        }
        if (this.code1002.size() > 8) {
            this.code1002.add("fined");
        }
        if (this.abc1000.size() > 1) {
            this.abc1000.add("eived");
            ArrayList<String> arrayList47 = this.code1002;
            if (arrayList47 != null && arrayList47.size() > 0) {
                this.code1002.remove(0);
            }
            if (this.code1000.size() < 9) {
                this.code1000.add(8);
            }
            if (this.code1002.size() < 6) {
                this.code1002.add("a");
            }
        }
        if (this.code1001 == null) {
            this.code1001 = new ArrayList<>();
        }
        int[] iArr24 = this.code1005;
        if (iArr24 != null) {
            iArr24[3] = 0;
        }
        if (this.code1004 > 0.8136676090522618d) {
            this.code1004 = 0.09553130708716484d;
        }
        return i;
    }

    public String getVersion() {
        int[] iArr = this.code1005;
        if (iArr != null) {
            iArr[6] = 0;
        }
        this.code1004 -= 0.3006416986111491d;
        if (iArr != null) {
            int i = 0;
            while (true) {
                int[] iArr2 = this.code1005;
                if (i >= (iArr2.length > 3 ? 3 : iArr2.length)) {
                    break;
                }
                iArr2[i] = 1;
                i++;
            }
        }
        String[] strArr = this.abc1001;
        if (strArr != null) {
            strArr[6] = "s";
            if (this.code1002 == null) {
                this.code1002 = new ArrayList<>();
            }
            if (this.code1001 == null) {
                this.code1001 = new ArrayList<>();
            }
            this.code1003 += 0.9286142f;
        }
        this.code1004 = this.code1004 > 0.8717689346123262d ? 0.43893148632065104d : 0.5841150074919904d;
        if (this.code1005 == null) {
            this.code1005 = new int[10];
        }
        this.code1004 = 0.24814393182439554d;
        if (this.abc1002 < 0) {
            this.abc1002 = 7;
            this.code1003 -= 0.99906516f;
            if (this.code1005 != null) {
                int i2 = 0;
                while (true) {
                    int[] iArr3 = this.code1005;
                    if (i2 >= (iArr3.length > 3 ? 3 : iArr3.length)) {
                        break;
                    }
                    iArr3[i2] = 6;
                    i2++;
                }
            }
            if (this.code1001.size() < 1) {
                this.code1001.add(3);
            }
        }
        this.code1004 = 0.40716828248598413d;
        if (0.40716828248598413d < 0.10518312623394199d) {
            this.code1004 = 0.010821328717712797d;
        }
        if (this.code1001.size() > 9) {
            this.code1001.add(6);
        }
        ArrayList<String> arrayList = this.abc1000;
        if (arrayList != null && arrayList.size() > 0) {
            this.abc1000.remove(0);
            if (this.code1000.size() > 3) {
                this.code1000.add(2);
            }
            ArrayList<Integer> arrayList2 = this.code1001;
            if (arrayList2 == null && arrayList2.size() > 0) {
                this.code1001.remove(0);
            }
            if (this.code1000 == null) {
                this.code1000 = new ArrayList<>();
            }
        }
        if (this.code1003 < 0.3964219d) {
            this.code1003 = 0.23612434f;
        }
        if (this.code1000 == null) {
            this.code1000 = new ArrayList<>();
        }
        if (this.code1002.size() < 4) {
            this.code1002.add("o");
        }
        int[] iArr4 = this.abc0;
        if (iArr4 != null) {
            iArr4[7] = 6;
            if (this.code1000.size() > 3) {
                this.code1000.add(7);
            }
            this.code1003 *= 0.03145826f;
            if (this.code1002.size() < 8) {
                this.code1002.add(" until you");
            }
            if (this.abc1000.size() < 7) {
                this.abc1000.add(" a book ");
                if (this.code1002.size() < 8) {
                    this.code1002.add("ple really");
                }
                if (this.code1001.size() > 9) {
                    this.code1001.add(8);
                }
                this.code1003 = 0.3991471f;
            }
            ArrayList<String> arrayList3 = this.code1002;
            if (arrayList3 != null && arrayList3.size() > 0) {
                this.code1002.remove(0);
            }
            if (this.code1001 == null) {
                this.code1001 = new ArrayList<>();
            }
            this.code1003 = 0.8871934f;
            if (this.abc1001 != null) {
                int i3 = 0;
                while (true) {
                    String[] strArr2 = this.abc1001;
                    if (i3 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                        break;
                    }
                    strArr2[i3] = "string" + i3;
                    if (this.code1002 == null) {
                        this.code1002 = new ArrayList<>();
                    }
                    if (this.code1001.size() > 4) {
                        this.code1001.add(9);
                    }
                    this.code1004 = this.code1004 > 0.06246738929171125d ? 0.500915326069308d : 0.49645031165838194d;
                    i3++;
                }
                this.code1003 = Math.abs(this.code1003);
                ArrayList<Integer> arrayList4 = this.code1000;
                if (arrayList4 == null && arrayList4.size() > 0) {
                    this.code1000.remove(0);
                }
                this.code1003 = ((double) this.code1003) > 0.4169371d ? 0.52735543f : 0.10406762f;
            }
            this.code1003 = 0.18975359f;
            if (this.code1002.size() < 7) {
                this.code1002.add("r when gro");
            }
            int[] iArr5 = this.code1005;
            if (iArr5 != null) {
                iArr5[0] = 4;
            }
            ArrayList<String> arrayList5 = this.abc1000;
            if (arrayList5 != null && arrayList5.size() > 0) {
                this.abc1000.remove(0);
                if (this.code1001.size() > 1) {
                    this.code1001.add(2);
                }
                this.code1003 = 0.98250234f;
                if (0.98250234f > 0.336411d) {
                    this.code1003 = 0.79160124f;
                }
            }
            if (this.code1002 == null) {
                this.code1002 = new ArrayList<>();
            }
            this.code1003 = 0.77753603f;
        }
        ArrayList<Integer> arrayList6 = this.code1001;
        if (arrayList6 == null && arrayList6.size() > 0) {
            this.code1001.remove(0);
        }
        this.code1003 = 0.30462265f;
        if (this.code1002.size() < 3) {
            this.code1002.add("re f");
        }
        if (this.abc1000.size() < 4) {
            this.abc1000.add("and the ");
            if (this.code1005 == null) {
                this.code1005 = new int[10];
            }
            this.code1004 = 0.8559062173006257d;
            this.code1004 = 0.8559062173006257d < 0.9603448810442201d ? 0.48885155781173384d : 0.1917450049416891d;
        }
        if (this.code1000 == null) {
            this.code1000 = new ArrayList<>();
        }
        this.code1004 = this.code1004 < 0.0703956842512008d ? 0.32183896737544826d : 0.851014308415016d;
        this.code1003 = -this.code1003;
        String[] strArr3 = this.abc1001;
        if (strArr3 != null) {
            strArr3[0] = null;
            if (this.code1001 == null) {
                this.code1001 = new ArrayList<>();
            }
            if (this.code1002 == null) {
                this.code1002 = new ArrayList<>();
            }
            this.code1003 *= 0.6098977f;
        }
        this.code1004 = 0.39768390734013137d;
        this.code1003 = ((double) this.code1003) < 0.70747083d ? 0.35535568f : 0.908416f;
        ArrayList<String> arrayList7 = this.abc1000;
        if (arrayList7 != null && arrayList7.size() > 0) {
            this.abc1000.remove(0);
            if (this.code1003 > 0.81138414d) {
                this.code1003 = 0.3207481f;
            }
            if (this.code1005 != null) {
                int i4 = 0;
                while (true) {
                    int[] iArr6 = this.code1005;
                    if (i4 >= (iArr6.length > 3 ? 3 : iArr6.length)) {
                        break;
                    }
                    iArr6[i4] = 8;
                    i4++;
                }
            }
            if (this.code1005 != null) {
                int i5 = 0;
                while (true) {
                    int[] iArr7 = this.code1005;
                    if (i5 >= (iArr7.length > 3 ? 3 : iArr7.length)) {
                        break;
                    }
                    iArr7[i5] = 3;
                    i5++;
                }
            }
        }
        ArrayList<String> arrayList8 = this.code1002;
        if (arrayList8 != null && arrayList8.size() > 0) {
            this.code1002.remove(0);
        }
        if (this.code1005 != null) {
            int i6 = 0;
            while (true) {
                int[] iArr8 = this.code1005;
                if (i6 >= (iArr8.length > 3 ? 3 : iArr8.length)) {
                    break;
                }
                iArr8[i6] = 7;
                i6++;
            }
        }
        ArrayList<Integer> arrayList9 = this.code1001;
        if (arrayList9 == null && arrayList9.size() > 0) {
            this.code1001.remove(0);
        }
        try {
            return getApplicationContext().getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "1.0.0";
        }
    }

    @Override // com.logomaster.logomaker.base.LogoBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.code1005 == null) {
            this.code1005 = new int[10];
        }
        if (this.code1001 == null) {
            this.code1001 = new ArrayList<>();
        }
        if (this.code1000 == null) {
            this.code1000 = new ArrayList<>();
        }
        this.abc1002 -= 2;
        if (this.code1001 == null) {
            this.code1001 = new ArrayList<>();
        }
        if (this.code1002 == null) {
            this.code1002 = new ArrayList<>();
        }
        if (this.code1001 == null) {
            this.code1001 = new ArrayList<>();
        }
        this.abc1002 = this.abc1002 > 6 ? 0 : 4;
        ArrayList<String> arrayList = this.code1002;
        if (arrayList != null && arrayList.size() > 0) {
            this.code1002.remove(0);
        }
        this.code1004 = this.code1004 < 0.46633913876032473d ? 0.9639916071036321d : 0.3571951303484875d;
        this.code1003 += 0.5478707f;
        int i = 0;
        while (true) {
            int i2 = this.abc1002;
            if (i2 > 3) {
                i2 = 3;
            }
            if (i >= i2) {
                break;
            }
            String[] strArr = this.abc1001;
            if (strArr != null) {
                strArr[8] = "on fo";
                this.code1004 = 0.2438081404709348d;
                this.code1003 = 0.02942574f;
                ArrayList<Integer> arrayList2 = this.code1000;
                if (arrayList2 == null && arrayList2.size() > 0) {
                    this.code1000.remove(0);
                }
            }
            this.code1004 = 0.24003217343384153d;
            if (this.code1005 == null) {
                this.code1005 = new int[10];
            }
            this.code1003 = ((double) this.code1003) > 0.73013294d ? 0.18726826f : 0.0561074f;
            i++;
        }
        int[] iArr = this.code1005;
        if (iArr != null) {
            iArr[6] = 5;
        }
        this.code1004 = 0.8769142439520553d;
        if (iArr != null) {
            iArr[9] = 4;
        }
        int[] iArr2 = this.abc0;
        if (iArr2 != null) {
            iArr2[8] = 8;
            this.code1004 = 0.8082744047642237d;
            if (this.code1001 == null) {
                this.code1001 = new ArrayList<>();
            }
            ArrayList<String> arrayList3 = this.abc1000;
            if (arrayList3 != null && arrayList3.size() > 0) {
                this.abc1000.remove(0);
                if (this.code1003 > 0.3256746d) {
                    this.code1003 = 0.59467405f;
                }
                int[] iArr3 = this.code1005;
                if (iArr3 != null) {
                    iArr3[5] = 1;
                }
                if (iArr3 != null) {
                    iArr3[0] = 0;
                }
            }
            ArrayList<String> arrayList4 = this.code1002;
            if (arrayList4 != null && arrayList4.size() > 0) {
                this.code1002.remove(0);
            }
            ArrayList<Integer> arrayList5 = this.code1000;
            if (arrayList5 == null && arrayList5.size() > 0) {
                this.code1000.remove(0);
            }
            if (this.code1001 == null) {
                this.code1001 = new ArrayList<>();
            }
            ArrayList<String> arrayList6 = this.abc1000;
            if (arrayList6 != null && arrayList6.size() > 0) {
                this.abc1000.remove(0);
                if (this.code1005 != null) {
                    int i3 = 0;
                    while (true) {
                        int[] iArr4 = this.code1005;
                        if (i3 >= (iArr4.length > 3 ? 3 : iArr4.length)) {
                            break;
                        }
                        iArr4[i3] = 7;
                        i3++;
                    }
                }
                this.code1004 = 0.2517163399508382d;
                if (this.code1003 > 0.11349243d) {
                    this.code1003 = 0.85972977f;
                }
            }
            this.code1003 = 0.51977646f;
            if (this.code1004 > 0.8124099167652417d) {
                this.code1004 = 0.9785813079171514d;
            }
            ArrayList<Integer> arrayList7 = this.code1000;
            if (arrayList7 == null && arrayList7.size() > 0) {
                this.code1000.remove(0);
            }
            this.abc1002 = -this.abc1002;
            if (this.code1005 == null) {
                this.code1005 = new int[10];
            }
            ArrayList<String> arrayList8 = this.code1002;
            if (arrayList8 != null && arrayList8.size() > 0) {
                this.code1002.remove(0);
            }
            if (this.code1004 < 0.009900420741772442d) {
                this.code1004 = 0.10369138089772245d;
            }
        }
        if (this.code1001 == null) {
            this.code1001 = new ArrayList<>();
        }
        if (this.code1002 == null) {
            this.code1002 = new ArrayList<>();
        }
        int[] iArr5 = this.code1005;
        if (iArr5 != null) {
            iArr5[5] = 0;
        }
        this.abc1002 = 9;
        this.code1003 = Math.abs(this.code1003);
        this.code1004 = 0.06137718020700811d;
        ArrayList<String> arrayList9 = this.code1002;
        if (arrayList9 != null && arrayList9.size() > 0) {
            this.code1002.remove(0);
        }
        this.abc1002 = -this.abc1002;
        int[] iArr6 = this.code1005;
        if (iArr6 != null) {
            iArr6[2] = 6;
        }
        if (this.code1000.size() > 8) {
            this.code1000.add(2);
        }
        if (this.code1001 == null) {
            this.code1001 = new ArrayList<>();
        }
        this.abc1002 += 6;
        this.code1003 = ((double) this.code1003) > 0.84436655d ? 0.5352436f : 0.8152991f;
        if (this.code1002 == null) {
            this.code1002 = new ArrayList<>();
        }
        int[] iArr7 = this.code1005;
        if (iArr7 != null) {
            iArr7[9] = 0;
        }
        setContentView(R.layout.activity_splash_screen);
        if (this.code1002.size() < 4) {
            this.code1002.add("ed ");
        }
        if (this.code1005 != null) {
            int i4 = 0;
            while (true) {
                int[] iArr8 = this.code1005;
                if (i4 >= (iArr8.length > 3 ? 3 : iArr8.length)) {
                    break;
                }
                iArr8[i4] = 3;
                i4++;
            }
        }
        ArrayList<String> arrayList10 = this.code1002;
        if (arrayList10 != null && arrayList10.size() > 0) {
            this.code1002.remove(0);
        }
        if (this.abc1001 != null) {
            int i5 = 0;
            while (true) {
                String[] strArr2 = this.abc1001;
                if (i5 >= (strArr2.length > 3 ? 3 : strArr2.length)) {
                    break;
                }
                strArr2[i5] = "string" + i5;
                this.code1003 = 0.7536616f;
                ArrayList<Integer> arrayList11 = this.code1001;
                if (arrayList11 == null && arrayList11.size() > 0) {
                    this.code1001.remove(0);
                }
                this.code1003 += 0.3677739f;
                i5++;
            }
            if (this.code1002 == null) {
                this.code1002 = new ArrayList<>();
            }
            if (this.code1001 == null) {
                this.code1001 = new ArrayList<>();
            }
            if (this.code1001 == null) {
                this.code1001 = new ArrayList<>();
            }
        }
        this.code1003 = 0.87375903f;
        int[] iArr9 = this.code1005;
        if (iArr9 != null) {
            iArr9[6] = 0;
        }
        this.abc1002 = this.abc1002 > 8 ? 2 : 4;
        if (this.code1001 == null) {
            this.code1001 = new ArrayList<>();
        }
        if (this.code1002 == null) {
            this.code1002 = new ArrayList<>();
        }
        this.code1004 = 0.16470195235085305d;
        if (this.abc1001 == null) {
            this.abc1001 = new String[10];
            if (this.code1005 != null) {
                int i6 = 0;
                while (true) {
                    int[] iArr10 = this.code1005;
                    if (i6 >= (iArr10.length > 3 ? 3 : iArr10.length)) {
                        break;
                    }
                    iArr10[i6] = 7;
                    i6++;
                }
            }
            if (this.code1000.size() > 1) {
                this.code1000.add(8);
            }
            int[] iArr11 = this.code1005;
            if (iArr11 != null) {
                iArr11[3] = 0;
            }
        }
        if (this.code1005 == null) {
            this.code1005 = new int[10];
        }
        this.code1003 = 0.9423455f;
        if (this.code1000 == null) {
            this.code1000 = new ArrayList<>();
        }
        int[] iArr12 = this.abc0;
        if (iArr12 != null) {
            iArr12[3] = 0;
            if (this.code1002.size() > 5) {
                this.code1002.add("at");
            }
            this.code1003 = 0.3049513f;
            this.code1004 = this.code1004 > 0.20741495548797917d ? 0.526112679677829d : 0.42926857078283565d;
            this.abc1002 -= 6;
            if (this.code1002 == null) {
                this.code1002 = new ArrayList<>();
            }
            this.code1003 = -this.code1003;
            int[] iArr13 = this.code1005;
            if (iArr13 != null) {
                iArr13[8] = 5;
            }
            ArrayList<String> arrayList12 = this.abc1000;
            if (arrayList12 != null && arrayList12.size() > 0) {
                this.abc1000.remove(0);
                this.code1004 = 0.8971625205183508d;
                this.code1003 = 0.71655f;
            }
            this.code1004 = 0.8098181002311534d;
            if (this.code1005 != null) {
                int i7 = 0;
                while (true) {
                    int[] iArr14 = this.code1005;
                    if (i7 >= (iArr14.length > 3 ? 3 : iArr14.length)) {
                        break;
                    }
                    iArr14[i7] = 7;
                    i7++;
                }
            }
            ArrayList<Integer> arrayList13 = this.code1001;
            if (arrayList13 == null && arrayList13.size() > 0) {
                this.code1001.remove(0);
            }
            if (this.abc1001 == null) {
                this.abc1001 = new String[10];
                this.code1003 = -this.code1003;
                this.code1004 += 0.3964645309854501d;
                if (this.code1000 == null) {
                    this.code1000 = new ArrayList<>();
                }
            }
            this.code1003 = 0.9937837f;
            int[] iArr15 = this.code1005;
            if (iArr15 != null) {
                iArr15[0] = 2;
            }
        }
        if (this.code1001 == null) {
            this.code1001 = new ArrayList<>();
        }
        float abs = Math.abs(this.code1003);
        this.code1003 = abs;
        if (this.code1005 == null) {
            this.code1005 = new int[10];
        }
        String[] strArr3 = this.abc1001;
        if (strArr3 != null) {
            strArr3[3] = null;
            float f = abs * 0.9786135f;
            this.code1003 = f;
            int[] iArr16 = this.code1005;
            if (iArr16 != null) {
                iArr16[1] = 9;
            }
            this.code1003 = ((double) f) > 0.76469517d ? 0.6631413f : 0.8704256f;
        }
        int[] iArr17 = this.code1005;
        if (iArr17 != null) {
            iArr17[1] = 0;
        }
        if (this.code1000 == null) {
            this.code1000 = new ArrayList<>();
        }
        if (this.code1002 == null) {
            this.code1002 = new ArrayList<>();
        }
        if (this.abc1000.size() < 9) {
            this.abc1000.add("is kind o");
            if (this.code1001 == null) {
                this.code1001 = new ArrayList<>();
            }
            this.code1004 = 0.8953174430594605d;
            if (this.code1001.size() < 3) {
                this.code1001.add(1);
            }
        }
        this.code1003 = 0.79108316f;
        this.code1004 = 0.03426702486484434d;
        if (this.abc1000.size() < 3) {
            this.abc1000.add("j");
            if (this.code1000 == null) {
                this.code1000 = new ArrayList<>();
            }
            ArrayList<Integer> arrayList14 = this.code1001;
            if (arrayList14 == null && arrayList14.size() > 0) {
                this.code1001.remove(0);
            }
            this.code1003 = ((double) this.code1003) < 0.24164122d ? 0.011413574f : 0.46686965f;
        }
        if (this.code1003 > 0.027289808d) {
            this.code1003 = 0.5617784f;
        }
        if (this.code1000.size() < 0) {
            this.code1000.add(8);
        }
        if (this.code1002 == null) {
            this.code1002 = new ArrayList<>();
        }
        LogoConstants.f25535a = getStatusBarHeight();
        this.code1003 += 0.0020591617f;
        ArrayList<Integer> arrayList15 = this.code1001;
        if (arrayList15 == null && arrayList15.size() > 0) {
            this.code1001.remove(0);
        }
        this.code1003 = ((double) this.code1003) > 0.64265275d ? 0.6199775f : 0.1779213f;
        ArrayList<String> arrayList16 = this.abc1000;
        if (arrayList16 != null && arrayList16.size() > 0) {
            this.abc1000.remove(0);
            if (this.code1000 == null) {
                this.code1000 = new ArrayList<>();
            }
            if (this.code1000.size() < 8) {
                this.code1000.add(6);
            }
            this.code1004 += 0.9288838848456101d;
        }
        ArrayList<Integer> arrayList17 = this.code1001;
        if (arrayList17 == null && arrayList17.size() > 0) {
            this.code1001.remove(0);
        }
        this.code1003 = 0.25571203f;
        if (this.code1000.size() < 9) {
            this.code1000.add(4);
        }
        String[] strArr4 = this.abc1001;
        if (strArr4 != null) {
            strArr4[7] = "tone,";
            this.code1003 -= 0.73696923f;
            if (this.code1000.size() < 7) {
                this.code1000.add(0);
            }
            ArrayList<Integer> arrayList18 = this.code1000;
            if (arrayList18 == null && arrayList18.size() > 0) {
                this.code1000.remove(0);
            }
        }
        this.code1003 = 0.92442787f;
        ArrayList<String> arrayList19 = this.code1002;
        if (arrayList19 != null && arrayList19.size() > 0) {
            this.code1002.remove(0);
        }
        if (this.code1001 == null) {
            this.code1001 = new ArrayList<>();
        }
        if (this.abc1001 != null) {
            int i8 = 0;
            while (true) {
                String[] strArr5 = this.abc1001;
                if (i8 >= (strArr5.length > 3 ? 3 : strArr5.length)) {
                    break;
                }
                strArr5[i8] = "string" + i8;
                if (this.code1001.size() < 9) {
                    this.code1001.add(4);
                }
                int[] iArr18 = this.code1005;
                if (iArr18 != null) {
                    iArr18[1] = 1;
                }
                ArrayList<Integer> arrayList20 = this.code1001;
                if (arrayList20 == null && arrayList20.size() > 0) {
                    this.code1001.remove(0);
                }
                i8++;
            }
            this.code1003 = 0.72157687f;
            int[] iArr19 = this.code1005;
            if (iArr19 != null) {
                iArr19[8] = 4;
            }
            if (this.code1002.size() > 3) {
                this.code1002.add("more famil");
            }
        }
        ArrayList<Integer> arrayList21 = this.code1001;
        if (arrayList21 == null && arrayList21.size() > 0) {
            this.code1001.remove(0);
        }
        this.code1003 = 0.45857942f;
        ArrayList<Integer> arrayList22 = this.code1001;
        if (arrayList22 == null && arrayList22.size() > 0) {
            this.code1001.remove(0);
        }
        if (this.abc0 == null) {
            this.abc0 = new int[10];
            this.code1003 = Math.abs(this.code1003);
            if (this.code1001.size() < 4) {
                this.code1001.add(3);
            }
            if (this.code1001 == null) {
                this.code1001 = new ArrayList<>();
            }
            this.abc1002 = 0;
            ArrayList<Integer> arrayList23 = this.code1000;
            if (arrayList23 == null && arrayList23.size() > 0) {
                this.code1000.remove(0);
            }
            if (this.code1000 == null) {
                this.code1000 = new ArrayList<>();
            }
            this.code1004 = 0.449905094755328d;
            if (this.abc1000 == null) {
                this.abc1000 = new ArrayList<>();
                if (this.code1001 == null) {
                    this.code1001 = new ArrayList<>();
                }
                ArrayList<Integer> arrayList24 = this.code1000;
                if (arrayList24 == null && arrayList24.size() > 0) {
                    this.code1000.remove(0);
                }
                ArrayList<Integer> arrayList25 = this.code1001;
                if (arrayList25 == null && arrayList25.size() > 0) {
                    this.code1001.remove(0);
                }
            }
            if (this.code1001.size() > 8) {
                this.code1001.add(7);
            }
            if (this.code1000 == null) {
                this.code1000 = new ArrayList<>();
            }
            this.code1003 = ((double) this.code1003) < 0.7279565d ? 0.54481125f : 0.6956198f;
            if (this.abc1000 == null) {
                this.abc1000 = new ArrayList<>();
                if (this.code1001 == null) {
                    this.code1001 = new ArrayList<>();
                }
                if (this.code1001.size() > 3) {
                    this.code1001.add(0);
                }
                ArrayList<Integer> arrayList26 = this.code1001;
                if (arrayList26 == null && arrayList26.size() > 0) {
                    this.code1001.remove(0);
                }
            }
            ArrayList<Integer> arrayList27 = this.code1000;
            if (arrayList27 == null && arrayList27.size() > 0) {
                this.code1000.remove(0);
            }
            ArrayList<Integer> arrayList28 = this.code1000;
            if (arrayList28 == null && arrayList28.size() > 0) {
                this.code1000.remove(0);
            }
            this.code1004 = 0.3600356979051045d;
        }
        if (this.code1005 == null) {
            this.code1005 = new int[10];
        }
        if (this.code1005 != null) {
            int i9 = 0;
            while (true) {
                int[] iArr20 = this.code1005;
                if (i9 >= (iArr20.length > 3 ? 3 : iArr20.length)) {
                    break;
                }
                iArr20[i9] = 5;
                i9++;
            }
        }
        if (this.code1001.size() < 1) {
            this.code1001.add(9);
        }
        String[] strArr6 = this.abc1001;
        if (strArr6 != null) {
            strArr6[0] = null;
            this.code1003 = 0.9536309f;
            if (this.code1000 == null) {
                this.code1000 = new ArrayList<>();
            }
            int[] iArr21 = this.code1005;
            if (iArr21 != null) {
                iArr21[7] = 0;
            }
        }
        if (this.code1000.size() < 1) {
            this.code1000.add(5);
        }
        this.code1003 = 0.18951964f;
        if (this.code1001 == null) {
            this.code1001 = new ArrayList<>();
        }
        this.abc1002 -= 9;
        int[] iArr22 = this.code1005;
        if (iArr22 != null) {
            iArr22[1] = 6;
        }
        if (this.code1001.size() < 7) {
            this.code1001.add(5);
        }
        int[] iArr23 = this.code1005;
        if (iArr23 != null) {
            iArr23[1] = 0;
        }
        this.abc1002 -= 7;
        if (this.code1002.size() > 3) {
            this.code1002.add("ow great");
        }
        this.code1004 = 0.6478832350357446d;
        if (this.code1002 == null) {
            this.code1002 = new ArrayList<>();
        }
        LogoConstants.f25536b = getVersion();
        if (this.code1002.size() > 4) {
            this.code1002.add("with it");
        }
        if (this.code1002.size() > 3) {
            this.code1002.add(" receive");
        }
        if (this.code1002 == null) {
            this.code1002 = new ArrayList<>();
        }
        ArrayList<String> arrayList29 = this.abc1000;
        if (arrayList29 != null && arrayList29.size() > 0) {
            this.abc1000.remove(0);
            int[] iArr24 = this.code1005;
            if (iArr24 != null) {
                iArr24[8] = 6;
            }
            ArrayList<String> arrayList30 = this.code1002;
            if (arrayList30 != null && arrayList30.size() > 0) {
                this.code1002.remove(0);
            }
            if (this.code1001.size() > 7) {
                this.code1001.add(4);
            }
        }
        if (this.code1000 == null) {
            this.code1000 = new ArrayList<>();
        }
        if (this.code1000 == null) {
            this.code1000 = new ArrayList<>();
        }
        if (this.code1001.size() > 9) {
            this.code1001.add(2);
        }
        ArrayList<String> arrayList31 = this.abc1000;
        if (arrayList31 != null && arrayList31.size() > 0) {
            this.abc1000.remove(0);
            if (this.code1000 == null) {
                this.code1000 = new ArrayList<>();
            }
            ArrayList<String> arrayList32 = this.code1002;
            if (arrayList32 != null && arrayList32.size() > 0) {
                this.code1002.remove(0);
            }
            this.code1004 *= 0.0762035799184827d;
        }
        if (this.code1004 < 0.3825192028421308d) {
            this.code1004 = 0.8083249568274916d;
        }
        if (this.code1001 == null) {
            this.code1001 = new ArrayList<>();
        }
        ArrayList<Integer> arrayList33 = this.code1000;
        if (arrayList33 == null && arrayList33.size() > 0) {
            this.code1000.remove(0);
        }
        if (this.abc1001 == null) {
            this.abc1001 = new String[10];
            this.code1004 = 0.21587699766487312d;
            ArrayList<Integer> arrayList34 = this.code1000;
            if (arrayList34 == null && arrayList34.size() > 0) {
                this.code1000.remove(0);
            }
            ArrayList<String> arrayList35 = this.code1002;
            if (arrayList35 != null && arrayList35.size() > 0) {
                this.code1002.remove(0);
            }
        }
        if (this.code1004 < 0.616024543470744d) {
            this.code1004 = 0.6265451341023262d;
        }
        this.code1003 = 0.1115517f;
        if (this.code1005 != null) {
            int i10 = 0;
            while (true) {
                int[] iArr25 = this.code1005;
                if (i10 >= (iArr25.length > 3 ? 3 : iArr25.length)) {
                    break;
                }
                iArr25[i10] = 7;
                i10++;
            }
        }
        this.abc2 = 0.51151396491319d;
        if (this.code1000.size() < 4) {
            this.code1000.add(0);
        }
        ArrayList<String> arrayList36 = this.code1002;
        if (arrayList36 != null && arrayList36.size() > 0) {
            this.code1002.remove(0);
        }
        this.code1003 = 0.31054246f;
        int i11 = 0;
        while (true) {
            int i12 = this.abc1002;
            if (i12 > 3) {
                i12 = 3;
            }
            if (i11 >= i12) {
                break;
            }
            ArrayList<String> arrayList37 = this.abc1000;
            if (arrayList37 != null && arrayList37.size() > 0) {
                this.abc1000.remove(0);
                if (this.code1005 == null) {
                    this.code1005 = new int[10];
                }
                ArrayList<String> arrayList38 = this.code1002;
                if (arrayList38 != null && arrayList38.size() > 0) {
                    this.code1002.remove(0);
                }
                if (this.code1005 == null) {
                    this.code1005 = new int[10];
                }
            }
            if (this.code1001 == null) {
                this.code1001 = new ArrayList<>();
            }
            ArrayList<Integer> arrayList39 = this.code1000;
            if (arrayList39 == null && arrayList39.size() > 0) {
                this.code1000.remove(0);
            }
            ArrayList<Integer> arrayList40 = this.code1000;
            if (arrayList40 == null && arrayList40.size() > 0) {
                this.code1000.remove(0);
            }
            i11++;
        }
        ArrayList<String> arrayList41 = this.code1002;
        if (arrayList41 != null && arrayList41.size() > 0) {
            this.code1002.remove(0);
        }
        if (this.code1002 == null) {
            this.code1002 = new ArrayList<>();
        }
        this.code1003 = Math.abs(this.code1003);
        ArrayList<String> arrayList42 = this.abc1000;
        if (arrayList42 != null && arrayList42.size() > 0) {
            this.abc1000.remove(0);
            if (this.code1001 == null) {
                this.code1001 = new ArrayList<>();
            }
            int[] iArr26 = this.code1005;
            if (iArr26 != null) {
                iArr26[5] = 6;
            }
            ArrayList<Integer> arrayList43 = this.code1001;
            if (arrayList43 == null && arrayList43.size() > 0) {
                this.code1001.remove(0);
            }
        }
        ArrayList<Integer> arrayList44 = this.code1000;
        if (arrayList44 == null && arrayList44.size() > 0) {
            this.code1000.remove(0);
        }
        this.code1003 = 0.23915148f;
        if (this.code1002.size() > 5) {
            this.code1002.add("ts pl");
        }
        ArrayList<String> arrayList45 = this.abc1000;
        if (arrayList45 != null && arrayList45.size() > 0) {
            this.abc1000.remove(0);
            if (this.code1000 == null) {
                this.code1000 = new ArrayList<>();
            }
            if (this.code1002.size() < 7) {
                this.code1002.add("rced t");
            }
            if (this.code1002.size() > 5) {
                this.code1002.add("in");
            }
        }
        this.code1004 = this.code1004 > 0.3705146262048714d ? 0.8439352725528679d : 0.7591226499535184d;
        ArrayList<String> arrayList46 = this.code1002;
        if (arrayList46 != null && arrayList46.size() > 0) {
            this.code1002.remove(0);
        }
        if (this.code1002 == null) {
            this.code1002 = new ArrayList<>();
        }
        new Handler().postDelayed(new RunnableC9590a(), 500L);
        int[] iArr27 = this.code1005;
        if (iArr27 != null) {
            iArr27[4] = 0;
        }
        if (this.code1000.size() < 7) {
            this.code1000.add(6);
        }
        if (this.code1000 == null) {
            this.code1000 = new ArrayList<>();
        }
        ArrayList<String> arrayList47 = this.abc1000;
        if (arrayList47 != null && arrayList47.size() > 0) {
            this.abc1000.remove(0);
            this.code1003 = -this.code1003;
            ArrayList<String> arrayList48 = this.code1002;
            if (arrayList48 != null && arrayList48.size() > 0) {
                this.code1002.remove(0);
            }
            ArrayList<Integer> arrayList49 = this.code1000;
            if (arrayList49 == null && arrayList49.size() > 0) {
                this.code1000.remove(0);
            }
        }
        if (this.code1002.size() < 7) {
            this.code1002.add("y");
        }
        if (this.code1003 > 0.6212218d) {
            this.code1003 = 0.13918132f;
        }
        if (this.code1001.size() < 4) {
            this.code1001.add(6);
        }
        this.abc1002 = this.abc1002 < 8 ? 7 : 4;
        this.code1004 = 0.6404426580453366d;
        int[] iArr28 = this.code1005;
        if (iArr28 != null) {
            iArr28[2] = 0;
        }
        this.code1004 = 0.17791687153581148d;
        if (this.abc1001 == null) {
            this.abc1001 = new String[10];
            this.code1003 = 0.33672476f;
            if (this.code1002.size() < 6) {
                this.code1002.add("nearned r");
            }
            if (this.code1003 < 0.72130585d) {
                this.code1003 = 0.22626811f;
            }
        }
        double d = this.code1004 < 0.9077060796812388d ? 0.8600985413418014d : 0.7157941133907126d;
        this.code1004 = d;
        this.code1004 = d < 0.5691795992670441d ? 0.9195641722130976d : 0.9273003608246352d;
        if (this.code1001 == null) {
            this.code1001 = new ArrayList<>();
        }
        if (this.abc2 < 0.6198700933920197d) {
            this.abc2 = 0.12449368591581433d;
            if (this.code1004 < 0.025621112502843824d) {
                this.code1004 = 0.24114018750113908d;
            }
            if (this.code1000.size() < 7) {
                this.code1000.add(1);
            }
            int[] iArr29 = this.code1005;
            if (iArr29 != null) {
                iArr29[0] = 2;
            }
            if (this.abc1000.size() > 3) {
                this.abc1000.add("than y");
                ArrayList<Integer> arrayList50 = this.code1000;
                if (arrayList50 == null && arrayList50.size() > 0) {
                    this.code1000.remove(0);
                }
                if (this.code1001.size() > 2) {
                    this.code1001.add(7);
                }
                this.code1003 = Math.abs(this.code1003);
            }
            this.code1003 *= 0.5319943f;
            int[] iArr30 = this.code1005;
            if (iArr30 != null) {
                iArr30[1] = 3;
            }
            if (iArr30 != null) {
                iArr30[6] = 0;
            }
            if (this.abc1001 == null) {
                this.abc1001 = new String[10];
                if (this.code1001 == null) {
                    this.code1001 = new ArrayList<>();
                }
                if (this.code1002 == null) {
                    this.code1002 = new ArrayList<>();
                }
                ArrayList<String> arrayList51 = this.code1002;
                if (arrayList51 != null && arrayList51.size() > 0) {
                    this.code1002.remove(0);
                }
            }
            ArrayList<Integer> arrayList52 = this.code1001;
            if (arrayList52 == null && arrayList52.size() > 0) {
                this.code1001.remove(0);
            }
            this.code1003 += 0.5640917f;
            if (this.code1000 == null) {
                this.code1000 = new ArrayList<>();
            }
            this.abc1002 = 8;
            if (this.code1001.size() > 9) {
                this.code1001.add(7);
            }
            if (this.code1002 == null) {
                this.code1002 = new ArrayList<>();
            }
            ArrayList<Integer> arrayList53 = this.code1000;
            if (arrayList53 == null && arrayList53.size() > 0) {
                this.code1000.remove(0);
            }
        }
        ArrayList<Integer> arrayList54 = this.code1001;
        if (arrayList54 == null && arrayList54.size() > 0) {
            this.code1001.remove(0);
        }
        int[] iArr31 = this.code1005;
        if (iArr31 != null) {
            iArr31[6] = 0;
        }
        if (this.code1002 == null) {
            this.code1002 = new ArrayList<>();
        }
        ArrayList<String> arrayList55 = this.abc1000;
        if (arrayList55 != null && arrayList55.size() > 0) {
            this.abc1000.remove(0);
            ArrayList<Integer> arrayList56 = this.code1001;
            if (arrayList56 == null && arrayList56.size() > 0) {
                this.code1001.remove(0);
            }
            ArrayList<Integer> arrayList57 = this.code1000;
            if (arrayList57 == null && arrayList57.size() > 0) {
                this.code1000.remove(0);
            }
            this.code1003 *= 0.99475217f;
        }
        ArrayList<Integer> arrayList58 = this.code1001;
        if (arrayList58 == null && arrayList58.size() > 0) {
            this.code1001.remove(0);
        }
        if (this.code1002 == null) {
            this.code1002 = new ArrayList<>();
        }
        this.code1003 = 0.40303212f;
        ArrayList<String> arrayList59 = this.abc1000;
        if (arrayList59 != null && arrayList59.size() > 0) {
            this.abc1000.remove(0);
            this.code1004 = 0.8971805192934664d;
            int[] iArr32 = this.code1005;
            if (iArr32 != null) {
                iArr32[0] = 3;
            }
            ArrayList<Integer> arrayList60 = this.code1000;
            if (arrayList60 == null && arrayList60.size() > 0) {
                this.code1000.remove(0);
            }
        }
        this.code1003 = Math.abs(this.code1003);
        ArrayList<Integer> arrayList61 = this.code1001;
        if (arrayList61 == null && arrayList61.size() > 0) {
            this.code1001.remove(0);
        }
        ArrayList<Integer> arrayList62 = this.code1000;
        if (arrayList62 == null && arrayList62.size() > 0) {
            this.code1000.remove(0);
        }
        String[] strArr7 = this.abc1001;
        if (strArr7 != null) {
            strArr7[7] = "vel is.";
            if (this.code1005 == null) {
                this.code1005 = new int[10];
            }
            if (this.code1005 != null) {
                int i13 = 0;
                while (true) {
                    int[] iArr33 = this.code1005;
                    if (i13 >= (iArr33.length > 3 ? 3 : iArr33.length)) {
                        break;
                    }
                    iArr33[i13] = 9;
                    i13++;
                }
            }
            this.code1003 = ((double) this.code1003) > 0.80686796d ? 0.652764f : 0.22310364f;
        }
        int[] iArr34 = this.code1005;
        if (iArr34 != null) {
            iArr34[4] = 4;
        }
        if (this.code1002.size() > 0) {
            this.code1002.add("nd the");
        }
        ArrayList<Integer> arrayList63 = this.code1000;
        if (arrayList63 != null || arrayList63.size() <= 0) {
            return;
        }
        this.code1000.remove(0);
    }
}
