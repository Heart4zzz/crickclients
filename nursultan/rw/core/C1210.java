package rw.core;

import java.util.UUID;
import rw.api.Iface0029;
import rw.api.Iface0664;
import rw.data.Rec0289;
import rw.data.Rec0290;
import rw.data.Rec0291;
import rw.data.Rec0295;
import rw.data.Rec0297;
import rw.data.Rec0299;
import rw.defs.FfDf;
import rw.net.PacketBuf;
import rw.net.PacketHandlers;

public class C1210 implements PacketHandlers<Iface0029> {
   public Object[] f1000;

   public static C1210 m2000() {
      return new C1210((FfDf)FfDf.f3000[0], new Rec0289());
   }

   public C1210(FfDf var1, Iface0664 var2) {
      this.m6000();
      this.f1000[0] = var1;
      this.f1000[1] = var2;
   }

   public C1210() {
      this.m6000();
   }

   static {
      ntfClinit();
   }

   private void m6000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
      }
   }

   public FfDf m8000() {
      return (FfDf)this.f1000[0];
   }

   public static C1210 m12000(long var0) {
      return new C1210((FfDf)FfDf.f3000[3], new Rec0291(var0));
   }

   public void m14000(PacketBuf param1) {
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
      // 00: aload 1
      // 01: invokevirtual rw/net/PacketBuf.m94000 ()I
      // 04: istore 2
      // 05: aload 0
      // 06: iload 2
      // 07: invokestatic rw/defs/FfDf.m32000 (I)Lrw/defs/FfDf;
      // 0a: astore 7
      // 0c: getfield rw/core/C1210.f1000 [Ljava/lang/Object;
      // 0f: ldc 0
      // 11: nop
      // 12: nop
      // 13: nop
      // 14: nop
      // 15: aload 7
      // 17: aastore
      // 18: aload 0
      // 19: getfield rw/core/C1210.f1000 [Ljava/lang/Object;
      // 1c: ldc 0
      // 1e: nop
      // 1f: nop
      // 20: nop
      // 21: nop
      // 22: aaload
      // 23: checkcast rw/defs/FfDf
      // 26: ifnonnull 37
      // 29: new java/lang/IllegalStateException
      // 2c: dup
      // 2d: iload 2
      // 2e: invokedynamic makeConcatWithConstants (I)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "Unknown C2SPresetPacket action: \u0001" ]
      // 33: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 36: athrow
      // 37: aload 0
      // 38: aload 0
      // 39: getfield rw/core/C1210.f1000 [Ljava/lang/Object;
      // 3c: ldc 0
      // 3e: nop
      // 3f: nop
      // 40: nop
      // 41: nop
      // 42: aaload
      // 43: checkcast rw/defs/FfDf
      // 46: invokevirtual rw/defs/FfDf.ordinal ()I
      // 49: tableswitch 39 0 5 49 56 63 70 77 84
      // 70: new java/lang/MatchException
      // 73: dup
      // 74: aconst_null
      // 75: aconst_null
      // 76: invokespecial java/lang/MatchException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 79: athrow
      // 7a: aload 1
      // 7b: invokestatic rw/data/Rec0289.m4000 (Lrw/net/PacketBuf;)Lrw/data/Rec0289;
      // 7e: goto a1
      // 81: aload 1
      // 82: invokestatic rw/data/Rec0295.m12000 (Lrw/net/PacketBuf;)Lrw/data/Rec0295;
      // 85: goto a1
      // 88: aload 1
      // 89: invokestatic rw/data/Rec0290.m10000 (Lrw/net/PacketBuf;)Lrw/data/Rec0290;
      // 8c: goto a1
      // 8f: aload 1
      // 90: invokestatic rw/data/Rec0291.m4000 (Lrw/net/PacketBuf;)Lrw/data/Rec0291;
      // 93: goto a1
      // 96: aload 1
      // 97: invokestatic rw/data/Rec0299.m4000 (Lrw/net/PacketBuf;)Lrw/data/Rec0299;
      // 9a: goto a1
      // 9d: aload 1
      // 9e: invokestatic rw/data/Rec0297.m6000 (Lrw/net/PacketBuf;)Lrw/data/Rec0297;
      // a1: astore 8
      // a3: getfield rw/core/C1210.f1000 [Ljava/lang/Object;
      // a6: ldc 1
      // a8: nop
      // a9: nop
      // aa: nop
      // ab: nop
      // ac: aload 8
      // ae: aastore
      // af: return
   }

   public void m16000(Iface0029 var1) {
      var1.m22000(this);
   }

   public static C1210 m20000(long var0, byte[] var2, int var3) {
      return new C1210((FfDf)FfDf.f3000[2], new Rec0290(var0, var3, var2));
   }

   public static C1210 m22000(UUID var0, String var1, byte[] var2, int var3) {
      return new C1210((FfDf)FfDf.f3000[1], new Rec0295(var0, var3, var1, var2));
   }

   public static C1210 m24000(long var0) {
      return new C1210((FfDf)FfDf.f3000[4], new Rec0299(var0));
   }

   public Iface0664 m26000() {
      return (Iface0664)this.f1000[1];
   }

   public static C1210 m28000(long var0, String var2) {
      return new C1210((FfDf)FfDf.f3000[5], new Rec0297(var0, var2));
   }

   public void m32000(PacketBuf var1) {
      var1.m56000(((FfDf)this.f1000[0]).m34000());
      ((Iface0664)this.f1000[1]).m2000(var1);
   }
}
