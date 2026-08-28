package rw.core;

import rw.api.Iface0029;
import rw.api.Iface0665;
import rw.data.Rec0292;
import rw.data.Rec0293;
import rw.data.Rec0296;
import rw.defs.Enum0097;
import rw.net.PacketBuf;
import rw.net.PacketHandlers;

public class OlkOnipis implements PacketHandlers<Iface0029> {
   public Object[] f1000;

   public Iface0665 m4000() {
      return (Iface0665)this.f1000[1];
   }

   public OlkOnipis(Enum0097 var1, Iface0665 var2) {
      this.m28000();
      this.f1000[0] = var1;
      this.f1000[1] = var2;
   }

   public OlkOnipis() {
      this.m28000();
   }

   static {
      ntfClinit();
   }

   public void m10000(PacketBuf param1) {
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
      // 07: invokestatic rw/defs/Enum0097.m32000 (I)Lrw/defs/Enum0097;
      // 0a: astore 7
      // 0c: getfield rw/core/OlkOnipis.f1000 [Ljava/lang/Object;
      // 0f: ldc 0
      // 11: nop
      // 12: nop
      // 13: nop
      // 14: nop
      // 15: aload 7
      // 17: aastore
      // 18: aload 0
      // 19: getfield rw/core/OlkOnipis.f1000 [Ljava/lang/Object;
      // 1c: ldc 0
      // 1e: nop
      // 1f: nop
      // 20: nop
      // 21: nop
      // 22: aaload
      // 23: checkcast rw/defs/Enum0097
      // 26: ifnonnull 37
      // 29: new java/lang/IllegalStateException
      // 2c: dup
      // 2d: iload 2
      // 2e: invokedynamic makeConcatWithConstants (I)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "Unknown C2SConfigPacket action: \u0001" ]
      // 33: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 36: athrow
      // 37: aload 0
      // 38: aload 0
      // 39: getfield rw/core/OlkOnipis.f1000 [Ljava/lang/Object;
      // 3c: ldc 0
      // 3e: nop
      // 3f: nop
      // 40: nop
      // 41: nop
      // 42: aaload
      // 43: checkcast rw/defs/Enum0097
      // 46: invokevirtual rw/defs/Enum0097.ordinal ()I
      // 49: tableswitch 27 0 2 37 44 51
      // 64: new java/lang/MatchException
      // 67: dup
      // 68: aconst_null
      // 69: aconst_null
      // 6a: invokespecial java/lang/MatchException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 6d: athrow
      // 6e: aload 1
      // 6f: invokestatic rw/data/Rec0292.m4000 (Lrw/net/PacketBuf;)Lrw/data/Rec0292;
      // 72: goto 80
      // 75: aload 1
      // 76: invokestatic rw/data/Rec0293.m4000 (Lrw/net/PacketBuf;)Lrw/data/Rec0293;
      // 79: goto 80
      // 7c: aload 1
      // 7d: invokestatic rw/data/Rec0296.m6000 (Lrw/net/PacketBuf;)Lrw/data/Rec0296;
      // 80: astore 8
      // 82: getfield rw/core/OlkOnipis.f1000 [Ljava/lang/Object;
      // 85: ldc 1
      // 87: nop
      // 88: nop
      // 89: nop
      // 8a: nop
      // 8b: aload 8
      // 8d: aastore
      // 8e: return
   }

   public Enum0097 m12000() {
      return (Enum0097)this.f1000[0];
   }

   public static OlkOnipis m16000(int var0, byte[] var1) {
      return new OlkOnipis((Enum0097)Enum0097.f2000[2], new Rec0296(var0, var1));
   }

   public static OlkOnipis m20000(int var0) {
      return new OlkOnipis((Enum0097)Enum0097.f2000[1], new Rec0293(var0));
   }

   public static OlkOnipis m22000() {
      return new OlkOnipis((Enum0097)Enum0097.f2000[0], new Rec0292());
   }

   public void m24000(Iface0029 var1) {
      var1.m26000(this);
   }

   public void m26000(PacketBuf var1) {
      var1.m56000(((Enum0097)this.f1000[0]).m30000());
      ((Iface0665)this.f1000[1]).m2000(var1);
   }

   private void m28000() {
      if (this.f1000 == null) {
         this.f1000 = new Object[2];
         Object[] var1 = this.f1000;
      }
   }
}
