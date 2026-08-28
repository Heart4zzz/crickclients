package rw.setting;

import KDFzREm.NHe;
import KDFzREm.NNNZZ;
import KDFzREm.NNNwS;
import KDFzREm.NNnq;
import KDFzREm.NNuU;
import KDFzREm.NQo;
import KDFzREm.NYj;
import KDFzREm.NkG;
import KDFzREm.Nkq;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import rw.NursultanClient;
import rw.core.Base1148;
import rw.core.C0719;
import rw.core.C1013;
import rw.core.C1193;
import rw.data.Rec0179;
import rw.data.Rec0193;
import rw.data.Rec0194;
import rw.data.Rec0217;
import rw.gui.AutoBuy;
import rw.gui.Enum0083;
import rw.net.Auto;

public class C0085 extends Base1148<AutoBuy> {
   private static short[] f1000;
   private static String[] f2000;
   private static short[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   private static String[] f6000;
   private static byte[] f7000;
   private static short[] f8000;
   private static byte[] f9000;
   private static byte[] f10000;
   private static short[] f11000;
   private static short[] f12000;
   private static short[] f13000;
   public Object[] f14000;
   private static short[] f15000;
   private static short[] f16000;
   private static short[] f17000;
   private static short[] f18000;
   private static short[] f19000;
   public Object[] f20000;
   private static short[] f21000;
   private static short[] f22000;
   private static short[] f23000;
   private static short[] f24000;
   private static short[] f25000;
   private static short[] f26000;
   private static short[] f27000;

   private static void m4000() {
      f7000 = new byte[]{5, 11, 40, 5, 5};
      f9000 = new byte[]{5, 45, 5, 5, -55, 2, 25, 3};
      f10000 = new byte[]{7, 2, 3, 4, 5, 6};
   }

   private static void m10000() {
      f2000 = new String[]{"busy", "hash", "price", "seller", "busy", "подозрительная цена"};
      f6000 = new String[]{", ", "resume", ",", "", "resume"};
   }

   private void m12000() {
      this.m26000();
      Integer var5 = (Integer)this.f20000[2] - 1;
      this.f20000[2] = var5;
      if ((Integer)this.f20000[2] == 0) {
         ((NNNwS)((NNuU)this.N[0]).T[4]).method_7346();
      } else if ((Integer)this.f20000[2] < -55) {
         this.m48000();
      }
   }

   public C0085(Auto var1, AutoBuy var2, String var3, boolean var4, Consumer<C1013> var5) {
      super(var2, var3, var4, var5);
      this.m26000();
      Enum0083 var10 = (Enum0083)Enum0083.f1000[0];
      this.f14000[1] = var10;
      Long var11 = -1L;
      this.f20000[4] = var11;
      this.f14000[0] = var1;
   }

   static {
      ntfClinit();
   }

   private void m24000() {
      this.m26000();
      if ((Integer)this.f20000[3] > 0) {
         Integer var5 = (Integer)this.f20000[3] - 1;
         this.f20000[3] = var5;
      }

      if ((Integer)this.f20000[3] == 0 && (Enum0083)this.f14000[1] == (Enum0083)Enum0083.f1000[1]) {
         Enum0083 var6 = (Enum0083)Enum0083.f1000[3];
         this.f14000[1] = var6;
         Integer var7 = 5;
         this.f20000[2] = var7;
         Long var8 = -1L;
         this.f20000[4] = var8;
      }
   }

   private void m26000() {
      if (this.f14000 == null) {
         this.f14000 = new Object[3];
         Object[] var1 = this.f14000;
      }

      if (this.f20000 == null) {
         this.f20000 = new Object[7];
         Object[] var2 = this.f20000;
         var2[1] = 0;
         var2[2] = 0;
         var2[3] = 0;
         var2[4] = 0L;
         var2[5] = 0;
         var2[6] = false;
      }
   }

   private static void m34000() {
      f4000 = new short[]{0, 1};
      f25000 = new short[]{4, 0, 0};
      f1000 = new short[]{5, 1, 0};
      f26000 = new short[]{5, 1, 1, 0, 2, 2, 1};
      f12000 = new short[]{1, 3, 2, 6, 0, 6, 4, 4};
      f5000 = new short[]{4, 4, 5, 5, 4};
      f19000 = new short[]{3, 2, 1, 1, 0, 1, 3};
      f11000 = new short[]{0, 4};
      f13000 = new short[]{2, 2, 2, 1, 3, 3, 3};
      f23000 = new short[]{3, 1};
      f21000 = new short[]{1, 3, 1, 2, 4, 0};
      f22000 = new short[]{0, 4, 3};
      f27000 = new short[]{1, 0, 2, 3, 1, 1};
      f3000 = new short[]{1, 1, 0, 2, 0, 0, 0, 4};
      f16000 = new short[]{2, 3, 1, 2};
      f17000 = new short[]{2, 2, 0, 4, 2, 2, 0};
      f24000 = new short[]{1, 2};
      f15000 = new short[]{3, 4, 0};
      f8000 = new short[]{1, 6, 0};
      f18000 = new short[]{6, 2, 2, 0, 1, 3, 0};
   }

   public void m44000(Object var1) {
      this.m26000();
      if (((Auto)this.f14000[0]).m2000()) {
         switch (var1) {
            case Rec0217 var4:
               this.m54000(var4);
               break;
            case Rec0179 var5:
               this.m46000(var5);
               break;
            case C0719 var6:
               this.m50000(var6);
               break;
            case null:
            default:
         }
      }
   }

   private void m46000(Rec0179 var1) {
      switch (var1.m4000()) {
         case NNnq var4:
            this.m58000(var4);
         case null:
         default:
      }
   }

   public void m48000() {
      this.m26000();
      Object var5 = null;
      this.f14000[2] = var5;
      Object var6 = null;
      this.f20000[0] = var6;
      Integer var7 = 0;
      this.f20000[1] = var7;
      Integer var8 = 0;
      this.f20000[2] = var8;
      Integer var9 = 0;
      this.f20000[3] = var9;
      Long var10 = -1L;
      this.f20000[4] = var10;
      Enum0083 var11 = (Enum0083)Enum0083.f1000[0];
      this.f14000[1] = var11;
      if ((Boolean)this.f20000[6]) {
         ((Auto)this.f14000[0]).m62000(f6000[1]);
      }

      Boolean var12 = false;
      this.f20000[6] = var12;
   }

   private void m50000(C0719 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.get(ArrayList.java:427)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplifySwitchOnEnumJ21(SwitchHelper.java:341)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplify(SwitchHelper.java:41)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplifySwitches(SwitchHelper.java:30)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplifySwitches(SwitchHelper.java:34)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplifySwitches(SwitchHelper.java:34)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplifySwitches(SwitchHelper.java:34)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:388)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual rw/setting/C0085.m26000 ()V
      // 04: aload 0
      // 05: getfield rw/setting/C0085.f20000 [Ljava/lang/Object;
      // 08: ldc 5
      // 0a: nop
      // 0b: nop
      // 0c: nop
      // 0d: nop
      // 0e: aaload
      // 0f: checkcast java/lang/Integer
      // 12: invokevirtual java/lang/Integer.intValue ()I
      // 15: getstatic rw/setting/C0085.f7000 [B
      // 18: bipush 0
      // 19: nop
      // 1a: nop
      // 1b: nop
      // 1c: nop
      // 1d: baload
      // 1e: if_icmplt 80
      // 21: aload 0
      // 22: getfield rw/setting/C0085.N [Ljava/lang/Object;
      // 25: ldc 1
      // 27: nop
      // 28: nop
      // 29: nop
      // 2a: nop
      // 2b: aaload
      // 2c: checkcast java/lang/Object
      // 2f: checkcast rw/gui/AutoBuy
      // 32: invokevirtual rw/gui/AutoBuy.m14000 ()V
      // 35: aload 0
      // 36: getfield rw/setting/C0085.f14000 [Ljava/lang/Object;
      // 39: ldc 0
      // 3b: nop
      // 3c: nop
      // 3d: nop
      // 3e: nop
      // 3f: aaload
      // 40: checkcast rw/net/Auto
      // 43: getstatic rw/setting/C0085.f2000 [Ljava/lang/String;
      // 46: bipush 0
      // 47: nop
      // 48: nop
      // 49: nop
      // 4a: nop
      // 4b: aaload
      // 4c: invokevirtual rw/net/Auto.m62000 (Ljava/lang/String;)V
      // 4f: invokestatic rw/NursultanClient.m36000 ()Lrw/core/Scheduler;
      // 52: getstatic rw/setting/C0085.f7000 [B
      // 55: bipush 1
      // 56: nop
      // 57: nop
      // 58: nop
      // 59: nop
      // 5a: baload
      // 5b: invokestatic rw/core/C0954.m20000 (I)I
      // 5e: aload 0
      // 5f: invokedynamic run (Lrw/setting/C0085;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, rw/setting/C0085.m16000 ()V, ()V ]
      // 64: invokevirtual rw/core/Scheduler.m14000 (ILjava/lang/Runnable;)V
      // 67: aload 0
      // 68: ldc 0
      // 6a: nop
      // 6b: nop
      // 6c: nop
      // 6d: nop
      // 6e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 71: astore 6
      // 73: getfield rw/setting/C0085.f20000 [Ljava/lang/Object;
      // 76: ldc 5
      // 78: nop
      // 79: nop
      // 7a: nop
      // 7b: nop
      // 7c: aload 6
      // 7e: aastore
      // 7f: return
      // 80: aload 0
      // 81: getfield rw/setting/C0085.f14000 [Ljava/lang/Object;
      // 84: ldc 1
      // 86: nop
      // 87: nop
      // 88: nop
      // 89: nop
      // 8a: aaload
      // 8b: checkcast rw/gui/Enum0083
      // 8e: invokevirtual rw/gui/Enum0083.ordinal ()I
      // 91: tableswitch 48 1 3 27 34 41
      // ac: aload 0
      // ad: invokevirtual rw/setting/C0085.m24000 ()V
      // b0: goto c1
      // b3: aload 0
      // b4: invokevirtual rw/setting/C0085.m64000 ()V
      // b7: goto c1
      // ba: aload 0
      // bb: invokevirtual rw/setting/C0085.m12000 ()V
      // be: goto c1
      // c1: return
   }

   private boolean m52000(Matcher var1, NQo var2, NkG var3, NYj var4) {
      this.m26000();
      String var5 = var1.group(2);
      long var6 = Long.parseLong(var1.group(1).replaceAll(f6000[2], f6000[3]));
      if (((Rec0193)this.f14000[2]).m6000().equals(var5) && ((Rec0193)this.f14000[2]).f1000 == AutoBuy.m40000(var2, var6)) {
         Rec0194 var12 = new Rec0194(var3.b, var4.u);
         this.f20000[0] = var12;
         Integer var13 = 25;
         this.f20000[1] = var13;
         Integer var14 = 0;
         this.f20000[3] = var14;
         return (boolean)1;
      } else {
         return (boolean)0;
      }
   }

   private void m54000(Rec0217 var1) {
      this.m26000();
      if ((Enum0083)this.f14000[1] == (Enum0083)Enum0083.f1000[0] && (Rec0193)this.f14000[2] == null) {
         JsonElement var2 = JsonParser.parseString(var1.m4000());
         if (var2.isJsonObject()) {
            JsonObject var3 = var2.getAsJsonObject();
            int var4 = var3.get(f2000[1]).getAsInt();
            long var5 = var3.get(f2000[2]).getAsInt();
            long var7 = C0160.m56000().orElse(0L);
            if (var5 <= var7) {
               Rec0193 var13 = new Rec0193(var3.get(f2000[3]).getAsString(), var4);
               this.f14000[2] = var13;
               Enum0083 var14 = (Enum0083)Enum0083.f1000[1];
               this.f14000[1] = var14;
               Integer var15 = Integer.valueOf(f7000[2]);
               this.f20000[3] = var15;
               C0160.m70000("/ah " + ((Rec0193)this.f14000[2]).m6000());
               if (!(Boolean)this.f20000[6]) {
                  ((Auto)this.f14000[0]).m62000(f2000[4]);
                  Boolean var16 = true;
                  this.f20000[6] = var16;
               }

               if ((Long)this.f20000[4] == -1L) {
                  Long var17 = System.currentTimeMillis();
                  this.f20000[4] = var17;
               }
            }
         }
      }
   }

   private void m58000(NNnq var1) {
      this.m26000();
      if ((Long)this.f20000[4] != -1L) {
         if (System.currentTimeMillis() - (Long)this.f20000[4] > 300L) {
            Integer var7 = (Integer)this.f20000[5] + 1;
            this.f20000[5] = var7;
         }

         Long var8 = -1L;
         this.f20000[4] = var8;
      }

      Integer var9 = 0;
      this.f20000[3] = var9;
      String var2 = var1.L().getString().toLowerCase();
      if (var2.contains(f2000[5])) {
         Enum0083 var10 = (Enum0083)Enum0083.f1000[2];
         this.f14000[1] = var10;
         Integer var11 = Integer.valueOf(f7000[3]);
         this.f20000[1] = var11;
         Rec0194 var12 = new Rec0194(var1.N(), 0);
         this.f20000[0] = var12;
      } else if ((Enum0083)this.f14000[1] == (Enum0083)Enum0083.f1000[3]) {
         NursultanClient.m36000().m36000(((NNNwS)((NNuU)this.N[0]).T[4])::method_7346);
         Integer var13 = Integer.valueOf(f7000[4]);
         this.f20000[2] = var13;
      } else {
         if ((Rec0193)this.f14000[2] != null) {
            Enum0083 var14 = (Enum0083)Enum0083.f1000[2];
            this.f14000[1] = var14;
         }
      }
   }

   private void m64000() {
      this.m26000();
      if ((Rec0194)this.f20000[0] == null) {
         NkG var1 = (NkG)((NNNwS)((NNuU)this.N[0]).T[4]).fields_07fa3311b0e9d3e9b883d09222919bf5a[3];
         NHe var2 = var1.T;

         for (int var3 = 0; var3 <= 45; var3++) {
            NYj var4 = (NYj)var2.get(var3);
            NQo var5 = var4.i();
            Matcher var6 = ((Pattern)C0087.f2000[f27000[0]]).matcher(String.join(f6000[0], C1193.m40000(var5)));
            if (var6.find() && this.m52000(var6, var5, var1, var4)) {
               break;
            }
         }
      }

      if ((Rec0194)this.f20000[f27000[1]] == null) {
         Integer var11 = 5;
         this.f20000[f27000[2]] = var11;
         Enum0083 var12 = (Enum0083)Enum0083.f1000[f27000[3]];
         this.f14000[f27000[4]] = var12;
      } else if ((Integer)this.f20000[f27000[5]] > 0) {
         Integer var13 = (Integer)this.f20000[1] - 1;
         this.f20000[1] = var13;
      } else {
         ((NNNZZ)((NNuU)this.N[0]).T[2])
            .N(((Rec0194)this.f20000[0]).m4000(), ((Rec0194)this.f20000[0]).m6000(), 0, Nkq.field_7794, (NNNwS)((NNuU)this.N[0]).T[4]);
         Integer var14 = 5;
         this.f20000[2] = var14;
         Enum0083 var15 = (Enum0083)Enum0083.f1000[3];
         this.f14000[1] = var15;
      }
   }
}
