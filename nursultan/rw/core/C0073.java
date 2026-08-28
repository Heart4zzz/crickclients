package rw.core;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import rw.NursultanClient;
import rw.api.Iface0578;
import rw.api.Iface0608;
import rw.data.Rec0216;
import rw.defs.BootstrapMethods;
import rw.defs.Enum0072;
import rw.defs.Enum0073;
import rw.defs.SfDz;
import rw.gui.PgUp;
import rw.module.Huddumped;

public class C0073 {
   private static short[] f1000;
   private static short[] f2000;
   private static short[] f3000;
   private static short[] f4000;
   private static short[] f5000;
   private static short[] f6000;
   private static short[] f7000;
   private static short[] f8000;
   private static short[] f9000;
   private static short[] f10000;
   public Object[] f11000;
   public Object[] f12000;
   private static short[] f13000;
   private static short[] f14000;
   private static short[] f15000;
   private static short[] f16000;
   private static short[] f17000;

   public String m2000() {
      return (String)this.f12000[3];
   }

   public void m6000(Huddumped param1) {
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
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:388)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield rw/core/C0073.f12000 [Ljava/lang/Object;
      // 04: ldc 4
      // 06: nop
      // 07: nop
      // 08: nop
      // 09: nop
      // 0a: aaload
      // 0b: checkcast rw/defs/BootstrapMethods
      // 0e: invokevirtual rw/defs/BootstrapMethods.ordinal ()I
      // 11: lookupswitch 90 2 0 27 1 48
      // 2c: aload 0
      // 2d: getfield rw/core/C0073.f12000 [Ljava/lang/Object;
      // 30: ldc 2
      // 32: nop
      // 33: nop
      // 34: nop
      // 35: nop
      // 36: aaload
      // 37: checkcast rw/api/Iface0578
      // 3a: aload 1
      // 3b: invokevirtual rw/api/Iface0578.m8000 (Lrw/module/Huddumped;)V
      // 3e: goto 6b
      // 41: aload 0
      // 42: getfield rw/core/C0073.f12000 [Ljava/lang/Object;
      // 45: ldc 2
      // 47: nop
      // 48: nop
      // 49: nop
      // 4a: nop
      // 4b: aaload
      // 4c: checkcast rw/api/Iface0578
      // 4f: aload 1
      // 50: invokevirtual rw/api/Iface0578.m2000 (Lrw/module/Huddumped;)V
      // 53: aload 0
      // 54: ldc 1
      // 56: nop
      // 57: nop
      // 58: nop
      // 59: nop
      // 5a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5d: astore 6
      // 5f: getfield rw/core/C0073.f11000 [Ljava/lang/Object;
      // 62: ldc 3
      // 64: nop
      // 65: nop
      // 66: nop
      // 67: nop
      // 68: aload 6
      // 6a: aastore
      // 6b: aload 0
      // 6c: invokevirtual rw/core/C0073.m12000 ()V
      // 6f: return
   }

   public boolean m8000() {
      return (BootstrapMethods)this.f12000[4] == (BootstrapMethods)BootstrapMethods.f3000[1] ? (Boolean)this.f11000[3] : ((Iface0578)this.f12000[2]).m6000();
   }

   private void m12000() {
      boolean var1 = this.m8000();
      if (var1 != (Boolean)this.f11000[4]) {
         Boolean var6 = var1;
         this.f11000[4] = var6;
         this.m48000(var1 ? (Enum0073)Enum0073.f2000[0] : (Enum0073)Enum0073.f2000[1]);
      }
   }

   public C0073(Iface0608 var1, String var2, BootstrapMethods var3, PgUp var4, int var5) {
      this.m24000();
      ArrayList var10 = new ArrayList();
      this.f12000[0] = var10;
      this.f12000[1] = var1;
      this.f12000[3] = var2;
      this.f12000[4] = var3;
      this.f11000[0] = var4;
      Integer var15 = var5;
      this.f11000[1] = var15;
      Boolean var16 = true;
      this.f11000[2] = var16;
      this.m26000();
   }

   static {
      ntfClinit();
   }

   public boolean m14000() {
      return ((PgUp)this.f11000[0]).m80000();
   }

   public int m16000() {
      return (Integer)this.f11000[f7000[0]];
   }

   public BootstrapMethods m18000() {
      return (BootstrapMethods)this.f12000[4];
   }

   private void m20000() {
      if ((Boolean)this.f11000[3]) {
         Boolean var5 = false;
         this.f11000[3] = var5;
         ((Iface0578)this.f12000[2])
            .m4000(
               Huddumped.m52000(
                  ((PgUp)this.f11000[0]).m8000(),
                  (SfDz)SfDz.f1000[1],
                  ((PgUp)this.f11000[0]).m86000() ? (Enum0072)Enum0072.f1000[0] : (Enum0072)Enum0072.f1000[1]
               )
            );
         this.m12000();
      }
   }

   private void m22000() {
      ((List)this.f12000[0]).forEach(var1 -> var1.accept(this));
   }

   private void m24000() {
      if (this.f12000 == null) {
         this.f12000 = new Object[5];
         Object[] var1 = this.f12000;
      }

      if (this.f11000 == null) {
         this.f11000 = new Object[5];
         Object[] var2 = this.f11000;
         var2[1] = 0;
         var2[2] = false;
         var2[3] = false;
         var2[4] = false;
      }
   }

   public void m26000() {
      Iface0578 var5 = ((Iface0608)this.f12000[1]).m4000();
      this.f12000[2] = var5;
   }

   public String m28000() {
      return C1231.m32000((PgUp)this.f11000[0], (Integer)this.f11000[1]);
   }

   public boolean m30000(Huddumped var1) {
      return (boolean)(((PgUp)this.f11000[0]).m88000(var1.m30000()) && C1231.m22000((PgUp)this.f11000[0], var1.m58000()) == this.f11000[1] ? 1 : 0);
   }

   public void m34000() {
      this.m12000();
   }

   public PgUp m36000() {
      return (PgUp)this.f11000[0];
   }

   public boolean m38000(Huddumped var1) {
      return (boolean)(((PgUp)this.f11000[0]).m88000(var1.m30000()) && this.f11000[1] == 0 ? 1 : 0);
   }

   private static void m44000() {
      f3000 = new short[]{0, 1, 3, 4, 0, 1, 2};
      f2000 = new short[]{1, 2, 4};
      f8000 = new short[]{1, 3, 2};
      f17000 = new short[]{1, 3};
      f6000 = new short[]{0, 1, 4};
      f1000 = new short[]{2, 4, 2, 0, 1, 2};
      f4000 = new short[]{0, 0, 2, 2, 2, 0, 0};
      f14000 = new short[]{2, 0};
      f15000 = new short[]{0, 1, 4, 2, 2, 3};
      f10000 = new short[]{4, 1};
      f16000 = new short[]{3, 2, 3, 0, 0, 1, 0};
      f5000 = new short[]{1, 0, 3, 3, 3, 2};
      f9000 = new short[]{0, 1, 0, 0, 1, 4};
      f13000 = new short[]{4, 0, 1, 0, 3, 4, 0};
      f7000 = new short[]{1, 2};
   }

   public void m46000(String var1) {
      this.f12000[3] = var1;
   }

   private void m48000(Enum0073 var1) {
      NursultanClient.m8000().m12000(Rec0216.m6000(this, var1));
   }

   public void m50000(PgUp var1) {
      if ((PgUp)this.f11000[0] != var1) {
         this.m20000();
         this.f11000[0] = var1;
         this.m22000();
         this.m48000((Enum0073)Enum0073.f2000[2]);
      }
   }

   public void m52000(PgUp var1, int var2, BootstrapMethods var3, boolean var4) {
      this.m20000();
      int var5 = (PgUp)this.f11000[0] != var1 ? 1 : 0;
      int var6 = var5 == 0 && this.f11000[1] == var2 && (BootstrapMethods)this.f12000[4] == var3 && this.f11000[2] == var4 ? 0 : 1;
      this.f12000[4] = var3;
      Boolean var12 = var4;
      this.f11000[2] = var12;
      this.f11000[0] = var1;
      Integer var14 = var2;
      this.f11000[1] = var14;
      if (var5 != 0) {
         this.m22000();
      }

      if (var6 != 0) {
         this.m48000((Enum0073)Enum0073.f2000[2]);
      }
   }

   public boolean m54000() {
      return (Boolean)this.f11000[f7000[1]];
   }

   public void m56000(Consumer<C0073> var1) {
      if (!((List)this.f12000[0]).stream().anyMatch(var1x -> (boolean)(var1x == var1 ? 1 : 0))) {
         ((List)this.f12000[0]).add(var1);
      }
   }

   public void m58000(Huddumped var1) {
      if ((BootstrapMethods)this.f12000[4] == (BootstrapMethods)BootstrapMethods.f3000[1] && (Boolean)this.f11000[3]) {
         ((Iface0578)this.f12000[2]).m4000(var1);
         Boolean var6 = false;
         this.f11000[3] = var6;
         this.m12000();
      }
   }

   public void m62000(boolean var1) {
      if ((Boolean)this.f11000[2] != var1) {
         Boolean var6 = var1;
         this.f11000[2] = var6;
         this.m48000((Enum0073)Enum0073.f2000[2]);
      }
   }

   public boolean m64000(int var1) {
      return (boolean)(((PgUp)this.f11000[0]).m88000(var1) && this.f11000[3] ? 1 : 0);
   }

   public String m68000() {
      return ((Iface0608)this.f12000[1]).m2000();
   }
}
