package rw.core;

import rw.api.Iface0029;
import rw.api.Iface0663;
import rw.data.OlIpmir;
import rw.data.Rec0042;
import rw.data.Rec0043;
import rw.data.Rec0058;
import rw.data.Rec0300;
import rw.defs.Enum0098;
import rw.net.PacketBuf;
import rw.net.PacketHandlers;

public class C1207 implements PacketHandlers<Iface0029> {
   public Object[] f1000;

   public Enum0098 m2000() {
      return (Enum0098)this.f1000[0];
   }

   public C1207(Enum0098 var1, Iface0663 var2) {
      this.m32000();
      this.f1000[0] = var1;
      this.f1000[1] = var2;
   }

   public C1207() {
      this.m32000();
   }

   static {
      ntfClinit();
   }

   public void m8000(PacketBuf param1) {
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
      // 07: invokestatic rw/defs/Enum0098.m34000 (I)Lrw/defs/Enum0098;
      // 0a: astore 7
      // 0c: getfield rw/core/C1207.f1000 [Ljava/lang/Object;
      // 0f: ldc 0
      // 11: nop
      // 12: nop
      // 13: nop
      // 14: nop
      // 15: aload 7
      // 17: aastore
      // 18: aload 0
      // 19: getfield rw/core/C1207.f1000 [Ljava/lang/Object;
      // 1c: ldc 0
      // 1e: nop
      // 1f: nop
      // 20: nop
      // 21: nop
      // 22: aaload
      // 23: checkcast rw/defs/Enum0098
      // 26: ifnonnull 37
      // 29: new java/lang/IllegalStateException
      // 2c: dup
      // 2d: iload 2
      // 2e: invokedynamic makeConcatWithConstants (I)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "Unknown C2SSharePacket action: \u0001" ]
      // 33: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 36: athrow
      // 37: aload 0
      // 38: aload 0
      // 39: getfield rw/core/C1207.f1000 [Ljava/lang/Object;
      // 3c: ldc 0
      // 3e: nop
      // 3f: nop
      // 40: nop
      // 41: nop
      // 42: aaload
      // 43: checkcast rw/defs/Enum0098
      // 46: invokevirtual rw/defs/Enum0098.ordinal ()I
      // 49: tableswitch 35 0 4 45 52 59 66 73
      // 6c: new java/lang/MatchException
      // 6f: dup
      // 70: aconst_null
      // 71: aconst_null
      // 72: invokespecial java/lang/MatchException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 75: athrow
      // 76: aload 1
      // 77: invokestatic rw/data/Rec0058.m4000 (Lrw/net/PacketBuf;)Lrw/data/Rec0058;
      // 7a: goto 96
      // 7d: aload 1
      // 7e: invokestatic rw/data/Rec0300.m6000 (Lrw/net/PacketBuf;)Lrw/data/Rec0300;
      // 81: goto 96
      // 84: aload 1
      // 85: invokestatic rw/data/Rec0043.m4000 (Lrw/net/PacketBuf;)Lrw/data/Rec0043;
      // 88: goto 96
      // 8b: aload 1
      // 8c: invokestatic rw/data/OlIpmir.m6000 (Lrw/net/PacketBuf;)Lrw/data/OlIpmir;
      // 8f: goto 96
      // 92: aload 1
      // 93: invokestatic rw/data/Rec0042.m4000 (Lrw/net/PacketBuf;)Lrw/data/Rec0042;
      // 96: astore 8
      // 98: getfield rw/core/C1207.f1000 [Ljava/lang/Object;
      // 9b: ldc 1
      // 9d: nop
      // 9e: nop
      // 9f: nop
      // a0: nop
      // a1: aload 8
      // a3: aastore
      // a4: return
   }

   public static C1207 m12000(long var0) {
      return new C1207((Enum0098)Enum0098.f2000[4], new Rec0042(var0));
   }

   public static C1207 m14000() {
      return new C1207((Enum0098)Enum0098.f2000[0], new Rec0058());
   }

   public void m16000(Iface0029 var1) {
      var1.m28000(this);
   }

   public static C1207 m20000(long var0) {
      return new C1207((Enum0098)Enum0098.f2000[2], new Rec0043(var0));
   }

   public void m22000(PacketBuf var1) {
      var1.m56000(((Enum0098)this.f1000[0]).m36000());
      ((Iface0663)this.f1000[1]).m2000(var1);
   }

   public Iface0663 m24000() {
      return (Iface0663)this.f1000[1];
   }

   public static C1207 m28000(byte[] var0) {
      return new C1207((Enum0098)Enum0098.f2000[3], new OlIpmir(var0));
   }

   public static C1207 m30000(long var0, long var2, int var4) {
      return new C1207((Enum0098)Enum0098.f2000[1], new Rec0300(var0, var2, var4));
   }

   private void m32000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
      }
   }
}
