package rw.core;

import java.util.List;
import rw.api.Iface0027;
import rw.api.Iface0031;
import rw.data.Rec0038;
import rw.data.Rec0039;
import rw.data.Rec0046;
import rw.data.Rec0050;
import rw.data.Rec0055;
import rw.data.Rec0057;
import rw.data.Rec0253;
import rw.defs.Enum0005;
import rw.defs.Enum0083;
import rw.net.PacketBuf;
import rw.net.PacketHandlers;

public class C0108 implements PacketHandlers<Iface0027> {
   public Object[] f1000;

   public C0108(Enum0005 var1, Iface0031 var2) {
      this.m4000();
      this.f1000[0] = var1;
      this.f1000[1] = var2;
   }

   public C0108() {
      this.m4000();
   }

   static {
      ntfClinit();
   }

   private void m4000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
      }
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
      // 07: invokestatic rw/defs/Enum0005.m34000 (I)Lrw/defs/Enum0005;
      // 0a: astore 7
      // 0c: getfield rw/core/C0108.f1000 [Ljava/lang/Object;
      // 0f: ldc 0
      // 11: nop
      // 12: nop
      // 13: nop
      // 14: nop
      // 15: aload 7
      // 17: aastore
      // 18: aload 0
      // 19: getfield rw/core/C0108.f1000 [Ljava/lang/Object;
      // 1c: ldc 0
      // 1e: nop
      // 1f: nop
      // 20: nop
      // 21: nop
      // 22: aaload
      // 23: checkcast rw/defs/Enum0005
      // 26: ifnonnull 37
      // 29: new java/lang/IllegalStateException
      // 2c: dup
      // 2d: iload 2
      // 2e: invokedynamic makeConcatWithConstants (I)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "Unknown S2CSharePacket action: \u0001" ]
      // 33: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 36: athrow
      // 37: aload 0
      // 38: aload 0
      // 39: getfield rw/core/C0108.f1000 [Ljava/lang/Object;
      // 3c: ldc 0
      // 3e: nop
      // 3f: nop
      // 40: nop
      // 41: nop
      // 42: aaload
      // 43: checkcast rw/defs/Enum0005
      // 46: invokevirtual rw/defs/Enum0005.ordinal ()I
      // 49: tableswitch 39 0 5 49 56 63 70 77 84
      // 70: new java/lang/MatchException
      // 73: dup
      // 74: aconst_null
      // 75: aconst_null
      // 76: invokespecial java/lang/MatchException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 79: athrow
      // 7a: aload 1
      // 7b: invokestatic rw/data/Rec0039.m4000 (Lrw/net/PacketBuf;)Lrw/data/Rec0039;
      // 7e: goto a1
      // 81: aload 1
      // 82: invokestatic rw/data/Rec0046.m4000 (Lrw/net/PacketBuf;)Lrw/data/Rec0046;
      // 85: goto a1
      // 88: aload 1
      // 89: invokestatic rw/data/Rec0057.m4000 (Lrw/net/PacketBuf;)Lrw/data/Rec0057;
      // 8c: goto a1
      // 8f: aload 1
      // 90: invokestatic rw/data/Rec0050.m6000 (Lrw/net/PacketBuf;)Lrw/data/Rec0050;
      // 93: goto a1
      // 96: aload 1
      // 97: invokestatic rw/data/Rec0038.m14000 (Lrw/net/PacketBuf;)Lrw/data/Rec0038;
      // 9a: goto a1
      // 9d: aload 1
      // 9e: invokestatic rw/data/Rec0055.m4000 (Lrw/net/PacketBuf;)Lrw/data/Rec0055;
      // a1: astore 8
      // a3: getfield rw/core/C0108.f1000 [Ljava/lang/Object;
      // a6: ldc 1
      // a8: nop
      // a9: nop
      // aa: nop
      // ab: nop
      // ac: aload 8
      // ae: aastore
      // af: return
   }

   public static C0108 m10000(Rec0253 var0) {
      return new C0108((Enum0005)Enum0005.f2000[5], new Rec0055(var0));
   }

   public Iface0031 m12000() {
      return (Iface0031)this.f1000[1];
   }

   public static C0108 m16000(long var0, int var2) {
      return new C0108((Enum0005)Enum0005.f2000[3], new Rec0050(var0, var2));
   }

   public void m18000(PacketBuf var1) {
      var1.m56000(((Enum0005)this.f1000[0]).m32000());
      ((Iface0031)this.f1000[1]).m2000(var1);
   }

   public Enum0005 m20000() {
      return (Enum0005)this.f1000[0];
   }

   public static C0108 m24000(Enum0083 var0, String var1, String var2) {
      return new C0108((Enum0005)Enum0005.f2000[4], new Rec0038(var0.m30000(), var1, var2));
   }

   public static C0108 m26000(Rec0253 var0) {
      return new C0108((Enum0005)Enum0005.f2000[1], new Rec0046(var0));
   }

   public void m28000(Iface0027 var1) {
      var1.m26000(this);
   }

   public static C0108 m30000(long var0) {
      return new C0108((Enum0005)Enum0005.f2000[2], new Rec0057(var0));
   }

   public static C0108 m34000(List<Rec0253> var0) {
      return new C0108((Enum0005)Enum0005.f2000[0], new Rec0039(var0));
   }
}
