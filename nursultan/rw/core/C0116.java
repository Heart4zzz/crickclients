package rw.core;

import java.util.List;
import rw.api.Iface0027;
import rw.api.PermittedSubclasses;
import rw.data.Iltnotrs;
import rw.data.Rec0044;
import rw.data.Rec0045;
import rw.data.Rec0051;
import rw.data.Rec0168;
import rw.defs.Enum0006;
import rw.net.PacketBuf;
import rw.net.PacketHandlers;

public class C0116 implements PacketHandlers<Iface0027> {
   public Object[] f1000;

   public C0116() {
      this.m4000();
   }

   public C0116(Enum0006 var1, PermittedSubclasses var2) {
      this.m4000();
      this.f1000[0] = var1;
      this.f1000[1] = var2;
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

   public Enum0006 m8000() {
      return (Enum0006)this.f1000[0];
   }

   public void m12000(PacketBuf param1) {
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
      // 07: invokestatic rw/defs/Enum0006.m32000 (I)Lrw/defs/Enum0006;
      // 0a: astore 7
      // 0c: getfield rw/core/C0116.f1000 [Ljava/lang/Object;
      // 0f: ldc 0
      // 11: nop
      // 12: nop
      // 13: nop
      // 14: nop
      // 15: aload 7
      // 17: aastore
      // 18: aload 0
      // 19: getfield rw/core/C0116.f1000 [Ljava/lang/Object;
      // 1c: ldc 0
      // 1e: nop
      // 1f: nop
      // 20: nop
      // 21: nop
      // 22: aaload
      // 23: checkcast rw/defs/Enum0006
      // 26: ifnonnull 37
      // 29: new java/lang/IllegalStateException
      // 2c: dup
      // 2d: iload 2
      // 2e: invokedynamic makeConcatWithConstants (I)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "Unknown S2CConfigPacket action: \u0001" ]
      // 33: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 36: athrow
      // 37: aload 0
      // 38: aload 0
      // 39: getfield rw/core/C0116.f1000 [Ljava/lang/Object;
      // 3c: ldc 0
      // 3e: nop
      // 3f: nop
      // 40: nop
      // 41: nop
      // 42: aaload
      // 43: checkcast rw/defs/Enum0006
      // 46: invokevirtual rw/defs/Enum0006.ordinal ()I
      // 49: tableswitch 31 0 3 41 48 55 62
      // 68: new java/lang/MatchException
      // 6b: dup
      // 6c: aconst_null
      // 6d: aconst_null
      // 6e: invokespecial java/lang/MatchException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 71: athrow
      // 72: aload 1
      // 73: invokestatic rw/data/Rec0045.m4000 (Lrw/net/PacketBuf;)Lrw/data/Rec0045;
      // 76: goto 8b
      // 79: aload 1
      // 7a: invokestatic rw/data/Iltnotrs.m8000 (Lrw/net/PacketBuf;)Lrw/data/Iltnotrs;
      // 7d: goto 8b
      // 80: aload 1
      // 81: invokestatic rw/data/Rec0051.m6000 (Lrw/net/PacketBuf;)Lrw/data/Rec0051;
      // 84: goto 8b
      // 87: aload 1
      // 88: invokestatic rw/data/Rec0044.m6000 (Lrw/net/PacketBuf;)Lrw/data/Rec0044;
      // 8b: astore 8
      // 8d: getfield rw/core/C0116.f1000 [Ljava/lang/Object;
      // 90: ldc 1
      // 92: nop
      // 93: nop
      // 94: nop
      // 95: nop
      // 96: aload 8
      // 98: aastore
      // 99: return
   }

   public void m14000(PacketBuf var1) {
      var1.m56000(((Enum0006)this.f1000[0]).m34000());
      ((PermittedSubclasses)this.f1000[1]).m2000(var1);
   }

   public static C0116 m16000(List<Rec0168> var0) {
      return new C0116((Enum0006)Enum0006.f3000[0], new Rec0045(var0));
   }

   public PermittedSubclasses m18000() {
      return (PermittedSubclasses)this.f1000[1];
   }

   public void m24000(Iface0027 var1) {
      var1.m6000(this);
   }

   public static C0116 m26000(int var0, long var1, byte[] var3) {
      return new C0116((Enum0006)Enum0006.f3000[1], new Iltnotrs(var0, var1, var3));
   }

   public static C0116 m28000(int var0, long var1) {
      return new C0116((Enum0006)Enum0006.f3000[2], new Rec0051(var0, var1));
   }

   public static C0116 m30000(int var0, int var1) {
      return new C0116((Enum0006)Enum0006.f3000[3], new Rec0044(var0, var1));
   }
}
