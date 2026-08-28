package rw.core;

import java.util.List;
import java.util.UUID;
import rw.api.Iface0027;
import rw.api.PermittedSubclassesX;
import rw.data.IlmiOt;
import rw.data.OllIrksj;
import rw.data.Rec0040;
import rw.data.Rec0041;
import rw.data.Rec0047;
import rw.data.Rec0049;
import rw.data.Rec0052;
import rw.data.Rec0256;
import rw.defs.Rename;
import rw.net.PacketBuf;
import rw.net.PacketHandlers;

public class C0113 implements PacketHandlers<Iface0027> {
   public Object[] f1000;

   public C0113(Rename var1, PermittedSubclassesX var2) {
      this.m6000();
      this.f1000[0] = var1;
      this.f1000[1] = var2;
   }

   public C0113() {
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

   public PermittedSubclassesX m10000() {
      return (PermittedSubclassesX)this.f1000[1];
   }

   public static C0113 m12000(Rec0256 var0, int var1, byte[] var2) {
      return new C0113((Rename)Rename.f3000[3], new Rec0041(var0, var1, var2));
   }

   public static C0113 m14000(Rec0256 var0) {
      return new C0113((Rename)Rename.f3000[1], new Rec0052(var0));
   }

   public void m16000(PacketBuf param1) {
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
      // 07: invokestatic rw/defs/Rename.m36000 (I)Lrw/defs/Rename;
      // 0a: astore 7
      // 0c: getfield rw/core/C0113.f1000 [Ljava/lang/Object;
      // 0f: ldc 0
      // 11: nop
      // 12: nop
      // 13: nop
      // 14: nop
      // 15: aload 7
      // 17: aastore
      // 18: aload 0
      // 19: getfield rw/core/C0113.f1000 [Ljava/lang/Object;
      // 1c: ldc 0
      // 1e: nop
      // 1f: nop
      // 20: nop
      // 21: nop
      // 22: aaload
      // 23: checkcast rw/defs/Rename
      // 26: ifnonnull 37
      // 29: new java/lang/IllegalStateException
      // 2c: dup
      // 2d: iload 2
      // 2e: invokedynamic makeConcatWithConstants (I)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "Unknown S2CPresetPacket action: \u0001" ]
      // 33: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 36: athrow
      // 37: aload 0
      // 38: aload 0
      // 39: getfield rw/core/C0113.f1000 [Ljava/lang/Object;
      // 3c: ldc 0
      // 3e: nop
      // 3f: nop
      // 40: nop
      // 41: nop
      // 42: aaload
      // 43: checkcast rw/defs/Rename
      // 46: invokevirtual rw/defs/Rename.ordinal ()I
      // 49: tableswitch 43 0 6 53 60 67 74 81 88 95
      // 74: new java/lang/MatchException
      // 77: dup
      // 78: aconst_null
      // 79: aconst_null
      // 7a: invokespecial java/lang/MatchException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 7d: athrow
      // 7e: aload 1
      // 7f: invokestatic rw/data/Rec0047.m8000 (Lrw/net/PacketBuf;)Lrw/data/Rec0047;
      // 82: goto ac
      // 85: aload 1
      // 86: invokestatic rw/data/Rec0052.m6000 (Lrw/net/PacketBuf;)Lrw/data/Rec0052;
      // 89: goto ac
      // 8c: aload 1
      // 8d: invokestatic rw/data/IlmiOt.m12000 (Lrw/net/PacketBuf;)Lrw/data/IlmiOt;
      // 90: goto ac
      // 93: aload 1
      // 94: invokestatic rw/data/Rec0041.m12000 (Lrw/net/PacketBuf;)Lrw/data/Rec0041;
      // 97: goto ac
      // 9a: aload 1
      // 9b: invokestatic rw/data/OllIrksj.m6000 (Lrw/net/PacketBuf;)Lrw/data/OllIrksj;
      // 9e: goto ac
      // a1: aload 1
      // a2: invokestatic rw/data/Rec0040.m8000 (Lrw/net/PacketBuf;)Lrw/data/Rec0040;
      // a5: goto ac
      // a8: aload 1
      // a9: invokestatic rw/data/Rec0049.m12000 (Lrw/net/PacketBuf;)Lrw/data/Rec0049;
      // ac: astore 8
      // ae: getfield rw/core/C0113.f1000 [Ljava/lang/Object;
      // b1: ldc 1
      // b3: nop
      // b4: nop
      // b5: nop
      // b6: nop
      // b7: aload 8
      // b9: aastore
      // ba: return
   }

   public static C0113 m18000(List<Rec0256> var0) {
      return new C0113((Rename)Rename.f3000[0], new Rec0047(var0));
   }

   public static C0113 m20000(Rec0256 var0) {
      return new C0113((Rename)Rename.f3000[5], new Rec0040(var0));
   }

   public Rename m24000() {
      return (Rename)this.f1000[0];
   }

   public void m26000(Iface0027 var1) {
      var1.m4000(this);
   }

   public static C0113 m28000(Rec0256 var0, int var1, byte[] var2) {
      return new C0113((Rename)Rename.f3000[2], new IlmiOt(var0, var1, var2));
   }

   public static C0113 m30000(long var0) {
      return new C0113((Rename)Rename.f3000[4], new OllIrksj(var0));
   }

   public void m32000(PacketBuf var1) {
      var1.m56000(((Rename)this.f1000[0]).m38000());
      ((PermittedSubclassesX)this.f1000[1]).m2000(var1);
   }

   public static C0113 m34000(long var0, UUID var2, int var3) {
      return new C0113((Rename)Rename.f3000[6], new Rec0049(var0, var2, var3));
   }
}
